package usmp.computo.tiendacomputomvc.model;

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
@Table(name = "Producto")
public class Producto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
    private String Nombre;
    private String Descripcion;
     private String Categoria;
     private String Imagen;
    private Double Precio;

  }