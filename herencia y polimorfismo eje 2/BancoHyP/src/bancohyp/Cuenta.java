
package bancohyp;


public class Cuenta {
    private int numero;
    private String nombre;
    protected int saldo;

 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public Cuenta(int numero, String nombre, int saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public Cuenta()
    {
    
    
    }
    
    public void Depositar(int saldo)
    {
        if(saldo > 0)
        {
          this.saldo += saldo; 
        }
      
    
    }
    
    
    public void Extraer(int saldo)
    {
      if(this.saldo - saldo < 0)
      {
        this.saldo = 0;
      }else
      {
        this.saldo -= saldo;
      }
    
    }

    @Override
    public String toString() {
        return super.toString() + "\nCuenta{" + "numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }
    
    
   
}
