package kodlamaIoHomework.loging;

public class DatabaseLogger implements Logger {

	public void log(String data) {
		System.out.println("veritabanýna loglandý." + data);
		
	}

}
