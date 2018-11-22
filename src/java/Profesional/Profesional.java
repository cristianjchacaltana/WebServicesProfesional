/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesional;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author cristian jeancarlo
 */
@WebService
public class Profesional {
    
    @WebMethod
    public String getProfesion(){
        return "Ingenieria de Sistemas";
    }
    
}
