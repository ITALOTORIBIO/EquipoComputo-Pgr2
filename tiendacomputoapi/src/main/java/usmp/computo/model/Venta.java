package usmp.computo.model;


import javax.persistence.Entity;
import javax.persistence.GenerationType;

import javax.persistence.GeneratedValue;
import java.util.Date;
import java.math.BigDecimal;

import javax.persistence.Id;

@Entity
public class Venta{

	@GeneratedValue (strategy = GenerationType.IDENTITY)

	@Id
    private int id;
    private String CodCliente;
    private String IdProducto;
    private String NombreProducto;
    private Integer Cantidad;
    private Date Fecha;
    private Double PrecioTotal;

	

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCodCliente() {
    return this.CodCliente;
  }

  public void setCodCliente(String CodCliente) {
    this.CodCliente = CodCliente;
  }

  public String getIdProducto() {
    return this.IdProducto;
  }

  public void setIdProducto(String IdProducto) {
    this.IdProducto = IdProducto;
  }

  public String getNombreProducto() {
    return this.NombreProducto;
  }

  public void setNombreProducto(String NombreProducto) {
    this.NombreProducto = NombreProducto;
  }

  public Integer getCantidad() {
    return this.Cantidad;
  }

  public void setCantidad(Integer Cantidad) {
    this.Cantidad = Cantidad;
  }

  public Date getFecha() {
    return this.Fecha;
  }

  public void setFecha(Date Fecha) {
    this.Fecha = Fecha;
  }

  public Double getPrecioTotal() {
    return this.PrecioTotal;
  }

  public void setPrecioTotal(Double PrecioTotal) {
    this.PrecioTotal = PrecioTotal;
  }
    
    

}