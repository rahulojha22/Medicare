package Medicare.com;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDao {
	@Autowired
	AdminRepository AdminRepo;
	
	@Autowired
	ProductRepository ProdRepo;
	
	@Autowired
	OrderRepository OrderRepo;
	
	public Admin findAdminByUsername(String AdUsername) {
		return AdminRepo.findAdminByUsername(AdUsername);
	}
	
	public Product AddProduct(Product product) {
		return ProdRepo.save(product);
	}
	
	public List<Product> getProduct(){
		return ProdRepo.findAll();
	}
	
	public String DeleteProduct(String prodID) {
		ProdRepo.deleteById(prodID);
		return "Deleted";
	}
	
	public Product FindProdByID(String prodID) {
		return ProdRepo.findProdByProdID(prodID);
	}
	
	public List<OrderList> OrderListByDate(LocalDate StartDate, LocalDate EndDate){
		return OrderRepo.findOrderListByDate(StartDate, EndDate);
	}

}
