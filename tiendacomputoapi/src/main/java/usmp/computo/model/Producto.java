package usmp.computo.model;


import javax.persistence.Entity;
import javax.persistence.GenerationType;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class Producto{

	@GeneratedValue (strategy = GenerationType.IDENTITY)

	@Id
	private Integer id;

    private String Nombre;
    private String Descripcion;
     private String Categoria;
     private String Imagen;
    private Double Precio;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCategoria() {
        return this.Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    public String getImagen() {
        return this.Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public Double getPrecio() {
        return this.Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

}