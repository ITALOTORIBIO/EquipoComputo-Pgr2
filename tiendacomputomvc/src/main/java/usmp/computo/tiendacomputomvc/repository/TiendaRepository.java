package usmp.computo.tiendacomputomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usmp.computo.tiendacomputomvc.domain.Tienda;

@Repository
public interface TiendaRepository extends JpaRepository<Tienda,String>{
    
}