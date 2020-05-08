
package veterinariaarreglo;

import java.util.Scanner;


public class VeterinariaArreglo {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Cliente [] clientes;
         
        System.out.println("Ingrese la cantidad de clientes: ");
        int cantClientes = sc.nextInt();
        
        //System.out.println("la cantidad de clientes es: " + cantClientes);
        clientes = new Cliente[cantClientes];
        
        for (int i = 0; i < clientes.length; i++) {
            
            sc.nextLine();
            
            System.out.println("Ingrese el nombre del cliente " + (i + 1) );
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese el Numero de Cliente " + (i + 1) );
            int numeroCliente = sc.nextInt();
            
            System.out.println("Ingrese la Antiguedad del cliente " + (i + 1));
            int antiguedad = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Ingrese el Nombre de la mascota del Cliente " + (i + 1));
            String nombreDogge = sc.nextLine();
            
            System.out.println("Ingrese la edad De la Mascota " + (i + 1));
            int edadDogge = sc.nextInt();
            
            clientes[i] = new Cliente(nombre, numeroCliente, antiguedad, nombreDogge, edadDogge);
        }
        
        // Promedio de la edad de las mascotas.
        int acumuladorEdadMascota = 0;
            int contadorEdadMascota = 0;
            
            for (int i = 0; i < clientes.length; i++) {
                
                if(clientes[i] !=null)
                {
                    acumuladorEdadMascota += clientes[i].getEdadMascota();

                    contadorEdadMascota++;
                
                
                }
            
        }
            
          
            System.out.println("El promedio de la edad es " + acumuladorEdadMascota / contadorEdadMascota);
            
            // Cantidad de Clientes que tiene una antiguedad mayor o igual a 5 años
            Cliente auxiliar = clientes[0];
            
            int cantidadClientesMayoIgual5 = 0;
            for (int i = 0; i < clientes.length; i++) {
                if(clientes[i] !=null && clientes[i].getAntiguedad() >= 5 )
                {
                    cantidadClientesMayoIgual5++;
                    
                    auxiliar = clientes[i];
               
                }
                
            System.out.println("Hay " + cantidadClientesMayoIgual5 + " Clientes con mayor o igual antiguedad a 5.");
            
            System.out.println("Y su nombre es: " + auxiliar.getNombre());
            
                System.out.println("la cantidad de clientes son: " + cantClientes);
        }
           
        
    }
    
}
