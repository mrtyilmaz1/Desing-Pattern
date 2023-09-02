public class EmlakciV2 {

    public static void main(String[] args) {

        Ev ev1 = EvBuilder.startNormalEvBuild("İstanbul", "Ümraniye", "Tatlısu", 2008, 3)
                .setHasCocukParki(true)
                .setHasOtopark(true)
                .build();

        Ev ev2 = EvBuilder.startHavuzluEvBuild("İstanbul", "Ataşehir", "Atatürk", 2010, 4)
                .setHasCocukParki(true)
                .setHasOtopark(true)
                .build();





    }


}