package encapsulation_programs;

class Gmail
{
   private String username = "vinu";
	private String password = "abc123";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

public class Vineeth {

	public static void main(String[] args) 
	{
		Gmail g = new Gmail();
		System.out.println("My old username and password is.\n");
		System.out.println(g.getUsername());
		System.out.println(g.getPassword());
		
		g.setUsername("vineeth");
		g.setPassword("123abc");
		
		System.out.println("My new username and password is.\n");
		System.out.println(g.getUsername());
		System.out.println(g.getPassword());

	}
}
