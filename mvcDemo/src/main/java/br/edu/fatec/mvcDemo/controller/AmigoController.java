package br.edu.fatec.mvcDemo.controller;

import br.edu.fatec.mvcDemo.modelo.Amigo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/amigos")

public class AmigoController {
        public AmigoController() {
            amigos.add(new Amigo("Vitinho","Bigodin"));
            amigos.add(new Amigo("Victor Augusto","QM"));
            amigos.add(new Amigo("Victor Hugo","Golias"));
        }
        private static final List<Amigo> amigos = new ArrayList<Amigo>();
        @GetMapping
        public String getAmigos(Model model){
            model.addAttribute("amigos",amigos);
            return "amigos";
        }
}

