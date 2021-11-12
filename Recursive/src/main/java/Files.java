import java.io.File;
import java.util.Arrays;

public class Files {
    public void printAllFolder(String path){
            File f = new File(path);
            File[] fileArray = f.listFiles();
            assert fileArray != null;
            Arrays.stream(fileArray).forEach(file->printFile(file,file.isDirectory()));
    }

    private void printFile(File file, boolean isFolder){
        if(isFolder){
            System.out.println(file.getName() + "->");
            printAllFolder(file.getPath());
        }else{
            System.out.println(file.getName());
        }
    }
}
