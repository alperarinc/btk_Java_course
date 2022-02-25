package springIntro;

public class H2SqlCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("H2Sql Veritabanýna eklendi");
		
	}

}
