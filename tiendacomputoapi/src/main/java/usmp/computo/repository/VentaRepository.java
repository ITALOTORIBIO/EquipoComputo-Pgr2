package usmp.computo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usmp.computo.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta,Integer>{

    
}
