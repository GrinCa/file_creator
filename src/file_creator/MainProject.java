/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_creator;

import javax.swing.JFileChooser;

/**
 *
 * @author Julien
 */
public class MainProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser jFileChooser = new JFileChooser(".");
        int retour = jFileChooser.showOpenDialog(null);
        String path = ";";
        if(retour == JFileChooser.APPROVE_OPTION){
            path = jFileChooser.getSelectedFile().getAbsolutePath();
        }
        FileCreator fileCreator = new FileCreator(path);
        
    }
    
}
