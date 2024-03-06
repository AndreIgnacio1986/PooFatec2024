package encapsulamento_2;

import encapsulamento_1.Acesso_Numeros;

public class Verifica_Encapsulamento_2 {
	public static void main(String args []) {
		
		Acesso_Numeros chave = new Acesso_Numeros();
		
		/* chave.a = 10; encapsulamento package private
		 não permite acesso de fora do pacote */
		chave.setNumero("a", 10); //isso pode pq
		//chave.c = 30; variável c foi encapsulada como private, 
		//então não é possível acessar diretamente. Deverá ser
		//acessado apenas com métodos (set e get)
		chave.b = 20; //acessada diretamente pois foi declarada public
		chave.setNumero("c", 30);
		/*
		 chave.d = 40; ñ dá pq é encapsulada como protected, então n dá
		 pra acessar diretamente fora do pacote onde foi criada
		 */
		chave.setNumero("d", 40);
		
		chave.mostra_numero();
	}
}
/*
as variáveis declaradas como atributos da classe Acesso_Numeros
dentro do pacote encapsulamento_1 podem ter diversos tipos de ENCAPSULAMENTO,
que são basicamente níveis de segurança para a variável.
Deixar as variáveis como PUBLIC é uma má prática. O professor disse que é "proibido".
*/