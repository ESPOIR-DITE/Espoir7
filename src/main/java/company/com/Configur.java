package company.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Configur {
    @Bean(name="servingAccount")
    public Account getService()
    {
        return new Seving();
    }
    @Bean(name="checkAccount")
    public Account getCheck()
    {
        return new Check();
    }
}
