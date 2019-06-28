package map;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//� uma cole��o de pares, chaves e valor
		//Os elementos n�o possuem posi��o
		//Acesso,  remo��o e inser��o s�o rapidos
		//Pode ser implementado em HashMap, TreeMap, LinkedHashMap
		
		//M�todos importantes: Put(key), remove(key), ConstainsKey(key), get(key)
		//A compara��o � usada com Equals e HashCode
		
		Map<String, String> cookies; //Vou usar para armazenas cookies
		//Map <chave, valor>
		cookies = new TreeMap<>();
		
		cookies.put("username", "Renan");
		//ListaMap.put(chave, valor)
		cookies.put("email", "renanabbade97@gmail.com");
		
		cookies.remove("email");//Aqui quero excluir um Cookie pela chave email
		
		for (String key : cookies.keySet()) { //KeySet retorna um set com as chaves do meu map
			System.out.println(key + " : "+ cookies.get(key));
		}
		//Cada registro da map � unico por conta da chave (Key)
		//Constains
		System.out.println(cookies.containsKey("username"));
		//Pegando o valor de uma chave
		System.out.println(cookies.get("username"));
		//Pegando o tamanho
		System.out.println(cookies.size());
		
	}

}
