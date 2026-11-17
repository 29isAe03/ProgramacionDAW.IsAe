package Ejercicios.Ejercicio6;

public class Juego{

    //Atributos
    private int ganadas1;
    private int ganadas2;
    private Jugador jugador1;
    private Jugador jugador2;

    //Constructores
    public Juego(){
        ganadas1=0;
        ganadas2=0;
    }

    public Juego(int ganadas1, int ganadas2, Jugador jugador1, Jugador jugador2){
        this.ganadas1=ganadas1;
        this.ganadas2=ganadas2;
        this.jugador1=jugador1;
        this.jugador2=jugador2;
    }

    public Juego(Juego copia){}

    //Metodos

    public int getGanadas1() {
        return ganadas1;
    }

    public void setGanadas1(int ganadas1) {
        this.ganadas1 = ganadas1;
    }

    public int getGanadas2() {
        return ganadas2;
    }

    public void setGanadas2(int ganadas2) {
        this.ganadas2 = ganadas2;
    }

    public Jugador getJugador1() {
        return jugador1;
    }
    
    public void setJugador1(Jugador jugador1) {
        this.jugador1=jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2){
        this.jugador2=jugador2;
    }

    //Metodo que imprime informacion
    public void imprimirJuego(){
        System.out.println("Victorias del Jugador 1: "+getGanadas1());
        System.out.println("Victorias del Jugador 2: "+getGanadas2());
    }

    public void cartaAlta(){
      int max=12;
        int min=1;

        do{

            getJugador1().getCarta().setValor((int)(Math.random()*(max-min+1)+min));
            System.out.println("Jugador 1");
            getJugador1().imprimirJugador();
            getJugador1().getCarta().imprimirCarta();
            getJugador2().getCarta().setValor((int)(Math.random()*(max-min+1)+min));
            System.out.println("Jugador 2");
            getJugador2().imprimirJugador();
            getJugador2().getCarta().imprimirCarta();

            if(cartaJugador1.getValor()>cartaJugador2.getValor()){
                System.out.println(jugador1.getNombre()+" ha ganado");
                juego.setGanadas1(juego.getGanadas1()+1);
            }else if(cartaJugador1.getValor()<cartaJugador2.getValor()){
                System.out.println(jugador2.getNombre()+" ha ganado");
                juego.setGanadas2(juego.getGanadas2()+1);
            }
            System.out.println("------------------------------");

            if(juego.getGanadas1()==3){
                System.out.println(jugador1.getNombre()+" ha ganado la partida!");
            }
            else if(juego.getGanadas2()==3){
                System.out.println(jugador2.getNombre()+" ha ganado la partida!");
            }
        }while(juego.getGanadas1()<3 || juego.getGanadas2()<3);
    }

    }

    public static void main(String[] args) {
        Carta cartaJugador1=new Carta();
        Carta cartaJugador2=new Carta();
        Jugador jugador1=new Jugador("Santiago", cartaJugador1);
        Jugador jugador2=new Jugador("Maria", cartaJugador2);
        Juego juego=new Juego();

        
    
}
