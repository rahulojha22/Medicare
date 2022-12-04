package Medicare.com;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class OrderList {
	@Id
	private String orderID;
	private String CxUsername;
	private String prodID;
	private String prodName;
	private String prodCategory;
	private String prodCompany;
	private int stripQuantity;
	private int orderAmount;
	private String DeliveryAddress;
	private LocalDate prodPurchaseDate;
	private String OrderStatus;

}
