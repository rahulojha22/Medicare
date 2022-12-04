package Medicare.com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, String> {
	@Query("select Product from Product Product where prodID=?1")	
	public Product findProdByProdID(String prodID);

}
