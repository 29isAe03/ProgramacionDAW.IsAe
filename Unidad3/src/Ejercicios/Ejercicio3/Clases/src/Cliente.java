
public class Cliente {
    //Atributos
    private String DNI;
    private String fechaNacimiento;
    private String Nombre;
    private String Ciudad;
    private int codigo;

    //Constructores
    public Cliente(){};

    public Cliente(String DNI, String fechaNacimiento, String Nombre, String Ciudad, int codigo){
        this.DNI=DNI;
        this.fechaNacimiento=fechaNacimiento;
        this.Nombre=Nombre;
        this.Ciudad=Ciudad;
        this.codigo=codigo;
    }
    

    //Metodos
    //Getters y Setters
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
    //
    public void imprimirCliente(){
        System.out.println("DNI: "+getDNI());
        System.out.println("Fecha de Nacimiento: "+getFechaNacimiento());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Ciudad: "+getCiudad());
        System.out.println("Codigo: "+getCodigo());

    }

    //Main
    public static void main(String[] args) {
        Cliente cliente1=new Cliente("49971673X", "31/12/2008", "Santiago", "Huercal-Overa", 6767);
        cliente1.imprimirCliente();
    }
    
}
