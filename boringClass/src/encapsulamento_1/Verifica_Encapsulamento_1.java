package encapsulamento_1;

public class Verifica_Encapsulamento_1 {
	
	public static void main(String args[]) {
		
		Acesso_Numeros chave = new Acesso_Numeros();
			
			chave.a = 10;
			chave.b = 20;
			//chave.c = 30; não é possível acessar variável private em outra classe
			//pois foi declarado private int c nos atributos da classe Acesso_Numeros 
			//e isso faz com que esse atributo específico seja visível apenas dentro da mesma classe
			chave.setNumero("c" , 30);
			chave.d = 40;
			chave.mostra_numero();
	}
}
