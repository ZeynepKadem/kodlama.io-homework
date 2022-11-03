package kodlamaIoHomework.entities;

public class Instructor {
	private int id;
	private String firstName;
	private String lastNamme;
	private String password;
	
	
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastNamme, String password) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastNamme = lastNamme;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNamme() {
		return lastNamme;
	}

	public void setLastNamme(String lastNamme) {
		this.lastNamme = lastNamme;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
