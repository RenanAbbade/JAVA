package Paralelismo;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	// Esta lista � uma fila que opera do tipo FIFO, usada quando muitas threads
	// compartilham o acesso a uma cole��o comum

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	public void run() {
		System.out.println("Fila rodando");

		while (true) {// enquanto tiver dados

			// O iterator permite que se remova um obj enquanto se percorre uma lista, o
			// iterator � como um ForEach para listas especiais.
			synchronized (pilha_fila) {// A finalidade do Synchronized � realizar a fila de chamadas como em sistemas
										// operacionais, se duas Threads querem executar a mesma coisa, a precedente ir�
										// executar antes, a a que chegou ap�s ir� executar depois

				Iterator iteracao = pilha_fila.iterator();

				while (iteracao.hasNext()) {// Enquanto conter dados na lista, ir� processar
					// O synchronized basicamente bloqueia o recurso a outros processos.
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
					// processa e remove
					System.out.println("Nome: " + processar.getNome() + "/nE-mail: " + processar.getEmail());

					iteracao.remove();

					try {// dar um tempo para descarga de mem�ria
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

			try {
				Thread.sleep(1000);// Ap�s o processamento de toda a lista, da um tempo para descargade memoria
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
