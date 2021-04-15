package top.zksrw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.zksrw.main.Main;

@SpringBootApplication
public class CustomHostApplication implements CommandLineRunner {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(CustomHostApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //TODO: 程序主入口
        log.info("初次见面");
        Main main = new Main();
        main.test();
    }
}
