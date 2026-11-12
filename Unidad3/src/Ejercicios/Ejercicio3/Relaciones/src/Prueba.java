public class Prueba {
    public static void main(String[] args) {
        //Objetos
        Sucursal sucursal1=new Sucursal(6767, "Calle X, Nº5", "Murcia" );

        Cliente cliente1=new Cliente("2313123X", "31/12/2008", "Santiago", "Huercal-Overa", 4342, sucursal1);

        Tarjeta tarjeta1=new Tarjeta(12345, "Santiago Andrés", 345, "24/06/2030", cliente1);

        Empleado empleado1=new Empleado("123X", "12335563B", "Miguel", 692823123, "Calle Y, Murcia,Nº4");

        Trabaja trabaja1=new Trabaja("Lunes", "Diurno", sucursal1, empleado1);

        Fabrica fabrica1=new Fabrica(876876, "Fabrica Arcoiris", "España", "Domingo", 500);

        Producto producto1=new Producto(567456, "Tarta de queso rellena de avellena", "Rojo", 6.99, fabrica1);

        Vende vende1=new Vende(6.99, sucursal1, producto1);

        //Funciones
        System.out.println("SUCURSAL");
        System.out.println("-------------");
        sucursal1.imprimirSucursal();
        System.out.println("|");
        System.out.println("CLIENTE");
        System.out.println("-------------");
        cliente1.imprimirCliente();
        System.out.println("|");
        System.out.println("TARJETA");
        System.out.println("-------------");
        tarjeta1.imprimirTarjeta();
        System.out.println("|");
        System.out.println("EMPLEADO");
        System.out.println("-------------");
        empleado1.imprimirEmpleado();
        System.out.println("|");
        System.out.println("TRABAJO");
        System.out.println("-------------");
        trabaja1.imprimirTrabaja();
        System.out.println("|");
        System.out.println("FABRICA");
        System.out.println("-------------");
        fabrica1.imprimirFabrica();
        System.out.println("|");
        System.out.println("PRODUCTO");
        System.out.println("-------------");
        producto1.imprimirProducto();
        System.out.println("|");
        System.out.println("VENDE");
        System.out.println("-------------");
        vende1.imprimirVende();



    }
}
