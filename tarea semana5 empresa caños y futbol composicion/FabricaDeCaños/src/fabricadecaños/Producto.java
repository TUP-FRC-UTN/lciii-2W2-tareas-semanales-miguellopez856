
package fabricadecaños;


class Producto {
    
    private String descripcion;
    private Material[] materiales;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(String descripcion) {
        int cantidadElementos = 0;
        this.descripcion = descripcion;
        materiales = new Material[cantidadElementos];
    }
    
    public void agregarMaterial(Material m)
    {
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] == null)
            {
             materiales[i] = m;
             break;
            }
            
        }
    }
    
    public double sumaCostoTotal()
    {
        double sumaCostotal = 0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] !=null)
            {
              if(materiales[i].getValorUnitario() > 0)
              {
                sumaCostotal += materiales[i].getValorUnitario();
              }
            }
           
        }
        return sumaCostotal;
    }
    
    public boolean formaParteDelProducto()
    {
      boolean formaParte = true;
      
        for (int i = 0; i < materiales.length; i++) {
            
             if(materiales[i] == null)
             {
                formaParte = false;
                break;
             }  
        }
        return formaParte;
    }
        
   public double MaterialMenorPrecio()
   {
       int valor = 0;
       
       
       for (int i = 0; i < materiales.length; i++) {
           if(materiales[i] !=null)
           {
             if(materiales[i].getValorUnitario() < valor)
             {
               valor += materiales[i].getValorUnitario();
             }
             
           }
        }
        
       return materiales[i].getValorUnitario(); 
       
   }
   
   
   
   
     
    
}
