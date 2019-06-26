/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_creator;

/**
 *
 * @author Julien
 */
public class Data {

    public Data(String path) {
        this.path = path;
        this.projectTitle = findProjectTitle();
        this.packageTitle = "main." + projectTitle.toLowerCase();
    }

    private String findProjectTitle() {
        char[] tabChar = path.toCharArray();
        for (int i = path.length() - 1; i > 0; i--) {
            if (((int) tabChar[i]) == 92) {
                break;
            }
            projectTitle = tabChar[i] + projectTitle;
        }
        projectTitle = projectTitle.substring(0, 1).toUpperCase() + projectTitle.substring(1);
        return projectTitle;
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
