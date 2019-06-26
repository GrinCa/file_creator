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
public class ProcessFiles {

    public ProcessFiles(Data data) {
        this.data = data;
    }

    public void build() {
        new File(data.getPath() + "\\" + "build").mkdir();
        File[] src = new File(data.getPath() + "\\" + "src").listFiles();
        for(File file : src){
            if(file.getName().contains(".java")){
                
            }
        }  
    }
    
    private void execute(){
        
    }

    private Data data;
}
