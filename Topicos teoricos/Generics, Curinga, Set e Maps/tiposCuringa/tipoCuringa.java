package tiposCuringa;

import java.util.Arrays;
import java.util.List;

public class tipoCuringa {

	// TODO Auto-generated method stub

	/* O supertipo de qualquer tipo de lista � o List<?>, o tipo curinga */

	/*
	 * Com tipos curinga podemos fazer m�todos que recebem um gen�rico de qualquer
	 * tipo
	 */

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStr = Arrays.asList("Renan", "Itau", "Developer"); 	
		printList(myStr);
	}
 /*Por�m, n�o � possivel utilizar o metodo add das lists, pois n�o se sabe exatamente o tipo computado na cria��o da mesma */
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
