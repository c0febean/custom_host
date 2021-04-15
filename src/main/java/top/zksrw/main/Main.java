package top.zksrw.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Main {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Value("${address.domain}")
    public String ipAddressUrl;


    @Value("${address.hosts}")
    private List<String> hosts;

    public void test(){
        System.out.println(ipAddressUrl);
        for (String hosts : hosts) {
            System.out.println(hosts);
        }
    }

}
