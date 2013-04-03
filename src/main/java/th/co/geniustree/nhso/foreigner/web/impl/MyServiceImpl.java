/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.nhso.foreigner.web.impl;

import org.springframework.stereotype.Service;
import th.co.geniustree.nhso.foreigner.web.MyBean;
import th.co.geniustree.nhso.foreigner.web.MyService;

/**
 *
 * @author pramoth
 */
@Service
public class MyServiceImpl implements MyService{

    @Override
    public MyBean getMyBean(String info) {
        return new MyBean(info);
    }
    
}
