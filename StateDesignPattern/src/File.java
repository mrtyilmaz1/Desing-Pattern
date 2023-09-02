class File {
    private FileState fileState;

    public File() {
        setFileState(new LockedState());
    }

    public void read(){
        fileState.read();
        if (fileState instanceof WritableState || fileState instanceof LockedState){
            setFileState(new ReadableState());
            System.out.println("Dosya durumu:" + fileState.getClass().getName());
        }
    }

    public void write(){
        fileState.write();
        if (fileState instanceof ReadableState || fileState instanceof LockedState){
            setFileState(new WritableState());
            System.out.println("Dosya durumu:" + fileState.getClass().getName());
        }
    }

    public void lock(){
        fileState.lock();
        if (fileState instanceof ReadableState || fileState instanceof WritableState){
            setFileState(new LockedState());
            System.out.println("Dosya durumu:" + fileState.getClass().getName());
        }
    }

    public FileState getFileState() {
        return fileState;
    }

    public void setFileState(FileState fileState) {
        this.fileState = fileState;
    }


}