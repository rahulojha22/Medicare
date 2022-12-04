package Medicare.com;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<OrderList, String> {
	@Query("select OrderList from OrderList OrderList where prodPurchaseDate between ?1 and ?2")
	public List<OrderList> findOrderListByDate(LocalDate StartDate, LocalDate EndDate);
	
	@Query("select OrderList from OrderList OrderList where CxUsername=?1")	
	public List<OrderList> findOrderList(String CxUsername);

}
