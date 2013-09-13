/**
 *
 * @author Rosalia Edith Caya Carhuanina
 *         Departamento de Engenahria de Computação
 *         Escola Politécnica
 *         Universidade de São Paulo - USP
 */

package aahci;

import Middleware.MiddlewareManager;

public class AAHCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiddlewareManager mid = new MiddlewareManager();
        mid.iniciateMiddleware();
    }
}
