package Heran�a;

public class Classe_Filha_1 extends Superclasse{

	private String atributo_2;
	
	Classe_Filha_1(){
		super();
		System.out.println("acesso ao m�todo construtor da Classe_Filha1");
	}
	
	public void set_atributo_2(String atributo_2) {
		this.atributo_2 = atributo_2;
	}
	
	public String get_atributo_2() {
		return atributo_2;
	}

}
