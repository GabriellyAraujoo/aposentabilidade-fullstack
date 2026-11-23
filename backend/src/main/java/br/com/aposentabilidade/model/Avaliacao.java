package br.com.aposentabilidade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity /*: a etiqueta que diz "esta classe vira uma tabela" */
public class Avaliacao {

    /*o campo id é a chave primária, e o banco gera o número sozinho  */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
/*cada campo vira uma coluna na tabela */
    private int idade;
    private boolean podeAposentar;

    public Avaliacao() {
    }

    public Avaliacao(int idade, boolean podeAposentar) {
        this.idade = idade;
        this.podeAposentar = podeAposentar;
    }

    public Long getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isPodeAposentar() {
        return podeAposentar;
    }
}
