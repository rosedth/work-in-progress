/**
 *
 * @author Rosalia Edith Caya Carhuanina
 *         Departamento de Engenahria de Computação
 *         Escola Politécnica
 *         Universidade de São Paulo - USP
 */

package Middleware;

import Middleware.OSManager.*;
import Middleware.Wrapper.*;

public class MiddlewareManager {

    public boolean iniciateMiddleware() {
        boolean result = false;
        SystemResourceExplorer sysExp = new SystemResourceExplorer();
        InteractionMonitor iMonitor = new InteractionMonitor();
        sysExp.querySystemSpec();
        sysExp.scanResources();
        iMonitor.getUserProfile();
        iMonitor.scanEnvironmentalInfo();
        UserInformationWrapper userWrapper = new UserInformationWrapper();
        SystemInformationWrapper sysWrapper = new SystemInformationWrapper();
        EnvironmentalInformationWrapper envWrapper = new EnvironmentalInformationWrapper();
        userWrapper.formatInformation();
        sysWrapper.formatInformation();
        envWrapper.formatInformation();
        requestContextCreation();
        return result;
    }

    private void requestContextCreation() {
        System.out.println("Requesting Context creation to Cloud layer");
    }
}
