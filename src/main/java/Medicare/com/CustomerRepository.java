package Medicare.com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	@Query("select Customer from Customer Customer where CxUsername=?1")
	public Customer findCustomerByUsername(String CxUsername);

}
