package ch10;
import java.sql.*;
import java.util.*;
import dto.Actor;

public class ActorDAO {
	// Actor 테이블 데이터 입력
	public int insertActor(Actor actor) throws ClassNotFoundException, SQLException {
		int row = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "insert into actor (first_name, last_name) values (?, ?)";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "java1234");
		
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, actor.getFirstName());
		stmt.setString(2, actor.getLastName());
		System.out.println(stmt);
		row = stmt.executeUpdate();
		
		conn.close();
		return row;
	}
	
	// Actor 테이블 데이터 조회
	public ArrayList<Actor> selectActorList(int limit) throws ClassNotFoundException, SQLException {
		ArrayList<Actor> list = new ArrayList<Actor>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select actor_id actorId, first_name firstName, last_name lastName, last_update lastUpdate from actor order by actor_id desc limit ?";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "java1234");
		stmt = conn.prepareStatement(sql);
		stmt.setInt(1, limit);
		rs = stmt.executeQuery();
		
		while (rs.next()) {
			Actor a = new Actor();
			a.setActorId(rs.getInt("actorId"));
			a.setFirstName(rs.getString("firstName"));
			a.setLastName(rs.getString("lastName"));
			a.setLastUpate(rs.getString("lastUpdate"));
			
			list.add(a);
		}
		
		conn.close();
		return list;
	}
}
