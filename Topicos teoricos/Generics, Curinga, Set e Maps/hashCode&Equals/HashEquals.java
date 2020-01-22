package hashCodeEquals;

public class HashEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Tanto HashCode quanto o Equals s�o opera��es da Classe Object
		 * utilizadas para comparar se um objeto � igual o outro
		 * Equals: lento, mas resposta 100%
		 * HashCode: R�pido, por�m resposta positiva n�o � 100%
		 */
		String a = "Renan Abbade";
		String b = "Renan Abbade";
		System.out.println("EQUALS");
		System.out.println(a.equals(b)); //Compara o valor da variavel com equals
	    /* Hash Code � um m�todo que retorna um n�mero
	     * inteiro representando um c�digo gerado a partir
	     * das informa��es do objeto
	     */
		System.out.println("HASH CODE");
		long hashA = a.hashCode();//Geralmente o n�mero devolvido pela fun��o HashCode pode ser muito longo 
		long hashB = b.hashCode();//sendo mais apropriado o tipo Long, porque se for INT valores diferentes podem ter o mesmo c�digo por corte de Caracteres
		//Por ser muito rapido, � bastante utilizado quando devemos fazer compara��es em um grande volume de dados
		System.out.println(a.equals(b));
		
		Cliente c1 = new Cliente("Renan Silva Abbade","renanabbade1997@gmail.com");
		Cliente c2 = new Cliente("Renan Silva Abbade","DimasOliver@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	

	}

}
