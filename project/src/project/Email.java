package project;

public class Email {
	public String nome;
	public String[] destinatarios;
	public String mensagem;
	public String assunto;
	

	// TODO passar os nomes para ingl�s
	Email(String nome, String[] destinatarios, String assunto, String mensagem){
		this.nome =nome;
		this.destinatarios = destinatarios;
		this.assunto = assunto;
		this.mensagem = mensagem;
			
	}
}
