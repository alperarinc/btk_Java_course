package springintro;

public class H2SqlCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("H2Sql Veritabanưna eklendi");
		
	}

}
