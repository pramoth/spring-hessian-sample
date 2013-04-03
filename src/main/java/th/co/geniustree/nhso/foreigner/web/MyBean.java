/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.nhso.foreigner.web;

import java.io.Serializable;

/**
 *
 * @author pramoth
 */
public class MyBean implements Serializable{
    private  String info;

    public MyBean(String info) {
        this.info=info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
}
