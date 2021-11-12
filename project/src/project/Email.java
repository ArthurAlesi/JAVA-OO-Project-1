package project;

import java.util.Arrays;

public class Email {
	private String remetente;
	private String[] destinatarios;
	private String message;
	private String subject;
	
	

	// TODO passar os nomes para inglês
	Email(String nome, String[] destinatarios, String subject, String message){
		this.remetente =nome;
		this.destinatarios = destinatarios;
		this.subject = subject;
		this.message = message;
			
	}
	
	public String toString(){
		String text = "";
		text += "de: " +getRemetente() +  "\n";
		text += "Para: " + Arrays.toString(this.getDestinatarios())+  "\n";
		text +=  getSubject() + "\n";
		text += "\n";
		return text;
	}
	

	//  GET METHODs
	
	public String getRemetente() {
		return this.remetente;
	};
	public String[] getDestinatarios() {
		return this.destinatarios;
	};
	public String getMessage() {
		return this.message;
	};
	public String getSubject() {
		return this.subject;
	};
}
