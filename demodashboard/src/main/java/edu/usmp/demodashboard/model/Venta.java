package edu.usmp.demodashboard.model;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Venta") 

public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String CodCliente;
    private String IdProducto;
    private String NombreProducto;
    private Integer Cantidad;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date Fecha;
    private BigDecimal PrecioTotal;
    
}
