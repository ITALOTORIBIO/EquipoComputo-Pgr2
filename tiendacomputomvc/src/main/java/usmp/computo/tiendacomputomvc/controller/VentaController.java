package usmp.computo.tiendacomputomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import usmp.computo.tiendacomputomvc.model.Venta;
import usmp.computo.tiendacomputomvc.repository.*;
import usmp.computo.tiendacomputomvc.repository.VentaRepository;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
public class VentaController {

    private static final String INDEX ="Ventas/index"; 
    private static String MODEL_CONTACT="client";
    
    private final VentaRepository ventaData;

    public VentaController(VentaRepository ventaData){
        this.ventaData = ventaData;
    }

    @GetMapping("/Ventas")
    public String index(Model model) {
        List<Venta> ventaDB = this.ventaData.findAll();
        model.addAttribute("Ventas", ventaDB);
        return INDEX;      
    }


}