/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_creator;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julien
 */
public class FileCreator {

    public FileCreator(String path) {
        this.path = path;
        System.out.println(path);
    }

    public void initializeFolder() {
        this.createFolder(path);
        this.createFolder(path + "\\src");
        this.createFolder(path + "\\nbproject");
        this.createFolder(path + "\\build");

        this.createFolder(path + "\\src\\" + nomPackage);
    }

    public void initializeFile() {
        this.createFile(path + "\\src\\" + nomPackage + "\\" + nomProjet + ".java");
    }

    private void createFolder(String file) {
        new File(file).mkdir();
    }

    private void createFile(String path) {
        try {
            new File(path).createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FileCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void findTitle() {
        for (int i = 0; i < path.length(); i++) {
            if(path.substring(i) == "\\"){
                
            }
        }
    }

    private String path = "";
    private String nomProjet = "project";
    private String nomPackage = "main." + nomProjet;

}
