/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_creator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julien
 */
public class FileCreator {

    public FileCreator(Data data) {
        this.path = data.getPath();
        this.projectTitle = data.getProjectTitle();
        this.packageTitle = data.getPackageTitle();
    }

    public void initializeFolder() {
        this.createFolder(path);
        this.createFolder(path + separator + "src");
        this.createFolder(path + separator + "nbproject");
        this.createFolder(path + separator + "build");

        this.createFolder(path + separator + "src" + separator + packageTitle);
    }

    public void initializeFile() {
        this.createFile(path + separator + "src" + separator + packageTitle + separator + projectTitle + ".java");
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

    

    public void insertTextFileJava() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path + separator + "src" 
                    + separator + packageTitle + separator + projectTitle + ".java"));
            br = new BufferedReader(new FileReader("C:\\Users\\Julien\\texte base Java.txt"));
            while (br.ready()) {
                bw.write(br.readLine()+"\n");
            }
            br.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileCreator.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getPath() {
        return path;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public String getPackageTitle() {
        return packageTitle;
    }
    
    

    private String path = "";
    private String projectTitle = "";
    private String packageTitle = "";
    private String separator = "\\";

}
