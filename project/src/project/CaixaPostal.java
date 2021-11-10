package project;

public class CaixaPostal {
	// o tamanho do array foi escolhido de maneira arbitr�ria uma vez que a quest�o nao
	// especifica se possui ou n�o limite e qual o seu tamanho
	
	// The size of the array was chosen arbitrarily since the question does not specifies
	//its limit or even whether it has it.
	public Email[] listaEmail= new Email[10];
	public String userName;
	public static int qtdEmail = 0;
	
	
	CaixaPostal(String nomeUsuario){
		this.userName = nomeUsuario;
	}
	
	
	public String toString() {
		String text ="";
		text += ">>> Caixa Postal de " + this.userName + " <<<";
		return text;
	}
}
