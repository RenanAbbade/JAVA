package deletarDados;

public class DbIntegrityException extends RuntimeException {
//Exce��o personalizada de Integridade Referencial
	private static final long serialVersionUID = 1L;
	//ID padr�o
	
	public  DbIntegrityException (String msg) {
		super(msg);
	}
	
	
	
	

}
