package br.com.aposentabilidade.controller;

import java.util.Map;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.aposentabilidade.service.AvaliacaoService;
import br.com.aposentabilidade.model.Avaliacao;


@RestController 
public class AvaliacaoController {

    private final AvaliacaoService service;

    public AvaliacaoController(AvaliacaoService service) {
        this.service = service;
    }
    
     @PostMapping("/api/avaliacoes")
    public Avaliacao avaliar(@RequestParam int idade) {
        return service.avaliar(idade);
    }
    @GetMapping ("/api/avaliacoes")
    public List<Avaliacao> listar(){
        return service.listar();
    }

}
