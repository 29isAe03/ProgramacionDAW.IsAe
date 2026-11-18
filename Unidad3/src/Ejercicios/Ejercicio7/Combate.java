package Ejercicios.Ejercicio7;

public class Combate {
    //Atributos
    private Heroe heroe;
    private Enemigo enemigo;

    //Constructores

    public Combate(){}

    public Combate(Heroe heroe, Enemigo enemigo){
        this.heroe=heroe;
        this.enemigo=enemigo;
    }

    public Combate(Combate copia){}

    //Metodos

    public Heroe getHeroe() {
        return heroe;
    }

    public void setHeroe(Heroe heroe) {
        this.heroe = heroe;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    public static void main(String[] args) {
        Heroe heroe1=new Heroe("Santiago", 100, 40);
        Enemigo enemigo1=new Enemigo("Antuan", 200, 20);
        int contador=1;

        do{
            System.out.println("Turno "+contador);
            if(heroe1.getVida()>0){
                System.out.println("El Heroe ataca!");
                enemigo1.setVida(enemigo1.getVida()-heroe1.getAtaque());
                System.out.println("El enemigo tiene "+enemigo1.getVida()+"HP");
            }
            if(enemigo1.getVida()>0){
                System.out.println("El Enemigo ataca!");
                heroe1.setVida(heroe1.getVida()-enemigo1.getAtaque());
                System.out.println("El heroe tiene "+heroe1.getVida()+"HP");
                System.out.println("-------------------");
            }    
            contador++;
        }while(heroe1.getVida()>0 && enemigo1.getVida()>0);
        System.out.println("----------------");
        if(heroe1.getVida()>0){
            System.out.println("Victoria! El heroe ha derrotado al enemigo");
        }
        else if(enemigo1.getVida()>0){
            System.out.println("Derrota...El heroe ha perdido");
        }
    }

    
}
