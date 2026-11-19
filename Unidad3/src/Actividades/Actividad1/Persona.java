package Actividades.Actividad1;

public class Persona {
    //Atributos
    private String nombre;
    private String DNI;
    private String fechaDeNacimiento;
    private String direccion;
    private String genero;
    private String estadoCivil;

    //Constructores

    public Persona(){}

    public Persona(String nombre, String DNI, String fechaDeNacimiento, String direccion, String genero, String estadoCivil){
        this.nombre=nombre;
        this.DNI=DNI;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.direccion=direccion;
        this.genero=genero;
        this.estadoCivil=estadoCivil;
    }

    public Persona(Persona Copia){}

    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void informacionPersona(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("DNI "+getDNI());
        System.out.println("Fecha de nacimiento: "+getFechaDeNacimiento());
        System.out.println("Direccion: "+getDireccion());
        System.out.println("Genero: "+getGenero());
        System.out.println("EstadoCivil: "+getEstadoCivil());
    }
}
