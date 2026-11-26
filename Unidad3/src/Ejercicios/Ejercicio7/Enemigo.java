package Ejercicios.Ejercicio7;

public class Enemigo {
    //Atributos
    private String nombre;
    private int vida;
    private int ataque;

    //Constructores

    public Enemigo(){
        nombre="";
        vida=20;
        ataque=5;
    }

    public Enemigo(String nombre, int vida, int ataque){
        this.nombre=nombre;
        this.vida=vida;
        this.ataque=ataque;
    }

    public Enemigo (Enemigo copia){}

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

    public void imprimirEnemigo(){
        System.out.println("Enemigo");
        System.out.println(getNombre());
        System.out.println("HP: "+getVida());
        System.out.println("DMG: "+getAtaque());
    }

    
}
