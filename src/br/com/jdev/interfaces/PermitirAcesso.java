package br.com.jdev.interfaces;

// Essta interface ser� o nosso contrato de autentica��o
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);

}
