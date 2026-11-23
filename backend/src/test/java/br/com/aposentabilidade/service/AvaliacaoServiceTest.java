package br.com.aposentabilidade.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AvaliacaoServiceTest {
AvaliacaoService service = new AvaliacaoService(null);
    @Test 
    void podeAposentarCom70Anos() {
        assertTrue(service.podeAposentar(70));
    }

    @Test 
    void naoPodeAposentarCom40Anos(){
        assertFalse(service.podeAposentar( 40));
    }
}
