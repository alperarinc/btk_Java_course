package springIntro;

public class H2SqlCustomerDal implements ICustomerDal {
String connectionString;
	
	
	

	public String getConnectionString() {
		return connectionString;
	}




	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}



	public void add() {
		System.out.println("Connection String :" + this.connectionString);	
		System.out.println("H2Sql Veritabanưna eklendi");
		
	}

}
