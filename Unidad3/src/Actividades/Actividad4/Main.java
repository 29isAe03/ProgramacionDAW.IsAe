package Actividades.Actividad4;

public class Main {
    public static void main(String[] args) {
        Proveedor proveedor1=new Proveedor(21312, "Calle X, Nº2", "Huercal", "Almeria");
        Categoria categoria1=new Categoria(2313, "Congelados");
        Pieza pieza=new Pieza(5353, "Pescado", "Azul", 13, categoria1);
        Proveedor_Sumistra_Pieza sumistro1=new Proveedor_Sumistra_Pieza(proveedor1, pieza, "8:00", 20);

        sumistro1.imprimirProovedor_Suministra_Pieza();
    }
}
