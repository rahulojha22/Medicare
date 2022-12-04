package Medicare.com;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	private String prodID;
	private String prodName;
	private String prodCategory;
	private int prodStock;
	private String prodCompany;
	private int stripPrice;
	private String prodStatus;

}
