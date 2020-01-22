package transa��o;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) {
		/* Transa��o = Opera��o que deve mander a 
		 * consistencia do BD
		 * -Atomomica, Consistencia, Isola��o, Durabilidade
		 * - setAutoCommit() - Diz se cada opera��o isolada vai ser confirmada automaticamente ou n�
		 * commit() - Confirmar a transa��o
		 * rollback() - Desfazer tudo
		 */
		
		Connection conn = null;
		
		Statement st = null;
		
		ResultSet rs = null;
		
		try {
			
			conn = DB.getConnection();
			//Assim eu atualizo tudo, ou nada, com uma Transa��o, se as duas derem certo ok, se nao, nada
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int linhasAfetadas = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			//Simulando falha para trabalhar a Transa��o: Esse erro faz que o Update acima funcione e o abaixo nao, apos isso implementei o commit
//			int x = 1;
//			if (x<2) {
//				throw new SQLException("Fake Error");
//			}
			
			int linhasAfetadas2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit();//Para confirmar que a minha transa��o terminou
			
			System.out.println("linhas "+linhasAfetadas);
			System.out.println("linhas "+linhasAfetadas2);
			
		}catch (SQLException e) {
			//L�gica para voltar a transa��o caso ela tenha parado
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! cause by: "+e.getMessage());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				throw new DbException("Error trying to rollback! Cause by : "+e.getMessage());
			}
		} finally {
			//Criando m�todos para fechar o ResultSet & Statement, na classe DB
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
			
		}
		
	}


