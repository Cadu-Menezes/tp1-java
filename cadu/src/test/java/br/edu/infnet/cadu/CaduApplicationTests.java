package br.edu.infnet.cadu;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.cadu.model.domain.Movimentacao;


@SpringBootTest
class CaduApplicationTests {

	@Test
	void contextLoads() {
	}
	

	@Test
	void verificarEntrada() {

		Movimentacao mov = new Movimentacao();
		mov.setId(1);
		mov.setEntrada(true);
		mov.setFixa(false);
		mov.setValor(250);
		mov.setSaldo(1000);
		
		assertEquals(250,  mov.verificarEntradaSaida());
	}

	@Test
	void verificarSaida() {

		Movimentacao mov2 = new Movimentacao();
		mov2.setId(1);
		mov2.setEntrada(false);
		mov2.setFixa(false);
		mov2.setValor(250);
		mov2.setSaldo(1000);
						
		assertEquals(-250,  mov2.verificarEntradaSaida());
	}
		
}

