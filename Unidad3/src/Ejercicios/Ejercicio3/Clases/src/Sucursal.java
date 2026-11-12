
public class Sucursal {
    //Atributos
    private int Codigo;
    private String domicilio;
    private String ciudad;

    //Constructores
    public Sucursal(){}

    public Sucursal(int Codigo, String domicilio, String ciudad){
        this.Codigo=Codigo;
        this.domicilio=domicilio;
        this.ciudad=ciudad;
    }

    //Metodos
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void imprimirSucursal(){
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Domicilio:"+getDomicilio());
        System.out.println("Ciudad: "+getCiudad());
    }
    
}
