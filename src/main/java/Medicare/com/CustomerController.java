package Medicare.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class CustomerController {
	@Autowired
	CustomerDao CxDao;
	
	@PostMapping("/CreateCx")
	public Customer createCx(@RequestBody Customer customer) {
		System.out.println("Inside"+customer.getCxAge());
		return CxDao.createCx(customer);
	}
	
	@GetMapping("/findCxByUsername/{CxUsername}")
	public Customer findCxByUsername(@PathVariable String CxUsername) {
		return CxDao.findCustomerByUsername(CxUsername);
	}
	
	@PostMapping("/AddToCart")
	public OrderList AddToCart(@RequestBody OrderList OrderDetail) {
		return CxDao.AddToCart(OrderDetail);
	}
	
	@GetMapping("/CxCartDetail/{CxUsername}")
	public List<OrderList> CxCartDetail(@PathVariable String CxUsername){
		return CxDao.CxCartDetail(CxUsername);
	}
	
}
