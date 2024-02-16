package comositeDesignPattern;

public class FileName implements FileSystem{

    String fileName;

    public FileName(String name) {
        this.fileName =name;
    }
    @Override
    public void ls() {
        System.out.println("Filename is : " + fileName);
    }
}
