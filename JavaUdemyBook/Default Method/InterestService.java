package application;

import java.security.InvalidParameterException;

public interface InterestService {


/*M�todo responsavel por pegar o valor da variavel que diz a taxa, uma interface n�o armazena estado, n�o pode ter variaveis*/
	double getInterestRate();


/*Metodo default pode ser aplicado a classes que implementam extamente o mesmo comportamento, mesmo que com variaveis diferentes */
	default double payment(double amount, int months) {

		if (months < 1) {

			throw new InvalidParameterException("Months must be greater than zero");/*Programa��o defensiva invocando a Exception */

		}

		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);

	}

}