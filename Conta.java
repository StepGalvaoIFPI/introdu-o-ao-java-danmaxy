public class Conta {
    private double saldo;
    public void setSaldo (double valor){
        saldo = valor;
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    public void sacar(double valor){
        saldo = saldo - valor;
    }

}
