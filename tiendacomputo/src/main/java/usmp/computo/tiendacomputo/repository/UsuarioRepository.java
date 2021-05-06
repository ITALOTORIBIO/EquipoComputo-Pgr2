package usmp.computo.tiendacomputo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usmp.computo.tiendacomputo.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

    
}