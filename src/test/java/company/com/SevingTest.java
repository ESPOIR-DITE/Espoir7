package company.com;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SevingTest extends TestCase {
    Account account,account1;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Configur.class);
        account=(Account)ctx.getBean("checkAccount");
        account1=(Account)ctx.getBean("servingAccount");

    }

    public void tearDown() throws Exception {
    }

    @Test
    public void testInterest() {
        double balance=200;

        double result = account.interest(balance);
        Assert.assertEquals(result,30,0);
    }
    @Test
    public void testInterest1() {
        double balance=200;

        double result = account1.interest(balance);
        Assert.assertEquals(result,20,0);
    }

}