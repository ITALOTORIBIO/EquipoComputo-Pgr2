package usmp.computo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
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
import usmp.computo.model.*;
import usmp.computo.repository.*;



@RestController
@RequestMapping(value = "api/producto", produces = "application/json")
public class ProductoController {

    private ProductoRepository ProductoRepository;
     
    
    
    public ProductoController(ProductoRepository ProductoRepository){
        this.ProductoRepository = ProductoRepository;
    }

    @GetMapping(value = "/Producto", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Producto>> Productos(){
        return  new ResponseEntity<List<Producto>>(
            ProductoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/Producto", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> create(@RequestBody Producto e){
        ProductoRepository.save(e);
        ProductoRepository.flush();
        return new ResponseEntity<Integer>(e.getId(),HttpStatus.CREATED);
    }
    @DeleteMapping(value = "/Producto/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delete(@PathVariable int id){
        ProductoRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PutMapping(value = "/Producto", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Producto> update(@RequestBody Producto e){
        create(e);
        return new ResponseEntity<Producto>(HttpStatus.OK);
    }
    @GetMapping(value = "/Producto/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Producto> Productos(@PathVariable int id){
        Optional<Producto> optinalEntity = ProductoRepository.findById(id);
        if(optinalEntity.isPresent())
            return new ResponseEntity<Producto>(
                optinalEntity.get(), HttpStatus.OK);
        else
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
    }



}