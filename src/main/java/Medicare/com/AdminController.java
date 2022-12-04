package Medicare.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class AdminController {
	@Autowired
	AdminDao AdDao;
	
	@Autowired
	CustomerDao CxDao;
	
	@GetMapping("/findAdByUsername/{AdUsername}")
	public Admin findAdByUsername(@PathVariable String AdUsername) {
		Admin admin=new Admin();
		admin=AdDao.findAdminByUsername(AdUsername);
		return admin;
	}
	
	@PostMapping("/insertMedicine")
	public Product insertMedicine(@RequestBody Product product) {
		return AdDao.AddProduct(product);
	}
	
	@GetMapping("/MedicineList")
	public List<Product> MedicineList(){
		return AdDao.getProduct();
	}
	
	@DeleteMapping("/deleteMedicine/{prodID}")
	public String deleteMedicine(@PathVariable String prodID) {
		AdDao.DeleteProduct(prodID);
		return "Deleted";
	}
	
	@PutMapping("/MedicineUpdate")
	public Product MedicineUpdate(@RequestBody Product productDetail) {
		Product product=AdDao.FindProdByID(productDetail.getProdID());
		product.setProdStock(productDetail.getProdStock());
		product.setStripPrice(productDetail.getStripPrice());
		product.setProdStatus(productDetail.getProdStatus());
		return AdDao.AddProduct(product);
	}
	
	@GetMapping("/CxList")
	public List<Customer> CxList(){
		return CxDao.getCxList();
	}
	
	@GetMapping("/PurchaseList")
	public List<OrderList> PurchaseList(@RequestBody PurchaseDates PurDates){
		return AdDao.OrderListByDate(PurDates.getStartDate(), PurDates.getEndDate());
	}

}
