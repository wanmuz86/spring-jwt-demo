package my.mimos.apijwt.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import my.mimos.apijwt.entity.Role;
import my.mimos.apijwt.entity.User;

public interface RoleRepository extends JpaRepository<Role, Integer>  {

}
