package Actividades.Actividad3;

public class Persona {
    //Atributos
    private String docld;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private char genero;
    private Vehiculo vehiculo;

    //Constructores

    public Persona(){}

    public Persona(String docld, String nombre, String apellido, String fechaNacimiento, char genero, Vehiculo vehiculo){
        this.docld=docld;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNacimiento=fechaNacimiento;
        this.genero=genero;
        this.vehiculo=vehiculo;
    }

    public Persona(Persona copia){}

    //Metodos

    public String getDocld() {
        return docld;
    }

    public void setDocld(String docld) {
        this.docld = docld;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void imprimirPersona(){
        System.out.println("Docld: "+getDocld());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Fecha de nacimiento: "+getFechaNacimiento());
        System.out.println("Genero: "+getGenero());
        System.out.println("Vehiculo: "+getVehiculo().getPlaca());
    }

    public static void main(String[] args) {
        Vehiculo vehiculo1=new Vehiculo("Toyota", "131331", 2222, "6567 HFX", "Negro", 12000);
        Persona persona1=new Persona("131321x", "Santiago", "Duran", "31/12/2008", 'M' , vehiculo1);
        persona1.imprimirPersona();
    }

    
}
