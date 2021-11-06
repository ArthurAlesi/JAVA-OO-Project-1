# JAVA-OO-Project-1
 A simple project using only Object-Oriented concepts. No design, layout or screens


<h2> Enunciado </h2>

Considere um servidor de email’s, o qual precisa controlar diferentes caixas postais e emails que são encaminhados por este servidor. Para tal, suponha o código abaixo:



```md
public class AD1_2020_2 {
	public static void main(String[] args) {
		ServidorEmails servidor = new ServidorEmails();
		CaixaPostal fulano = new CaixaPostal("Fulano");
		CaixaPostal sicrano = new CaixaPostal("Sicrano");
		CaixaPostal beltrano = new CaixaPostal("Beltrano");
		CaixaPostal outrano = new CaixaPostal("Outrano");
		servidor.adicionaCaixa(fulano);
		servidor.adicionaCaixa(sicrano);
		servidor.adicionaCaixa(beltrano);
		servidor.adicionaCaixa(outrano);
		Email e1 = new Email("Fulano", new String[] { "Sicrano", "Beltrano" }, "Super importante!",
				"Retorne-me o quanto antes!");
		servidor.enviaEmail(e1);
		servidor.encaminhaEmail(e1, "Outrano");
		System.out.println(fulano);
		System.out.println(sicrano);
		System.out.println(beltrano);
		System.out.println(outrano);
	}
}
```

Crie todas as classes utilizadas no código acima, para que este rode sem alterações.
Utilize conceitos de OO sempre que possível. O resultado de sua execução, para este
exemplo de entrada acima, deve ser como na saída abaixo:

```md
>>> Caixa Postal de Fulano <<<


>>> Caixa Postal de Sicrano <<<
De: Fulano
Para: [Sicrano, Beltrano]
Super importante!
Retorne-me o quanto antes!

>>> Caixa Postal de Beltrano <<<
De: Fulano
Para: [Sicrano, Beltrano]
Super importante!
Retorne-me o quanto antes!
>>> Caixa Postal de Outrano <<<

De: Fulano
Para: [Sicrano, Beltrano]
Super importante!
Retorne-me o quanto antes!

```

