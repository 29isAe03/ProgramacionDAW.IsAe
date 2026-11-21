package Actividades.Actividad4;

public class Proveedor {
    //Atributos
    private int codigo;
    private String direccion;
    private String ciudad;
    private String provincia;

    //Constructores

    public Proveedor(){
    }

    public Proveedor(int codigo, String direccion, String ciudad, String provincia){
        this.codigo=codigo;
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.provincia=provincia;
    }

    public Proveedor(Proveedor copia){}

    //Metodos

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void imprimirProveedor(){
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Direccion: "+getDireccion());
        System.out.println("Ciudad: "+getCiudad());
        System.out.println("Provincia: "+getProvincia());
    }

    
}
