package usmp.computo.tiendacomputo.web;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.*;
import usmp.computo.tiendacomputo.domain.*;
import usmp.computo.tiendacomputo.repository.*;



@RestController
public class UsuarioController {

    private UsuarioRepository UsuarioRepository;
     
    
    
    public UsuarioController(UsuarioRepository UsuarioRepository){
        this.UsuarioRepository = UsuarioRepository;
    }

    @GetMapping(value = "/Usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Usuario>> Usuarios(){
        return  new ResponseEntity<List<Usuario>>(
            UsuarioRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/Usuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> create(@RequestBody Usuario e){
        UsuarioRepository.save(e);
        UsuarioRepository.flush();
        return new ResponseEntity<Integer>(e.getId(),HttpStatus.CREATED);
    }
    @DeleteMapping(value = "/Usuario/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delete(@PathVariable int id){
        UsuarioRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PutMapping(value = "/Usuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usuario> update(@RequestBody Usuario e){
        create(e);
        return new ResponseEntity<Usuario>(HttpStatus.OK);
    }
    @GetMapping(value = "/Usuario/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usuario> Usuarios(@PathVariable int id){
        Optional<Usuario> optinalEntity = UsuarioRepository.findById(id);
        if(optinalEntity.isPresent())
            return new ResponseEntity<Usuario>(
                optinalEntity.get(), HttpStatus.OK);
        else
            return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
    }



}