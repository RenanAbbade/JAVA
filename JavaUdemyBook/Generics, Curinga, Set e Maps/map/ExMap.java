package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import generics.Product;

//Na contagem de votos de uma elei��o, 
//s�o gerados v�rios registros de vota��o 
//contendo o nome do candidato e a quantidade
//de votos (formato .csv) que ele obteve em
//uma urna de vota��o. Voc� deve fazer um 
//programa para ler os registros de vota��o a 
//partir de um arquivo, e da� gerar um relat�rio 
//consolidado com os totais de cada candidato.

public class ExMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Dell\\Documents\\GitHub\\products.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			 
			List<Candidato> list = new ArrayList<>();
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] fields = line.split(",");
		
				list.add(new Candidato(fields[0], Integer.parseInt(fields[1])));
				
				line = br.readLine();
				
			}
			
			for (Candidato  cand : list) {
				if (cand.equals(list.get(0))) {
				
				}
			}
			
			
			
			
		}catch (IOException e) {
			e.getMessage();
		}

	}

}
