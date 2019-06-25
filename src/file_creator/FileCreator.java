/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_creator;

import java.io.File;

/**
 *
 * @author Julien
 */
public class FileCreator {
    
    public FileCreator(String path){
        this.path = path;
        System.out.println(path);
    }
    
    public void createFile(){
        
    }
    
    private String path = "";
}
