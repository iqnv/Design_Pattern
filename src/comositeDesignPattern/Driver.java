package comositeDesignPattern;

import java.io.File;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {

        FileSystem fileName1 = new FileName("Endgame");
        FileSystem fileName2 = new FileName("Avenger");
        FileSystem fileName3 = new FileName("Infinity War");
        FileSystem direc = new DirectoryName("Movies", Arrays.asList(fileName2));
        FileSystem direcPar = new DirectoryName("Par", Arrays.asList(fileName1, fileName3, direc));
        direcPar.ls();

    }
}
