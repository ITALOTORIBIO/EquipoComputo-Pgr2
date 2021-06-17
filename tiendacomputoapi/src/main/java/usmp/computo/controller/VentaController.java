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
@RequestMapping(value = "api/Venta", produces = "application/json")
public class VentaController {

    private VentaRepository VentaRepository;
     
    
    
    public VentaController(VentaRepository VentaRepository){
        this.VentaRepository = VentaRepository;
    }

    @GetMapping(value = "/Venta", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Venta>> Ventas(){
        return  new ResponseEntity<List<Venta>>(
            VentaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/Create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> create(@RequestBody Venta e){
        VentaRepository.save(e);
        VentaRepository.flush();
        return new ResponseEntity<Integer>(e.getId(),HttpStatus.CREATED);
    }
    @DeleteMapping(value = "/Delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delete(@PathVariable int id){
        VentaRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PutMapping(value = "/Update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Venta> update(@RequestBody Venta e){
        create(e);
        return new ResponseEntity<Venta>(HttpStatus.OK);
    }
    @GetMapping(value = "/Venta/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Venta> Ventas(@PathVariable int id){
        Optional<Venta> optinalEntity = VentaRepository.findById(id);
        if(optinalEntity.isPresent())
            return new ResponseEntity<Venta>(
                optinalEntity.get(), HttpStatus.OK);
        else
            return new ResponseEntity<Venta>(HttpStatus.NOT_FOUND);
    }



}