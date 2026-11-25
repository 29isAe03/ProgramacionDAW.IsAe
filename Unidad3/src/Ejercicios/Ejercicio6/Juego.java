package Ejercicios.Ejercicio6;

import java.io.FileWriter;
import java.io.PrintWriter;

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

    //Hago un metodo para que pueda salir un palo aleatorio, creando un numero aleatorio y un switch con cada numero
    public Palos obtenerPalo(Palos oros, Palos copas, Palos espadas, Palos bastos){
        int numero=(int)(Math.random()*(4-1+1)+1);
        switch(numero){
            case 1: return bastos;
            case 2: return espadas; 
            case 3: return copas; 
            case 4: return oros;
            default: return bastos;
        }
    }

    //Metodo del juego
    public void cartaAlta(Palos oros, Palos copas, Palos espadas, Palos bastos){
        //Creo el maximo y el minimo para el numero aleatorio
        int max=12;
        int min=1;
       
        //Hago un do while ya que tiene que tiene que hacer algo hasta que uno de los jugadores llegue a 3 victorias
        do{
            //Pongo un valor a cada carta e imprimo la informacion de la carta y del jugador
            getJugador1().getCarta().setValor((int)(Math.random()*(max-min+1)+min));
            //Hago uso del metodo para conseguir el palo aleatorio
            getJugador1().getCarta().setPalo(obtenerPalo(oros, copas, espadas, bastos));
            System.out.println("Jugador 1");
            getJugador1().imprimirJugador();
            getJugador1().getCarta().imprimirCarta();
            getJugador2().getCarta().setValor((int)(Math.random()*(max-min+1)+min));
            getJugador2().getCarta().setPalo(obtenerPalo(oros, copas, espadas, bastos));
            System.out.println("Jugador 2");
            getJugador2().imprimirJugador();
            getJugador2().getCarta().imprimirCarta();
            //Hago la logica de quien gana y quien pierde
            if(getJugador1().getCarta().getValor()>getJugador2().getCarta().getValor()){
                System.out.println(jugador1.getNombre()+" ha ganado");
                setGanadas1(getGanadas1()+1);
            }else if(getJugador1().getCarta().getValor()<getJugador2().getCarta().getValor()){
                System.out.println(jugador2.getNombre()+" ha ganado");
                setGanadas2(getGanadas2()+1);
            }else if(getJugador1().getCarta().getValor()==getJugador2().getCarta().getValor()){
                //Si es un empate, recurro a los palos, creo una jerarquia de palos en el que Oro es el mas fuerte y Bastos el mas debil. Logro eso creando una clase de Palos con un atributo que sea la fuerza del palo
                System.out.println("Empate, comparacion de Palos");
                //Hago la misma logica que con el valor de las cartas, pero ahora con la fuerza de los palos
                if(getJugador1().getCarta().getPalo().getValor()>getJugador2().getCarta().getPalo().getValor()){
                    System.out.println(getJugador1().getNombre()+" ha ganado");
                    setGanadas1(getGanadas1()+1);
                }
                else if(getJugador1().getCarta().getPalo().getValor()<getJugador2().getCarta().getPalo().getValor()){
                    System.out.println(getJugador2().getNombre()+" ha ganado");
                    setGanadas2(getGanadas2());
                }else if(getJugador1().getCarta().getPalo().getValor()==getJugador2().getCarta().getPalo().getValor()){
                    //Si existe el caso en el que saquen el mismo numero y el mismo Palo. Seria un caso imposible, no puede haber 2 cartas iguales con el mismo numero y el mismo palo.
                    System.out.println("Caso imposible, se repite");
                }
            }
            System.out.println("------------------------------");
             
            //Cuando alguno de los jugadores llegue a 3 victorias, imprimira el ganador
            if(getGanadas1()==3){
                System.out.println(jugador1.getNombre()+" ha ganado la partida!");
            }
            else if(getGanadas2()==3){
                System.out.println(jugador2.getNombre()+" ha ganado la partida!");
            }
        }while(getGanadas1()<3 || getGanadas2()<3);
     }

    
    


    public static void main(String[] args) {
        //Creo todas las clases primero
        //Palos
        Palos oros=new Palos(4, "Oros");
        Palos copas=new Palos(3, "Copas");
        Palos espadas=new Palos(2, "Espadas");
        Palos bastos=new Palos(1, "Bastos");
        //Cartas de cada jugador

        Carta cartaJugador1=new Carta();
        Carta cartaJugador2=new Carta();
        

        //Jugadores
        Jugador jugador1=new Jugador("Santiago", cartaJugador1);
        Jugador jugador2=new Jugador("Adán", cartaJugador2);
        //El juego
        Juego juego=new Juego(0, 0, jugador1, jugador2);
        
        //Uso el metodo
        juego.cartaAlta(oros,copas, espadas, bastos);
         //Ahora tengo que guardar el historial de partidas en un .txt que se guardara en la carpeta de las clases
        try{
            //Hago que cree el fichero
            FileWriter fileWriter = new FileWriter("./Unidad3/src/Ejercicios/Ejercicio6/Victorias.txt", true); //Pongo el Append para que se pueda actualizar con cada partida
            PrintWriter printWriter = new PrintWriter(fileWriter);
            //Depende quien gane pondra una cosa en el historial u otra
            if(juego.getGanadas1()==3){
                printWriter.println(juego.getJugador1().getNombre()+" gano a "+juego.getJugador2().getNombre());
            }
            else if(juego.getGanadas2()==3){
                printWriter.println(juego.getJugador2().getNombre()+" gano a "+juego.getJugador1().getNombre());
            }     
            printWriter.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        
    
    }


}
