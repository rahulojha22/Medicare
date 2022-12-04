 package Medicare.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CxId;
	@Column(unique = true)
	private String CxUsername;
	private String CxPassword;
	private String CxFirstName;
	private String CxLastName;
	private String CxGender;
	private int CxAge;
	@Column(unique = true)
	private String CxEmail;
	@Column(unique = true)
	private long CxMobNumber;

}
