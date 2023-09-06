public class TelefonFabrikası {
    public static Telefon getTelefon(String model, String batarya, int en, int boy){

        Telefon telefon;
        if ("S8".equalsIgnoreCase(model)){  // equalsIgnoreCase , IgnoreCase, küçük harf büyük harf duyarlılığı olmaması için.
            telefon = new S8(model, batarya, en, boy);
        } else if ("Note8".equalsIgnoreCase(model)){
            telefon = new Note8(model, batarya, en, boy);
        } else {
            throw new RuntimeException("Geçerli bir model değildir!");
        }

        return telefon;
    }
}
