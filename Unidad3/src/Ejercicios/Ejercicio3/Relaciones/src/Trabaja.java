public class Trabaja {
    //Atributos
    private String dia;
    private String horario;
    private Sucursal sucursal;
    private Empleado empleado;

    //Constructores

    public Trabaja(){}

    public Trabaja(String dia, String horario, Sucursal sucursal, Empleado empleado){
        this.dia=dia;
        this.horario=dia;
        this.sucursal=sucursal;
        this.empleado=empleado;
    }
    //Metodos
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void imprimirTrabaja(){
        System.out.println("Dia: "+getDia());
        System.out.println("Horario: "+getHorario());
        if(this.sucursal != null){
            System.out.println("Sucursal: "+sucursal.getCiudad());
        }
        else if(this.empleado != null){
            System.out.println("Empleado: "+empleado.getNombre());
        }
    }
    
}
