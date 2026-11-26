package Ejercicios.Ejercicio7;

public class Heroe {
    //Atributos
    private String nombre;
    private int vida;
    private int ataque;

    //Constructores

    public Heroe(){
        nombre="";
        vida=20;
        ataque=5;
    }

    public Heroe(String nombre, int vida, int ataque){
        this.nombre=nombre;
        this.vida=vida;
        this.ataque=ataque;
    }

    public Heroe(Heroe copia){}

    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void recibirDanio(int danio){
        setVida(getVida()-danio);
    }

    public void imprimirHeroe(){
        System.out.println("Heroe");
        System.out.println(getNombre());
        System.out.println("HP "+getVida());
        System.out.println("DMG "+getAtaque());
    }
}
