/*(utilize Scanner, while, if) Escreva um programa em Java que receba dois n�meros inteiros.
Execute e mostre o resultado das opera��es listadas, a seguir, de acordo com a escolha do usu�rio.
O menu deve ser apresentado enquanto o usu�rio n�o escolher a op��o 4 (Sair).
Op��o Opera��o
1 M�dia entre os n�meros digitados
2 Produto entre os n�meros digitados
3 Diferen�a do maior pelo menor
4 Sair
Se a op��o digitada for inv�lida, mostrar uma mensagem de erro e encerrar a execu��o do programa. */
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		int n1;
		int n2;
		double media;
		double produto;
		double dif;
		int menu;
		menu = 0;
		do {
		
		System.out.println("Digite um n�mero qualquer \n");
		Scanner entrada = new Scanner(System.in);
		n1 = entrada.nextInt();
		
		System.out.println("Digite um segundo n�mero qualquer \n");
		Scanner ent = new Scanner(System.in);
		n2 = ent.nextInt();
		
		System.out.println("------------------ MENU ----------------- "
				+ "\n Digite de 1 a 4 para: 1 - M�dia entre os dois n�meros "
				+ "\n 2 - Produto entre os dois n�emros "
				+ "\n 3 - Diferen�a do maior para o menor "
				+ "\n 4 - SAIR");
		Scanner m = new Scanner(System.in);
		menu = m.nextInt();
		while(menu<1 || menu>4) {
			System.out.println("------------------ MENU -----------------  \n DIGITE UM N�MERO V�LIDO!"
					+ "\n Digite de 1 a 4 para: 1 - M�dia entre os dois n�meros "
					+ "\n 2 - Produto entre os dois n�emros "
					+ "\n 3 - Diferen�a do maior para o menor "
					+ "\n 4 - SAIR");
			Scanner me = new Scanner(System.in);
			menu = me.nextInt();
		}
		
		
			switch(menu) {
			
			case 1:
				media =	(n1+n2)/2;
				System.out.println("A m�dia dos dois n�meros dados � "+media);
				break;
			
			case 2:
				produto = n1*n2;
				System.out.println("O produto entre os dois n�meros digitados � "+produto);
			
				break;
			
			case 3:
				if(n1>n2) {
					dif = n1-n2;
					System.out.println("A diferen�a do maior para o menor � "+dif);
					break;
				}
				else {
					System.out.println("A diferen�a do maior para o menor � "+(n2-n1));
					break;
				
			}
		}
		} while(menu!=4);
	}
}

		
		



