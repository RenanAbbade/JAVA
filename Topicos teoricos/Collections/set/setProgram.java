package set;

import java.util.HashSet;
import java.util.Set;

public class setProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//� um tipo generico igual a lista, e representa um conjunto de elementos
		//Os elementos n�o possuem uma posi��o
		//Acesso, inser��o e remo��o de elementos s�o rapidos
		//Oferece Inseterse��o, uni�o, diferen�a
		//Implementa��es: HashSet, TreeSet, LinkedHashSet
		//HashSet: Mais rapido, e n�o ordenado
		//TreeSet: Mais lento, e ordenado pelo compareTo
		//Velocidade mediana e elementos na ordem que s�o adiconados
		//-------------M�todos-------------
		//clear(), size(), removeif(predicate)
		//addAll(other) ->Uni�o:Adiciona num conjunto, elementos de outro
		//retainAll(other) -> interse��o: remove do conjunto os elementos n�o contidos em other
		//removeAll(other) -> diferen�a: remove do conjunto os elementos contidos em other
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		set.removeIf(x -> x.length() >= 3);
		// -> significa "tal que"
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		
	}

}
