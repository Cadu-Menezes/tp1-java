package br.edu.infnet.cadu;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.cadu.model.domain.Movimentacao;

@Component
public class MovimentacaoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Movimentacao mov = new Movimentacao();
		mov.setId(1);
		mov.setEntrada(false);
		mov.setFixa(false);
		mov.setValor(250);
		mov.setSaldo(1000);
		
		System.out.println("Movimentacao "+ mov.getId()+" cadastrada com sucesso! ");	
		System.out.println("O valor foi de "+ mov.verificarEntradaSaida());
		System.out.println("teste valor: "+ mov.getValor());
		
	}

}
