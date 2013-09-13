/**
 *
 * @author Rosalia Edith Caya Carhuanina
 *         Departamento de Engenahria de Computação
 *         Escola Politécnica
 *         Universidade de São Paulo - USP
 */

package Middleware.Wrapper;

public class UserInformationWrapper implements InformationWrapper{

    @Override
    public void formatInformation() {
        System.out.println("Formatting user information");
    }
}
