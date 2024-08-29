import Impl.Directory;
import Impl.File;

public class Main {
    public static void main(String[] args) {

        System.out.println("File System!");
        Directory dir = new Directory("Movies");
        dir.addDirectoryOrFile(new File("DDLJ"));
        dir.addDirectoryOrFile(new File("Kuch Kuch Hota hai"));
        Directory dir1 = new Directory("Hollywood Movies");
        dir1.addDirectoryOrFile(new File("Now you see me too!"));
        dir.addDirectoryOrFile(dir1);
        dir.ls();

    }
}