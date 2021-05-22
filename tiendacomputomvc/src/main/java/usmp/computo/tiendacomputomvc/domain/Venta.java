package usmp.computo.tiendacomputomvc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.math.BigDecimal;
import java.util.Date;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Venta") 
public class Venta{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String CodCliente;
    private String IdProducto;
    private String NombreProducto;
    private String Cantidad;
    private Date Fecha;
    private Double PrecioTotal;

  }