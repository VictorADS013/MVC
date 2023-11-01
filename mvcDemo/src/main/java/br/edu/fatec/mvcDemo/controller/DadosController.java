package br.edu.fatec.mvcDemo.controller;

import br.edu.fatec.mvcDemo.modelo.Amigo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

    @RestController
    @RequestMapping("api/amigos")
    public class DadosController {
        private static final List<Amigo>
                amigos = new ArrayList<Amigo>();

        public DadosController() {
            amigos.add(new Amigo("Vitinho","Bigodin"));
            amigos.add(new Amigo("Victor Augusto","QM"));
            amigos.add(new Amigo("Victor Hugo","Golias"));
        }

        @GetMapping
        public List<Amigo> getAmigos()
        {
            return amigos;
        }
    }
