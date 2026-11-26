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
        //Creo un objeto de cada clase, poniendole una vida y un daño
        Heroe heroe1=new Heroe("Santiago", 100, 40);
        Enemigo enemigo1=new Enemigo("Antuan", 200, 20);
        //Creo un contador para llevar un numero de turnos
        int contador=1;
        //Creo unos valores como rango para poder empezar los turnos aleatoriamente
        int max=2;
        int min=1;
        

        //Hago un bucle do while que vaya haciendo turnos hasta que alguno de los dos llegue a 0 de HP
        do{
            //Creo el numero aletorio para que empiece cualquiera de los dos
            int primerTurno=(int)(Math.random()*(max-min+1)+min);
            if(primerTurno==1){
                //Muestra el numero de turno
                System.out.println("Turno "+contador);
                //Revisa si el heroe tiene mas de 0HP, si es asi, el heroe atacara
                if(heroe1.getVida()>0){
                    System.out.println("El Heroe ataca!");
                    //le resta la vida al enemigo segun su daño
                    enemigo1.recibirDanio(heroe1.getAtaque());
                    //Muestra la cantidad de vida que le queda al enemigo
                    System.out.println("El enemigo tiene "+enemigo1.getVida()+"HP");
                }
                //Lo mismo que con el heroe
                if(enemigo1.getVida()>0){
                    System.out.println("El Enemigo ataca!");
                    heroe1.recibirDanio(enemigo1.getAtaque());
                    System.out.println("El heroe tiene "+heroe1.getVida()+"HP");
                }
                System.out.println("-------------------");
                //Aumenta el contador para que aumente el numero de turno
                contador++;
            }    
            else{
                System.out.println("Turno "+contador);
                if(enemigo1.getVida()>0){
                    System.out.println("El Enemigo ataca!");
                    heroe1.recibirDanio(enemigo1.getAtaque());
                    System.out.println("El heroe tiene "+heroe1.getVida()+"HP");
                }
                if(heroe1.getVida()>0){
                    System.out.println("El Heroe ataca!");
                    enemigo1.recibirDanio(heroe1.getAtaque());
                    System.out.println("El enemigo tiene "+enemigo1.getVida()+"HP");
                }
                System.out.println("-------------------");
                contador++;
            }

        }while(heroe1.getVida()>0 && enemigo1.getVida()>0);
        System.out.println("----------------");
        //Si es el heroe que queda con mas de 0HP, sera una victoria, sino es asi, sera una derrota
        if(heroe1.getVida()>0){
            System.out.println("Victoria! El heroe ha derrotado al enemigo");
        }
        else if(enemigo1.getVida()>0){
            System.out.println("Derrota...El heroe ha perdido");
        }

    }

}

    


