package handIn;

import javax.swing.*;
import java.nio.file.Path;

public class MainDC extends JFrame {

    public static void main(String[] args) {

        DirectoryChooser dc = new DirectoryChooser();

        Path path = dc.getPath();
        System.out.println();



        CommandLine cl = null;

        try {
            cl = new CommandLine(path.toString());

            System.out.println(cl.calculateSizeOfFilesInDirectiory());

        } catch (DirectoryPathException e){
            System.out.println(e.getErrorMsg());
        }


    }

    private static class DirectoryChooser extends JPanel {

        JFileChooser fc;
        Path path;

        public DirectoryChooser(){
            this.fc = new JFileChooser();
            fc.setDialogTitle(" ");
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            setPath();
        }

        private void setPath(){
            fc.showDialog(this, "Choose Directory");
            this.path = fc.getSelectedFile().toPath();
        }

        public Path getPath() {
            return path;
        }
    }
}
