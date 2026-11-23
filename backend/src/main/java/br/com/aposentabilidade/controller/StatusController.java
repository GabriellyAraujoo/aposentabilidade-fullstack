package br.com.aposentabilidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;



//A palavra com @ se chama anotação. É uma etiqueta que você cola na classe. Esta diz ao Spring: "esta classe responde a requisições da web". 
// Sem ela, o Spring ignora o arquivo.
@RestController
public class StatusController {

    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of("status", "ok", "servico", "aposentabilidade");
    }
}