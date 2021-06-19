
public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(),new EmailLogger(),new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer ekrem = new Customer(1,"Ekrem", "Saglam");
		customerManager.add(ekrem);

	}

}
