package usmp.computo.tiendacomputo.domain;


import javax.persistence.Entity;
import javax.persistence.GenerationType;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class Usuario{

  
	@GeneratedValue (strategy = GenerationType.IDENTITY)

	@Id
	private Integer id;

    private String Usuario;
    private String Password;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return this.Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }


}