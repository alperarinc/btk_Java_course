package springIntro;

public class SqlCustomerDal implements ICustomerDal{
String connectionString;
	
	
	

	public String getConnectionString() {
		return connectionString;
	}




	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}


	public void add() {
		System.out.println("Connection String :" + this.connectionString);	
		System.out.println("SQL Veritaban�na eklendi");
		
	}
}
