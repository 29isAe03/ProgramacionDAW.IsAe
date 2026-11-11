
public class Empleado {
    //Atributos
    private String legajo;
    private String DNI;
    private String Nombre;
    private int telefonos;
    private String Domicilio;
    
    //Constructores
    public Empleado(){}

    public Empleado(String legajo, String DNI, String Nombre, int telefonos, String Domicilio){
        this.legajo=legajo;
        this.DNI=DNI;
        this.Nombre=Nombre;
        this.telefonos=telefonos;
        this.Domicilio=Domicilio;
    }



    //Metodos

    //Getters y Setters
    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(int telefonos) {
        this.telefonos = telefonos;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public void imprimirEmpleado(){
        System.out.println("Legajo: "+getLegajo());
        System.out.println("DNI: "+getDNI());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Telefonos: "+getTelefonos());
        System.out.println("Domicilio: "+getDomicilio());
    }



    
}
