package com.cursojava.aulaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message","Bem-vindo ao curso Java Web");

        return "index";

    }
    
@GetMapping("/perfil")
public String perfil(Model model){
    model.addAttribute("nome", "Marina");
    model.addAttribute("idade", 26);
    model.addAttribute("curso", "Java Web");

    return "perfil";

    }

@GetMapping("/aluno")
public String aluno(Model model){
    model.addAttribute("nome", "Ana");
    model.addAttribute("idade", 21);
    model.addAttribute("turma", "Turma de 2026");
    model.addAttribute("message","Bem-vindo ao curso de Java Web");

    return "aluno";

    }

@GetMapping("/inicio")
public String inicio(Model model) {
    model.addAttribute("message", "Minha primeira página dinâmica.");

    return "inicio";

    }

@GetMapping("/mensagem")
public String mensagem(Model model) {
    model.addAttribute("autor", "Marina Rivalta");
    model.addAttribute("texto", "A autora desse codigo sou eu." );

    return "mensagem";

    }



}

