package handIn;

public class Main {

    public static void main(String[] args) {

        String dirStringPath = "out/production/Exercise7/handIn/rootDir/";

        CommandLine cl = null;

        try {
            cl = new CommandLine(dirStringPath);

            System.out.println(cl.calculateSizeOfFilesInDirectiory());

        } catch (DirectoryPathException e){
            System.out.println(e.getErrorMsg());
        }
    }
}
