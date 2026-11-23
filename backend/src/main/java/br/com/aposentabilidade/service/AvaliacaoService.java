package br.com.aposentabilidade.service;

import org.springframework.stereotype.Service;
@Service 
public class AvaliacaoService {
    public boolean podeAposentar(int idade){
        return idade >= 65; 
    }
}
