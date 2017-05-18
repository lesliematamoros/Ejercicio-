
package Herenciaypolimorfimo;


public abstract class CuentaBancaria {
    
    private String Nombre;
    protected double Saldo;
    
    abstract double getinteresDeposito();
    
    public void deposito(double deposito){
        double totalInteres=0;
        if(deposito<1000)
            totalInteres=deposito*getinteresDeposito();
        
        this.Saldo+=deposito + totalInteres;
    }
    public void retiro(double retiro){
        this.Saldo-=retiro;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    /*public double getInteresDeposito() {
        return interesDeposito;
    }

    public void setInteresDeposito(double interesDeposito) {
        this.interesDeposito = interesDeposito;
    }*/    
}
