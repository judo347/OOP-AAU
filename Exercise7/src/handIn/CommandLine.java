package handIn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CommandLine {

    private String dirString;
    private Path path;

    public CommandLine(String dirString) {
        this.dirString = dirString;
        dirChecks();
    }

    /** Used to check if the given path is valid. */
    /** Does it exist? Is it a directory? */
    private boolean dirChecks(){

        this.path = Paths.get(dirString);

        if(!Files.exists(path)){
            throw new DirectoryPathException("The directory does not exist!");
        }
        if (Files.isRegularFile(path)) {
            throw new DirectoryPathException("The file is not a directory.");
        }
        if (!Files.isReadable(path)) {
            throw new DirectoryPathException("The directory is not readable.");
        }

        return true;
    }


    public long calculateSizeOfFilesInDirectiory(){
        return calculateSizeOfFilesInDirectioryHelper(this.path, 0);
    }

    private long calculateSizeOfFilesInDirectioryHelper(Path path, long filesSize){

        System.out.println(path.toString());

        if(!Files.exists(path)){ // Exists check
            System.out.println("Should not get here?");
            return filesSize;
        }
        if (!Files.isRegularFile(path)) { // Directory check

            String[] directoryFilesList = path.toFile().list();

            long tempLong = 0;

            for(int i = 0; i < directoryFilesList.length; i++){
                tempLong += calculateSizeOfFilesInDirectioryHelper(Paths.get(path.toString(), "/", directoryFilesList[i]), filesSize);
            }

            return tempLong + filesSize;

            //Get list of files/directories in path directory
            //Create new path for alle
            //Call this again (return calculate....)
        }

        //If we reach this point then the path should be a file?
        //TODO: Need check for readable?
        try { //TODO HANDLE OUTPUT OF EXCEPTION
            return Files.size(path) + filesSize; //return file Size
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0; //Should not be reached
    }
}
