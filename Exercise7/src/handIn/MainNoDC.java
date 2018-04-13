package handIn;

public class MainNoDC {

    public static void main(String[] args) {

        String dirStringPath = "out/production/Exercise7/handIn/rootDir/";

        CommandLine cl = null;
        long byteSize;

        try {
            cl = new CommandLine(dirStringPath);
            byteSize = cl.calculateSizeOfFilesInDirectory();


            System.out.println("The directory at the path:");
            System.out.println(cl.getPathDirString());
            System.out.println("Contains " + byteSize + " bytes.");

        } catch (DirectoryPathException e){
            System.out.println(e.getErrorMsg());
        }
    }
}
