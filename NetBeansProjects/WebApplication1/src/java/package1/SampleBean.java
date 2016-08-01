/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author noriaki
 */
@Named(value = "sampleBean")
@RequestScoped
public class SampleBean {
    
    private String str1 = "";
    private String str2 = "";
    
    public void replace() {
        str1 = "再表示";
    }

    public String next() {
        return "regist.xhtml";
    }
    
}
