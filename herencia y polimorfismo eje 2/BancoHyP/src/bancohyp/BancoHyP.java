
package bancohyp;


public class BancoHyP {

    
    public static void main(String[] args) {
       
           /* Cuenta CajaAhorro = new Cuenta(1, "miguel", 1000);
            Cuenta CtaCorriente = new Cuenta(2, "jose", 100);
            
            CajaAhorro.Depositar(1000);
            CtaCorriente.Depositar(100);
            
            CajaAhorro.Extraer(3000);
            CtaCorriente.Extraer(80);
            
            System.out.println(CajaAhorro);
            System.out.println(CtaCorriente);
        */
            Cuenta cu = new CajaAhorro(100, 1, "jon", 200);
            Cuenta cue = new CtaCorriente(100, 2, "ana", 300);
            
            //agrego o retiro dinero
            cu.Depositar(200);
            cue.Extraer(200);
            cue.Depositar(80);
            //muestro por pantalla los resultados
            System.out.println(cu.toString());
            System.out.println(cue.toString());
            
            
            
            
        
    }
    
}
