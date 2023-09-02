
public class Main {
    public static void main(String[] args) {
        File file = new File();
        System.out.println("Dosyanın başlangıç durumu: " + file.getFileState().getClass().getName());
        System.out.println();
        file.read();
        file.write();
        file.lock();

        System.out.println("**************************");

        System.out.println("Dosyanın şuanki durumu durumu: " + file.getFileState().getClass().getName());
        System.out.println();
        file.read();
        System.out.println("Dosyanın şuanki durumu durumu: " + file.getFileState().getClass().getName());
        file.write();
        System.out.println("Dosyanın şuanki durumu durumu: " + file.getFileState().getClass().getName());
        file.lock();
        System.out.println("Dosyanın şuanki durumu durumu: " + file.getFileState().getClass().getName());

        System.out.println();

        System.out.println("Dosyanın son durumu: " + file.getFileState().getClass().getName());



        }
    }
