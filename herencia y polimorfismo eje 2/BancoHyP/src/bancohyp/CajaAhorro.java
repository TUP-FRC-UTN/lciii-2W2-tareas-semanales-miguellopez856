
package bancohyp;


public class CajaAhorro extends Cuenta  {

    
    private int saldoAretirar;

  

  
    public CajaAhorro( int saldoAretirar, int numero, String nombre, int saldo) {
        super(numero, nombre, saldo);
        this.saldoAretirar = saldoAretirar;
    }

   
    
    private int Nextraccion()
    {   
      if(saldoAretirar > saldo)
      {
          System.out.println("no se puede extraer mas de lo que tiene");
      }
      return saldoAretirar;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "\nCajaAhorro{" + "saldoAretirar=" + Nextraccion() + '}';
    }

    

    
    
    
    

   
    

    
    
    
}
