package project;

public class Email {
	public String nome;
	public String[] destinatarios;
	public String message;
	public String subject;
	
	

	// TODO passar os nomes para inglês
	Email(String nome, String[] destinatarios, String subject, String message){
		this.nome =nome;
		this.destinatarios = destinatarios;
		this.subject = subject;
		this.message = message;
			
	}
	
	public String toString(){
		String text = "";
		text += "de: " this.nome;
	}
	
}
