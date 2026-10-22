public class Persona1 {
    //Atributos
    private String nombre;
    private int edad;
    private Double estatura;
    private final String dni="1111111111A";

    //Constructor
    public Persona1(){}
    
    public Persona1(String nombre, int edad, Double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }


    //Métodos

    
    
    public void saludar(){
        System.out.println("Hola a todos, soy "+nombre);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void presentacion(){
        System.out.println("Hola, soy "+nombre+", tengo "+edad+" y mido "+estatura);
    }

    //Main
    public static void main(String[] args) {
        //Crear un objeto persona
        Persona1 p1=new Persona1("Pepa", 18, 1.87);
        Persona1 p2=new Persona1("Paco", 51, 1.68);
        Persona1 p3=new Persona1("Miguel", 27, 1.79);

        Persona1 otra=p1;
        p1.presentacion();
        otra.setNombre("Luis");
        p1.presentacion();
        otra.nombre="Lerolero";
        otra.presentacion();
    }

}
