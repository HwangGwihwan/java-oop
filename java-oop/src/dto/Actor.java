package dto;

public class Actor {
	private Integer actorId;
	private String firstName;
	private String lastName;
	private String lastUpate;
	
	public Integer getActorId() {
		return actorId;
	}
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastUpate() {
		return lastUpate;
	}
	public void setLastUpate(String lastUpate) {
		this.lastUpate = lastUpate;
	}
	
	public Actor() {
	}
	
	public Actor(Integer actorId, String firstName, String lastName, String lastUpate) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpate = lastUpate;
	}
}
