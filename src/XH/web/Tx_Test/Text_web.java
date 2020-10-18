package XH.web.Tx_Test;


import XH.web.Tx_Service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text_web {
    @Test
    public void demo(){
        String xmlPath = "XH\\web\\applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService = (AccountService) applicationContext.getBean("proxyAccountService");
        accountService.transfer("杰克","Tom",100);




    }
}
