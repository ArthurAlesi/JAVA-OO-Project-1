package project;

public class ServidorEmails {
	// o tamanho do array foi escolhido de maneira arbitrária uma vez que a questão
	// nao
	// especifica se possui ou não limite e qual o seu tamanho

	// The size of the array was chosen arbitrarily since the question does not
	// specifies its limit or even whether it has it.
	public CaixaPostal[] listCaixaPostal = new CaixaPostal[10];
	// total quantity of CaixaPostal's
	public static int qtdCaixaPostal = 0;

	// add Caixa
	public void adicionaCaixa(CaixaPostal cp) {
		listCaixaPostal[qtdCaixaPostal] = cp;
		ServidorEmails.qtdCaixaPostal += 1;
	}

	// send Email
	public void enviaEmail(Email email) {
		for(String remetente : email.getDestinatarios()) {

			
			CaixaPostal cp = this.getCaixaPostal(remetente);
			cp.addEmail(email);
		}
		
		
	}

	// forward Email
	public void encaminhaEmail(Email email, String nome) {
		CaixaPostal cp = getCaixaPostal(nome);
		cp.addEmail(email);
		
	}


	private CaixaPostal getCaixaPostal(String nome) {
		for(CaixaPostal cp : this.listCaixaPostal) {
			if(cp.getUserName().equals(nome)) {
				return cp;
			}
		}
		return null;
	}
}
