package recuperarDados;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Statement;

public class DB {
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		if (conn == null) {
			try {
			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			conn = DriverManager.getConnection(url, props);
			}catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}//Instancio um objeto do tipo Connection para instanciar a conexao JDBC
		return conn;
	}
	
	
	
	public static void closeConnection() {
		if ( conn != null) {
			try {
			conn.close();
			}catch (SQLException e) {
				throw new DbException(e.getMessage());
			}//Usando a propria Exception criada, administrando o uso dos Try/Catchs
		}
	}
	
	private static Properties loadProperties()  {
		
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
			
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
		
		
	}
	//Metodos caracteristicos para fechar Statement e ResultSet
	public static void closeStatement (Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

}
