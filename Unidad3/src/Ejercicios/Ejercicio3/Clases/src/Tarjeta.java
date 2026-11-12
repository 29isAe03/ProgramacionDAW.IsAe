
public class Tarjeta {
    

    //Atributos
    private int numero;
    private String nombre;
    private int codigo;
    private String fechaCaducidad;
    private Cliente cliente;

    //Constructores
    public Tarjeta(){}

    public Tarjeta(int numero, String nombre, int codigo, String fechaCaducidad, Cliente cliente){
        this.numero=numero;
        this.nombre=nombre;
        this.codigo=codigo;
        this.fechaCaducidad=fechaCaducidad;
        this.cliente=cliente;
    }
    //Metodos
    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void imprimirTarjeta(){
        System.out.println("Numero: "+getNumero());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Fecha de Caducidad: "+getFechaCaducidad());
        if(this.cliente !=null){
            System.out.println("Nombre:"+cliente.getNombre());
        }
    }
}
