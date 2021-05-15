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



public class ProductoController {
    private static final String INDEX ="Producto/create"; 
    private static String MODEL_CONTACT="client";
    
    private final ProductoRepository productoData;

    public ProductoController(ProductoRepository productoData){
       
        this.productoData = productoData;
   }
    @GetMapping("/")
    public String index(Model model) {
        Producto producto = new Producto();
        model.addAttribute("Producto", producto);
        return INDEX;
      
    }
       

    
    @PostMapping("/Producto/create")
    public String submitCreationForm(Model model,
        @Valid Producto objProducto, BindingResult result) {
        if (!result.hasErrors()) {
            this.productoData.save(objProducto);
            model.addAttribute("Producto", objProducto);
            model.addAttribute("message", "Se registro satisfactoriamente");
        }else{
            model.addAttribute("message", "Por favor envie los datos correctos");
        }
        return INDEX;
    }

}