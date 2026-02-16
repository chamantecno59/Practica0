package ito.poo;

public class app {
    static Mascota Mascota;
    static void run(){
        Mascota = new Mascota("satur",2,"perro","Chiuaua");
        System.out.println(Mascota);
        Mascota.cumpleaños();
        System.out.println("el siguite compleaños:"+Mascota);


    }






        public static void main(String[] args) {
            run ();
        }
    }

