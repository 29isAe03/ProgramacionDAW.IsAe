
public class Fabrica {
    //Atributos
    private int CUIT;
    private String nombre;
    private String pais;
    private String gerente;
    private int cantEmp;

    //Constructores
    public Fabrica(){}

    public Fabrica(int CUIT, String nombre, String pais, String gerente, int cantEMP){
        this.CUIT=CUIT;
        this.nombre=nombre;
        this.pais=pais;
        this.gerente=gerente;
        this.cantEmp=cantEMP;
    }

    //Metodos
    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int cUIT) {
        CUIT = cUIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public int getCantEmp() {
        return cantEmp;
    }

    public void setCantEmp(int cantEmp) {
        this.cantEmp = cantEmp;
    }
    
    public void imprimirFabrica(){
        System.out.println("CUIT: "+getCUIT());
        System.out.println("Nombre: "+getNombre());
        System.out.println("País: "+getPais());
        System.out.println("Gerente: "+getGerente());
        System.out.println("Cantidad de EMP: "+getCantEmp());
    }
    
}
