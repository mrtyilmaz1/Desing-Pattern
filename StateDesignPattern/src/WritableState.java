class WritableState implements FileState {
    @Override
    public void read() {
        System.out.println("Dosya okuma işlemine izin veriyor.");
    }

    @Override
    public void write() {
        System.out.println("Dosya yazılıyor.");
    }

    @Override
    public void lock() {
        System.out.println("Dosya kilitleniyor.");
    }
}