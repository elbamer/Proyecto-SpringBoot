package com.disenotuweb.rolesSecurity.controller;
// https://mvnrepository.com/artifact/javax.validation/validation-api

import javax.validation.Valid;
import com.disenotuweb.rolesSecurity.interfaceService.IEmpleadoService;
import com.disenotuweb.rolesSecurity.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import com.disenotuweb.rolesSecurity.serviceInterface.IPersonaService;
@Service
@Controller
@RequestMapping
public class EmpleadoController {

    @Autowired
    private IEmpleadoService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("empleados", service.listar());
        return "indexEmpleado";
    }
    @GetMapping("/listar/{id}")
    public String listarId(@PathVariable int id, Model model) {
        model.addAttribute("empleado", service.listarId(id));
        return "form";
    }

    @GetMapping("/new")
    public String nuevo(Model model) {
        model.addAttribute("persona", new Empleado());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Valid Empleado p,Model model) {
        int id=service.save(p);
        if(id==0) {
            return "form";
        }
        return "redirect:/listar";
    }
    @GetMapping("/delete/{id}")
    public String eliminar(@PathVariable int id,Model model) {
        service.delete(id);
        return "redirect:/listar";
    }

}
