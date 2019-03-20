

public abstract class ContaAbstrata {
    protected double saldo;
    private String correntista;
    private int numero;
    public ContaAbstrata() {}
    public ContaAbstrata(int numero, String correntista, double saldo) { 
        this.numero = numero;
        this.saldo = saldo;
        this.correntista = correntista;
    }
    public long getNumero() { return numero; }
    public double consultar() { return saldo; }
    public abstract void depositar(double valor);
    public abstract boolean sacar(double valor);
    public String toString() {
        return "[num=" + numero + "," + correntista + ", saldo=" 
                + saldo + "]";
    }
}
    