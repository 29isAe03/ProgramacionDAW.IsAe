package Actividades.Actividad1.Actividad2;

public class Persona {
    //Atributos
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private Fecha fechaNacimiento;
    private Ciudad ciudadNacimiento;
    private Ciudad ciudadResidencia;

    //Constructores

    public Persona(){}

    public Persona(String cedula, String nombre, String apellido, String genero, Fecha fechaNacimiento, Ciudad ciudadNacimiento, Ciudad ciudadResidencia){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
        this.fechaNacimiento=fechaNacimiento;
        this.ciudadNacimiento=ciudadNacimiento;
        this.ciudadResidencia=ciudadResidencia;
    }

    public Persona(Persona copia){}

    //Metodos

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Fecha getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public Ciudad getCiudadNacimiento(){
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(Ciudad ciudadNacimiento){
        this.ciudadNacimiento= ciudadNacimiento;
    }

    public Ciudad getCiudadResidencia(){
        return ciudadResidencia;
    }
    
    public void setCiudadResidencia(Ciudad ciudadResidencia){
        this.ciudadResidencia=ciudadResidencia;
    }

    public void imprimirPersona(){
        System.out.println("Cedula: "+getCedula());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Genero: "+getGenero());
        System.out.println("Fecha de nacimiento: "+getFechaNacimiento().getAnio());
        System.out.println("Ciudad de nacimiento: "+getCiudadNacimiento().getNombre());
        System.out.println("Ciudad de residencia: "+getCiudadResidencia().getNombre());
    }

    public static void main(String[] args) {
        Fecha fecha1=new Fecha(31, 12, 2008);
        Ciudad ciudadNacimiento=new Ciudad(323, "Maracaibo", 67);
        Ciudad ciudadResidencia=new Ciudad(04600, "Huercal Overa", 34);
        Persona persona1=new Persona("NoSeQueEs", "Santiago", "Duran", "Maculino", fecha1, ciudadNacimiento, ciudadResidencia);

        persona1.imprimirPersona();
    }
    
}
