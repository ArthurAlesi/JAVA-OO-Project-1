package project;


public class ServidorEmails {
	// o tamanho do array foi escolhido de maneira arbitr�ria uma vez que a quest�o nao
	// especifica se possui ou n�o limite e qual o seu tamanho
	
	// The size of the array was chosen arbitrarily since the question does not specifies
	//its limit or even whether it has it.
	public CaixaPostal[] listCaixaPostal = new CaixaPostal[10] ;
	public static int qtdCaixaPostal = 0;
	

	public void adicionaCaixa(CaixaPostal cp) {
		listCaixaPostal[qtdCaixaPostal] = cp;
		ServidorEmails.qtdCaixaPostal += 1;
	}
	
	public void enviaEmail(Email email) {
		


		
	}
	
	public void encaminhaEmail(Email e, String nome) {
		
	}
}
