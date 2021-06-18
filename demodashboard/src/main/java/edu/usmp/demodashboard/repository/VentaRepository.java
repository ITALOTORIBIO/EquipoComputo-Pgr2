package edu.usmp.demodashboard.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.usmp.demodashboard.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta,String>{
    
    @Query("SELECT NombreProducto as nombre,SUM(v.PrecioTotal) as montoTotal FROM Venta v GROUP BY v.NombreProducto")
    List<Map<String, Object>> queryByfecha();

    // SELECT p.tipoTarjeta as tipoTarjeta,SUM(p.montoTotal) as montoTotal FROM Payment p GROUP BY p.tipoTarjeta
    
}
