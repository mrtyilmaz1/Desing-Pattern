class ReadableState implements FileState {
    @Override
    public void read() {
        System.out.println("Dosya okunuyor.");
    }

    @Override
    public void write() {
        System.out.println("Dosya yazma işlemine izin veriyor.");
    }

    @Override
    public void lock() {
        System.out.println("Dosya kilitleniyor.");
    }
}