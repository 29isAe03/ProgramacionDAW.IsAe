package Actividades.Actividad1.Actividad1;

public class Persona {
    //Atributos
    private String nombre;
    private String DNI;
    private String fechaNacimiento;
    private String direccion;
    private String genero;
    private String estadoCivil;

    //Constructores
    public Persona(){

    }


    public Persona(String nombre, String DNI, String fechaNacimiento, String direccion, String genero, String estadoCivil){
        this.nombre=nombre;
        this.DNI=DNI;
        this.fechaNacimiento=fechaNacimiento;
        this.direccion=direccion;
        this.genero=genero;
        this.estadoCivil=estadoCivil;

    }



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

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public void informacion(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("DNI: "+this.DNI);
        System.out.println("Fecha de nacimiento: "+this.fechaNacimiento);
        System.out.println("Dirección: "+this.direccion);
        System.out.println("Genero: "+this.genero);
        System.out.println("Estado civil: "+this.estadoCivil);
    }

    
}
