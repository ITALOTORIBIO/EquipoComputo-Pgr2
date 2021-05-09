package usmp.computo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usmp.computo.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

    
}