package usmp.computo.tiendacomputomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usmp.computo.tiendacomputomvc.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,String>{
    
}