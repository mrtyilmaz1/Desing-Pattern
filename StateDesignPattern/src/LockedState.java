
    class LockedState implements FileState {
        @Override
        public void read() {
            System.out.println("Dosya kilitli olduğu için okuma işlemi yapılamaz.");
        }

        @Override
        public void write() {
            System.out.println("Dosya kilitli olduğu için yazma işlemi yapılamaz.");
        }

        @Override
        public void lock() {
            System.out.println("Dosya zaten kilitli.");
        }
    }


