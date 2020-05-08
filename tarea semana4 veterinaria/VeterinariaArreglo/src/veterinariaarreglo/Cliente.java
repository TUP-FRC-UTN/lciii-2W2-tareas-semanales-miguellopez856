
package veterinariaarreglo;


public class Cliente {
    private String nombre;
    private int nroCliente;
    private int antiguedad;
    private String nombreMascota;
    private int edadMascota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public Cliente(String nombre, int nroCliente, int antiguedad, String nombreMascota, int edadMascota) {
        this.nombre = nombre;
        this.nroCliente = nroCliente;
        this.antiguedad = antiguedad;
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }
    
    
}
