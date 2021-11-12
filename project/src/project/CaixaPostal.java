package project;
import java.util.Arrays;
public class CaixaPostal {
	// o tamanho do array foi escolhido de maneira arbitrária uma vez que a questão
	// nao
	// especifica se possui ou não limite e qual o seu tamanho

	// The size of the array was chosen arbitrarily since the question does not
	// specifies
	// its limit or even whether it has it.
	private Email[] listEmail = new Email[10];

	private String userName;

	// Variable for quantity of email instances in listEmail
	public static int qtdEmail = 0;

	CaixaPostal(String nomeUsuario) {
		this.userName = nomeUsuario;
	}

	public String toString() {
		String text = "";
		text += ">>> Caixa Postal de " + this.userName + " <<<\n";
		for(Email email: listEmail) {
			if(email != null) {
				
				text += email;
			}
		}
		return text;
	}

	public void addEmail(Email email) {
		System.out.println(CaixaPostal.qtdEmail);
		this.listEmail[CaixaPostal.qtdEmail] = email;
		CaixaPostal.qtdEmail +=1;
	}
	// GET METHODS
	public String getUserName() {
		return this.userName;
	}

	
	
}
