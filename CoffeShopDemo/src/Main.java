import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter()) ;

		customerManager.save(new Customer(1,"Özge","Odabaþ",LocalDate.of(1999, 11, 26),"65491327692"));
	}

}
