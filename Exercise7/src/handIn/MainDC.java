package handIn;

import javax.swing.*;
import java.nio.file.Path;

public class MainDC extends JFrame {

    public static void main(String[] args) {

        //Present the user with dialog and get path.
        DirectoryChooser dc = new DirectoryChooser();
        Path path = dc.getPath();

        CommandLine cl = null;
        long byteSize;

        try {
            cl = new CommandLine(path.toString());
            byteSize = cl.calculateSizeOfFilesInDirectory();

            System.out.println("The directory at the path:");
            System.out.println(cl.getPathDirString());
            System.out.println("Contains " + byteSize + " bytes.");

        } catch (DirectoryPathException e){
            System.out.println(e.getErrorMsg());
        }
    }

    /** This class us used to show a directoryChooser and holds a path to the chosen directory. */
    private static class DirectoryChooser extends JPanel {

        JFileChooser fc;
        Path path;

        public DirectoryChooser(){
            this.fc = new JFileChooser();
            fc.setDialogTitle("Directory Chooser");
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            setPath();
        }

        /** Show the dialog and sets the path. */
        private void setPath(){
            fc.showDialog(this, "Choose Directory");
            this.path = fc.getSelectedFile().toPath();
        }

        public Path getPath() {
            return path;
        }
    }
}
