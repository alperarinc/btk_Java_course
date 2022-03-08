package springIntro;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal customerDal;
	
	//constructor injection
//	public CustomerManager(ICustomerDal customerDal) {
//		
//		this.customerDal = customerDal;
//	}

	//i� kurallar�
	public void add() {
		customerDal.add();
	}
	//setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

}
