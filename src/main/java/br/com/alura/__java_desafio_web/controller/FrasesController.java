package br.com.alura.__java_desafio_web.controller;

import br.com.alura.__java_desafio_web.dto.FraseDTO;
import br.com.alura.__java_desafio_web.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FrasesController {

    @Autowired
    private FraseService servico;

    @GetMapping("/frases")
    public FraseDTO obterFrase() {
        return servico.obterFrase();
    }
}
