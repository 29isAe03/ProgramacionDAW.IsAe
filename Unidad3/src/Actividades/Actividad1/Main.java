package Actividades.Actividad1;

public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona("Santiago", "43243243X", "DD/MM/YYYY", "Calle X, nº2", "Masculino", "Soltero");
        CuentaCorriente cuenta1=new CuentaCorriente(persona1, 4234, 5000.00);

        persona1.informacionPersona();
        System.out.println("------------------");
        cuenta1.imprimirCuenta();

    }
}
