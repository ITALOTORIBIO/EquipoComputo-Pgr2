package usmp.computo.tiendacomputo.domain;


import javax.persistence.Entity;
import javax.persistence.GenerationType;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class Producto{

    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;

    private String name;
    private String img;
    private double precio;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getname() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public double getPrecio() {
        return this.precio;
    }

    public void setImg(double precio) {
        this.precio = precio;
    }
}