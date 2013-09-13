/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rosalia Edith Caya Carhuanina
 *         Departamento de Engenahria de Computação
 *         Escola Politécnica
 *         Universidade de São Paulo - USP
 */

package Middleware.Wrapper;

public class SystemInformationWrapper implements InformationWrapper{

    @Override
    public void formatInformation() {
       System.out.println("Formatting system information"); 
    }
   
}
