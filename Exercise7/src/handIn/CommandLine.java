package handIn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CommandLine {

    private String pathDirString;
    private Path path;

    /** This object is used to count bytes in a directory.
     *  @param pathDirString a string containing the path of a directory. */
    public CommandLine(String pathDirString) {
        this.pathDirString = pathDirString;
        dirChecks();
    }

    /** Method checks if the given path is valid.
     *  Does the destination exist, is it a directory and can it be read?
     *  @return returns true if the */
    private boolean dirChecks(){

        this.path = Paths.get(pathDirString);

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

    /** This starts a recursive process of finding the byte size of a directory and what it contains.
     *  @return size of directory in bytes. */
    public long calculateSizeOfFilesInDirectory(){
        return calculateSizeOfFilesInDirectoryHelper(this.path, 0);
    }

    /** Recursive method to calculate the byte size of a directory and what it contains.
     *  @param path the path to a directory or file.
     *  @param filesSize the current calculated fileSize. */
    private long calculateSizeOfFilesInDirectoryHelper(Path path, long filesSize){

        if(!Files.exists(path)){ // Exists check
            throw new DirectoryPathException("The directory does not exist!"); //Should not be able to go here. Was checked in "dirChecks".
        }
        if (!Files.isRegularFile(path)) { // Directory check

            //Get a list of files/folder in this directory
            String[] directoryFilesList = path.toFile().list();

            long tempLong = 0;

            //Sum byte size of all files and folders in this directory.
            for(int i = 0; i < directoryFilesList.length; i++){
                tempLong += calculateSizeOfFilesInDirectoryHelper(Paths.get(path.toString(), "/", directoryFilesList[i]), filesSize);
            }

            return tempLong + filesSize;
        }

        try { //The current path is a file. Get size and return.
            return Files.size(path) + filesSize; //return file Size
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0; //Should not be reached
    }

    public String getPathDirString() {
        return pathDirString;
    }
}
