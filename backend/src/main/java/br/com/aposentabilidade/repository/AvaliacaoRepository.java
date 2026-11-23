package br.com.aposentabilidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.aposentabilidade.model.Avaliacao;

/**
 * extends JpaRepository<Avaliacao, Long>, você ganha de graça métodos prontos como save (gravar), 
 * findAll (listar tudo) e findById (buscar por id)
 */
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    
}
