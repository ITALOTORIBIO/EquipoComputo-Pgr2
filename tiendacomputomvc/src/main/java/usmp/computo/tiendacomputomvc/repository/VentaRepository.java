package usmp.computo.tiendacomputomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usmp.computo.tiendacomputomvc.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta,String>{
    
}