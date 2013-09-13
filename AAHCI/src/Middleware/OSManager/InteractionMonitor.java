/**
 *
 * @author Rosalia Edith Caya Carhuanina
 *         Departamento de Engenahria de Computação
 *         Escola Politécnica
 *         Universidade de São Paulo - USP
 */

package Middleware.OSManager;

public class InteractionMonitor {
    /*
     * Because the user's profile will be obtained once and after that mantained 
     * and updated locally the corresponding name starts with get. 
     */

    public void getUserProfile() {
        System.out.println("Accessing user profile");
    }

    /* 
     * Because the method will be executed continuosly with a monitoring purpose
     * the corresponding name starts with scan.
     */
    public void scanEnvironmentalInfo() {
        System.out.println("Querying Environmetal Information");
    }
}
