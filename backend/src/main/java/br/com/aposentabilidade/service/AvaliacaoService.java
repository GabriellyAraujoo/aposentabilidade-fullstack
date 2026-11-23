package br.com.aposentabilidade.service;

import org.springframework.stereotype.Service;
import java.util.List;

import br.com.aposentabilidade.model.Avaliacao;
import br.com.aposentabilidade.repository.AvaliacaoRepository;

@Service
public class AvaliacaoService {

    private final AvaliacaoRepository repository;

        public AvaliacaoService(AvaliacaoRepository repository) {
        this.repository = repository;
    }

    public boolean podeAposentar(int idade) {
        return idade >= 65;
    }

    public Avaliacao avaliar(int idade) {
        Avaliacao avaliacao = new Avaliacao(idade, podeAposentar(idade));
        return repository.save(avaliacao);
    }

    public List<Avaliacao> listar() {
        return repository.findAll();
    }
 }
