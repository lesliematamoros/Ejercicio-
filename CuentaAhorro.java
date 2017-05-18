
package Herenciaypolimorfimo;

public class CuentaAhorro extends CuentaBancaria {
   
    private double interes;

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }
    
    /*@Override
    public void deposito(double deposito){
        double interes=0;
        if(deposito<1000)
            interes=deposito*0.02;
        
        this.Saldo=this.Saldo+deposito+interes;    
    }*/

    @Override
    double getinteresDeposito() {
        return 0.01;
    }
    
    
}