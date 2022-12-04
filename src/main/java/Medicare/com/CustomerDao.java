package Medicare.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@Service
public class CustomerDao {
	@Autowired
	CustomerRepository CxRepo;
	
	@Autowired
	OrderRepository OrderRepo;
	
	public Customer createCx(Customer cx) {
		return CxRepo.save(cx);
	}	
	
	public Customer findCustomerByUsername(String CxUsername) {
		return CxRepo.findCustomerByUsername(CxUsername);
	}
	
	public List<Customer> getCxList(){
		return CxRepo.findAll();
	}
	
	public OrderList AddToCart(OrderList OrderDetail) {
		return OrderRepo.save(OrderDetail);
	}
	
	public List<OrderList> CxCartDetail(String CxUsername){
		return OrderRepo.findOrderList(CxUsername);
	}

}
