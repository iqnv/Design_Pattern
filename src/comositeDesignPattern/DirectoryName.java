package comositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DirectoryName implements FileSystem{

    String directoryName;
    List<FileSystem> fileSystemList;
    public DirectoryName(String name, List<FileSystem> file) {
        this.directoryName = name;
        this.fileSystemList = file;
    }
    @Override
    public void ls() {
        System.out.println("Directory Name : " + directoryName);
        for(FileSystem fileObject : fileSystemList) {
            fileObject.ls();
        }
    }
}
