package th.co.geniustree.nhso.foreigner.web.impl;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.caucho.hessian.client.HessianProxyFactory;
import java.net.MalformedURLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.geniustree.nhso.foreigner.web.MyBean;
import th.co.geniustree.nhso.foreigner.web.MyService;

/**
 *
 * @author pramoth
 */
public class MyServiceRemote {

    public MyServiceRemote() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void hello() throws MalformedURLException {
        String url = "http://localhost:8080/foreigner-web/remoting/myService";
        HessianProxyFactory factory = new HessianProxyFactory();
        MyService service = (MyService) factory.create(MyService.class, url);
        MyBean myBean = service.getMyBean("Hello");
        assertEquals("Hello",myBean.getInfo());
    }
}