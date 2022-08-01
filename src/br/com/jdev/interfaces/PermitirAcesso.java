package br.com.jdev.interfaces;

// Essta interface será o nosso contrato de autenticação
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);

}
