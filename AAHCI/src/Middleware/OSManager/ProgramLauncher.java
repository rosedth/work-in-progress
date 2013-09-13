/**
 *
 * @author Rosalia Edith Caya Carhuanina
 *         Departamento de Engenahria de Computação
 *         Escola Politécnica
 *         Universidade de São Paulo - USP
 */

package Middleware.OSManager;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class ProgramLauncher {
    private OSExplorer OSE;

    public ProgramLauncher() {
        super();
        OSE = new OSExplorer();
    }

    public void WebsiteLaunch(URI site) {
        // Opens the Website given as parameter though the default system browser. 	
        try {
            Desktop.getDesktop().browse(site);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ProcessLaunch(String processName, String processPath, List<String> processArgs) {
        // Starts the given program with the corresponding arguments
        List<String> comm = BuildCommandLine(processName, processPath, processArgs);
        ProcessBuilder pBuilder = new ProcessBuilder(comm);
        Process pro;
        try {
            pro = pBuilder.start();
            //Read out dir output
            InputStream is = pro.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            System.out.printf("Output of running %s is:\n",
                    comm.toString());
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            //Wait to get exit value
            int exitValue = pro.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (InterruptedException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }

    }

    private List<String> BuildCommandLine(String processName, String processPath, List<String> processArgs) {
        List<String> comm = new ArrayList<String>();
        comm.addAll(GetLaunchCommOS());
        comm.add(processPath + processName);
        comm.addAll(processArgs);
        return comm;
    }

    private List<String> GetLaunchCommOS() {
        List<String> launchingComm = new ArrayList<String>();
        OperatingSystemTypes OSType = OSE.GetOperatingSystemType();
        switch (OSType) {
            case WINDOWS:
                launchingComm.add("cmd.exe");
                launchingComm.add("/c");
                break;
            case MAC:
                break;
            case UNIX:
                break;
            case LINUX:
                break;
            case SOLARIS:
                break;
            default:
                break;
        }

        return launchingComm;
    }
}
