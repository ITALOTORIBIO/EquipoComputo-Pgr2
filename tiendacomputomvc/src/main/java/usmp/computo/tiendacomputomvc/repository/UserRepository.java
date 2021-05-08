package usmp.computo.tiendacomputomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usmp.computo.tiendacomputomvc.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
    
}