package usmp.computo.tiendacomputomvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import usmp.computo.tiendacomputomvc.domain.Producto;
import usmp.computo.tiendacomputomvc.repository.*;
import usmp.computo.tiendacomputomvc.repository.ProductoRepository;

import java.util.Optional;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller



public class TiendaController {
    
    private Tiendarepository Tiendarepository;

    public TiendaController(Tiendarepository Tiendarepository){
        this.Tiendarepository = Tiendarepository;
    }


    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<list<Tienda>> Tienda(){
        return new ResponseEntity<list<Tienda>>(
            Tiendarepository.findAll(), httpStatus.OK);
    }
}
