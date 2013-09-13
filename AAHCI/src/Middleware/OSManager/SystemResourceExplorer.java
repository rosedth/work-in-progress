/**
 *
 * @author Rosalia Edith Caya Carhuanina
 *         Departamento de Engenahria de Computação
 *         Escola Politécnica
 *         Universidade de São Paulo - USP
 */

package Middleware.OSManager;

import java.util.ArrayList;

public class SystemResourceExplorer {
   public void querySystemSpec(){
        ProgramLauncher PLauncher = new ProgramLauncher();
        String process = "msinfo32";
        String processPath = "C:\\Windows\\System32" + System.getProperty("file.separator");
        ArrayList<String> args = new ArrayList<String>();
        args.add("/report");
        args.add(".\\info.txt");
        PLauncher.ProcessLaunch(process, processPath, args);
        System.out.println("Querying System Specifications");
    }

    public void scanResources() {
        System.out.println("Scanning system resources");
    }
}
