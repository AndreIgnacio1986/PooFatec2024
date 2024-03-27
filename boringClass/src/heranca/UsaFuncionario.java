package heranca;

import javax.swing.JOptionPane;

public class UsaFuncionario {

	public static void main (String args[]) {
		
		//OBJETOS
		Funcionario funcionario = new Funcionario();
		PessoaJuridica func = new PessoaJuridica();
		
		String u, v, t, z;
		int x;
		
		z = JOptionPane.show.InputDialog ("digite 1 se contribuinte é pessoa física \n digite 2 se é pessoa jurídica");
		
		//conversão de string para flutuante:
		x = Integer.parseInt(z);
		
		if(z.lenght() ==1) {
			switch(x) {
			case 1:
				u = JOptinPane.showInputDialog("escrever o nome do contribuinte: ");
				v = JOptinPane.showInputDialog("escrever o RG do contribuinte: ");
				t = JOptinPane.showInputDialog("escrever a ID do cartao do contribuinte: ");
				
				funcionario.setNome(u);;
				funcionario.setRG(v);
				funcionario.setCartao(t);
				System.out.println("NOME: " + funcionario.getNome());
				System.out.println("RG: " + funcionario.getRG());
				System.out.println("Cartâo: " + funcionario.getCartao());
				
				break;
			
			
			case 2: 
				u = JOptinPane.showInputDialog("escrever o nome do contribuinte: ");
				v = JOptinPane.showInputDialog("escrever o CNPJ do contribuinte: ");
				t = JOptinPane.showInputDialog("escrever a ID do cartao do contribuinte: ");
				
				funcionario.setNome(u);;
				funcionario.setCnpj(v);
				funcionario.setCartao(t);
				System.out.println("NOME: " + funcionario.getNome());
				System.out.println("CNPJ: " + funcionario.getCnpj());
				System.out.println("Cartâo: " + funcionario.getCartao());
				
				break;
			
			} //switch
		}//if
	}//void main
}
