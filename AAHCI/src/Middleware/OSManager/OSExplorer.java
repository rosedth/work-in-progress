/**
 *
 * @author Rosalia Edith Caya Carhuanina
 *         Departamento de Engenahria de Computação
 *         Escola Politécnica
 *         Universidade de São Paulo - USP
 */

package Middleware.OSManager;

public class OSExplorer {
    String name;
    String version;

    public OSExplorer() {
        super();
        this.name = System.getProperty("os.name");
        this.version = System.getProperty("os.version");
    }

    public OperatingSystemTypes GetOperatingSystemType() {
        String OS = this.name.toLowerCase();
        OperatingSystemTypes type;
        if (isWindows(OS)) {
            type = OperatingSystemTypes.WINDOWS;
        } else if (isMac(OS)) {
            type = OperatingSystemTypes.MAC;
        } else if (isUnix(OS)) {
            type = OperatingSystemTypes.UNIX;
        } else if (isLinux(OS)) {
            type = OperatingSystemTypes.LINUX;
        } else if (isSolaris(OS)) {
            type = OperatingSystemTypes.SOLARIS;
        } else {
            type = OperatingSystemTypes.OTHERS;
            System.out.println("It has not being possible to recognize the category of your OS");
        }
        return type;
    }

    private boolean isWindows(String OS) {
        return (OS.indexOf("win") >= 0);
    }

    private boolean isMac(String OS) {
        return (OS.indexOf("mac") >= 0);
    }

    private boolean isUnix(String OS) {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("aix") > 0);
    }

    private boolean isLinux(String OS) {
        return (OS.indexOf("nux") >= 0);
    }

    private boolean isSolaris(String OS) {
        return (OS.indexOf("sunos") >= 0);
    }
}
