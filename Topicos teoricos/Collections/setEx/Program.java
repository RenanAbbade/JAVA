package setEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");

		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			//Disponibilizando o BufferedReader para ler o arquivo em FileReader

			Set<LogEntry> set = new HashSet<>();
			//Crio um Set do tipo LogEntry instanciando como HashSet
			//O HashSet � o mais rapido e n�o guarda ordem, perfeito para o problema
			
			String line = br.readLine();//Vou ler a primeira linha do arquivo

			while (line != null) {//Sendo a linha diferente de nulo, executo o Loop

				String[] fields = line.split(" ");//Crio um vetor de Strings separados por espa�o

				String username = fields[0]; //Primeira posi��o do vetor � o nome

				Date moment = Date.from(Instant.parse(fields[1]));//Pegando a data da posi��o 1 do vetor

				set.add(new LogEntry(username, moment));//Insiro no meu set um LogEntry

				line = br.readLine();//Leio a proxima linha do arquivo e retorno ao come�o do Loop

			}	

			System.out.println("Total users: " + set.size());

		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());

		}

		sc.close();

	}
}


