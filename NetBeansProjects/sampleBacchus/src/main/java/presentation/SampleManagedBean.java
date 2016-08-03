/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author noriaki
 */
@Named(value = "sampleManagedBean")
@RequestScoped
public class SampleManagedBean {

    public String next() {
        return "register.xhtml";
    }
    
}
