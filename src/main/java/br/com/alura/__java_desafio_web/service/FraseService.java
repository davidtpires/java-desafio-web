package br.com.alura.__java_desafio_web.service;

import br.com.alura.__java_desafio_web.dto.FraseDTO;
import br.com.alura.__java_desafio_web.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.alura.__java_desafio_web.repository.FraseRepository;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;


    public FraseDTO obterFrase() {
        Frase f = repositorio.findFrase();
        return new FraseDTO(f.getId(), f.getFrase(), f.getPersonagem(), f.getTitulo(), f.getPoster());
    }
}
