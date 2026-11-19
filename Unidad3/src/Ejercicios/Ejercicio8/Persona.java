package Ejercicios.Ejercicio8;

public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private int telefono;
    private String poblacion;

    //Constructores
    
    public Persona(){}

    public Persona(String nombre, int edad, int telefono, String poblacion){
        this.nombre=nombre;
        this.edad=edad;
        this.telefono=telefono;
        this.poblacion=poblacion;
    }

    public Persona(Persona copia){}

    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void imprimirPersona(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Telefono: "+getTelefono());
        System.out.println("Poblacion: "+getPoblacion());
    }

    
}
