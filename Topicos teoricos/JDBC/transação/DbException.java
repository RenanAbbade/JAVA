package transa��o;
//Classe de exception personalizada
public class DbException extends RuntimeException {
	//N�mero de vers�o padr�o
	private static final long serialVersionUID = 1L;
	
	public DbException (String msg) {
		super(msg);//Informo uma mensagem pelo construtor transmitindo para a superclasse
	}

}
