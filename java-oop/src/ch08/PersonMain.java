package ch08;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("admin", "1234");
//		p1.m11();
//		p1.m11a();
//		
//		Calendar c = Calendar.getInstance();
//		int hour = c.get(Calendar.HOUR);
//		p1.m12(hour);
//		p1.m12a(false);
//		// 매개변수로 값이 전달
//		boolean x = false;
//		p1.m12a(x);
//		System.out.println(x);
//		
//		p1.m13a("홍길동");
//		String name = "신사임당";
//		p1.m13a(name);
//		p1.m13b("guest", "0000");
//		
//		int[] arr = new int[5];
//		p1.m14a(arr);
//		for (int i = 0; i < arr.length-1; i++) {
//			System.out.print(arr[i] + ",");
//		}
//		System.out.println(arr[arr.length -1]);
//		
//		String[] names = new String[2];
//		names[0] = "루피";
//		names[1] = "조로";
//		p1.m15a(names);
//		
//		Data d = new Data(7, 7);
//		p1.m16a(d);
//		System.out.println(d.x + ", " + d.y);
//	
//		Data[] datas = new Data[4];
//		datas[0] = new Data(13, 100);
//		datas[1] = new Data(23, 200);
//		datas[2] = new Data(20, 300);
//		datas[3] = new Data(39, 400);
//		p1.m17a(datas);
//		p1.m17b(datas, 200);
		
		ArrayList<Integer> year = new ArrayList<Integer>();
		int y = 2000;
		for (int i = 0; i <= 50; i++) {
			year.add(y + i);
		}
		p1.m18a(year);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "샹크스");
		map.put("age", 40);
		String[] myhobby = {"술", "견문색", "검도"};
		map.put("hobby", myhobby);
		Data mydata = new Data(7, 11);
		map.put("data", mydata);
		p1.m19a(map);

		
	}
}
