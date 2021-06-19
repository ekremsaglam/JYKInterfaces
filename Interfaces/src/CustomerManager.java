
public class CustomerManager {
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M�steri eklendi " + customer.getFirstName());
		
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
	
	public void delete (Customer customer) {
		System.out.println("M�steri silindi " + customer.getFirstName() );

		Utils.RunLoggers(loggers, customer.getFirstName());
	}
}

