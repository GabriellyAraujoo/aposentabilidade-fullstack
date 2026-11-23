package br.com.aposentabilidade.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.aposentabilidade.service.AvaliacaoService;

@RestController 
public class AvaliacaoController {

    private final AvaliacaoService service;

    public AvaliacaoController(AvaliacaoService service) {
        this.service = service;
    }
    
    @GetMapping("/api/avaliacao")
    public Map<String, Object> avaliar(@RequestParam int idade)
{boolean podeAposentar = service.podeAposentar(idade);
       Map<String, Object> resposta = Map.of("idade", idade, "podeAposentar", podeAposentar);
        return resposta;
    }    
}
