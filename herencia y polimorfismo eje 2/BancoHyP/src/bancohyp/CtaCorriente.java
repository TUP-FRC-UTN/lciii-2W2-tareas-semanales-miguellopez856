
package bancohyp;


public class CtaCorriente extends Cuenta {

    private int acuerdo;

    

    public CtaCorriente(int acuerdo, int numero, String nombre, int saldo) {
        super(numero, nombre, saldo);
        this.acuerdo = acuerdo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCtaCorriente{" + "acuerdo=" + acuerdo + '}';
    }
    
    
    
    
    
    
}
