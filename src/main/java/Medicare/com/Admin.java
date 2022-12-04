package Medicare.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Admin {
	@Id
	private String AdUsername;
	private String AdPassword;
	private String AdFirstName;
	private String AdLastName;
	private String AdGender;
	private int AdAge;
	@Column(unique = true)
	private String AdEmail;
	@Column(unique = true)
	private long AdMobNumber;

}
