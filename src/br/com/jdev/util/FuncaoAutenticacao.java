package br.com.jdev.util;

import br.com.jdev.interfaces.PermitirAcesso;

//Recebe s� quem tem o contrato da interface de permitir acesso e chamar o autenticar
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitiracesso;
	
	public boolean autenticar() {
		return permitiracesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitiracesso = acesso;
	}

}
