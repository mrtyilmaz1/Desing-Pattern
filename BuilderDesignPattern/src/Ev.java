public class Ev{

    private String il;
    private String ilce;
    private String mahalle;

    private int binaYili;
    private int balkonSayisi;
    private int odaSayisi;
    private int banyoSayisi;



    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukParki;

    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", binaYili=" + binaYili +
                ", balkonSayisi=" + balkonSayisi +
                ", odaSayisi=" + odaSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", isEsyali=" + isEsyali +
                ", hasOtopark=" + hasOtopark +
                ", hasCocukParki=" + hasCocukParki +
                '}';
    }

    public Ev(EvBuilder evBuilder) {

       this.il = evBuilder.il;
       this.ilce = evBuilder.ilce;
       this.mahalle = evBuilder.mahalle;

       this.binaYili = evBuilder.binaYili;
       this.balkonSayisi = evBuilder.balkonSayisi;
       this.odaSayisi = evBuilder.odaSayisi;
       this.banyoSayisi = evBuilder.banyoSayisi;

       this.isEsyali = evBuilder.isEsyali;
       this.hasOtopark = evBuilder.hasOtopark;
       this.hasCocukParki = evBuilder.hasCocukParki;


    }

    public String getIl() {
        return il;
    }

    public String getIlce() {
        return ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public int getBinaYili() {
        return binaYili;
    }

    public int getBalkonSayisi() {
        return balkonSayisi;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public boolean isEsyali() {
        return isEsyali;
    }

    public boolean isHasOtopark() {
        return hasOtopark;
    }

    public boolean isHasCocukParki() {
        return hasCocukParki;
    }

    public static class EvBuilder {

        private String il;
        private String ilce;
        private String mahalle;

        private int binaYili;
        private int balkonSayisi;
        private int odaSayisi;
        private int banyoSayisi;



        private boolean isEsyali;
        private boolean hasOtopark;
        private boolean hasCocukParki;

        public EvBuilder(String il, String ilce, int odaSayisi, boolean isEsyali) {
            this.il = il;
            this.ilce = ilce;
            this.odaSayisi = odaSayisi;
            this.isEsyali = isEsyali;
        }

        public EvBuilder setMahalle(String mahalle) {
            this.mahalle = mahalle;

            return this;

        }

        public EvBuilder setBinaYili(int binaYili) {
            this.binaYili = binaYili;
            return this;
        }

        public EvBuilder setBalkonSayisi(int balkonSayisi) {
            this.balkonSayisi = balkonSayisi;
            return this;
        }

        public EvBuilder setBanyoSayisi(int banyoSayisi) {
            this.banyoSayisi = banyoSayisi;
            return this;
        }

        public EvBuilder setHasOtopark(boolean hasOtopark) {
            this.hasOtopark = hasOtopark;
            return this;
        }

        public EvBuilder setHasCocukParki(boolean hasCocukParki) {
            this.hasCocukParki = hasCocukParki;
            return this;
        }
        public Ev build(){
            return new Ev(this);
        }
    }

}

