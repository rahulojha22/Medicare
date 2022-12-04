package Medicare.com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends JpaRepository<Admin, String> {
	@Query("select Admin from Admin Admin where AdUsername=?1")	
	public Admin findAdminByUsername(String AdUsername);

}
