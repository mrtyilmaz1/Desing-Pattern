public class Emlakci {

    public static void main(String[] args) {

        Ev ev1 = new Ev.EvBuilder("Ankara" , "Sincan" , 3, true).build();
        Ev ev2 = new Ev.EvBuilder("Denizli" , "Merkez" , 5, false)
                .setBalkonSayisi(2)
                .setHasCocukParki(false).build();

        Ev ev3 = new Ev.EvBuilder("İstanbul" , "Fatih" , 2, true)
                .setBanyoSayisi(1)
                .setHasOtopark(true).build();

        System.out.println();
        System.out.println(ev1);
        System.out.println(ev2);
        System.out.println(ev3);






    }


}