import java.util.Scanner;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CartaoCredito {
	//vars credito
		ListaDeCompras lista = new ListaDeCompras();
		private static String administradora;
		private static String NumCredito;
		private static int NumParcelas; 




	public void pagaCredito() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" \n \n ---------------------- Digite o n�mero correspondente  a administradora do seu cart�o! ------------------------- \n "
				+ "Escolha a op��o de acordo com o que deseja! \n"
				+ "1. VISA \n"
				+ "2. MASTERCARD \n"
				+ "3. DINERS CLUB \n"
				+ "4. AMERICAN EXPRESS \n"
				+ "5. PORTO SEGURO \n");
		int opcao = sc.nextInt();
		while(opcao < 1 || opcao >5) {
			System.out.println(" \n \n ---------------------- Digite o n�mero correspondente  a administradora do seu cart�o CORRETAMENTE! ------------------------- ");
			opcao = sc.nextInt();
		}
			
		if (opcao ==1) {
			administradora = "VISA";
		}else if(opcao == 2) {
			administradora = "MASTERCARD";
		}else if(opcao == 3) {
			administradora = "DINERS CLUB";
		}else if(opcao == 4) {
			administradora = "AMERICAN EXPRESS";
		}else if(opcao == 5) {
			administradora = "PORTO SEGURO";
		}
		
		System.out.println("\n Digite o n�mero correspondente ao seu cart�o de cr�dito! Necess�rios exatos 10 digitos! \n");
		NumCredito = sc.next();
		while (NumCredito.length() != 10) {
			System.out.println(" \n Digite o n�mero correspondente ao seu cart�o de cr�dito! Necess�rios exatos 10 digitos! \n");
			NumCredito = sc.next();
		}
		System.out.println("\n Digite o n�mero de parcelas que deseja para efetuar a compra, no minimo uma, e no m�ximo at� 3 parcelas! \n");
		NumParcelas = sc.nextInt();
		while (NumParcelas <1 || NumParcelas>3) {
			System.out.println("\n Digite o n�mero de parcelas que deseja para efetuar a compra, no minimo uma, e no m�ximo at� 3 parcelas! \n");
			NumParcelas = sc.nextInt();
		}
		if(NumParcelas == 1) {
			System.out.println("Valor a pagar: 1x de "+ String.format("%.2f", lista.getValor_total()));
		}else if(NumParcelas == 2) {
			System.out.println("Valor a pagar: 2x de "+ String.format("%.2f", (lista.getValor_total()/2)));
		}else if(NumParcelas == 3) {
			System.out.println("Valor a pagar: 3x de "+ String.format("%.2f", (lista.getValor_total()/3)));
		}
		System.out.println(" \n \n Agora digite a senha do cart�o! (6 digitos) \n");
		String senha = sc.next();
		while (senha.length() != 6) {
			System.out.println(" \n Agora digite a senha do cart�o! (6 digitos) Corretamente \n");
			senha = sc.next();
		}
		System.out.println(" \n Carregando.. \n Aprovando.. \n  Compra aprovada! \n  ");
		}




	public  String getAdministradora() {
		return administradora;
	}








	public  String getNumCredito() {
		return NumCredito;
	}







	public int getNumParcelas() {
		return NumParcelas;
	}




	
	
	}