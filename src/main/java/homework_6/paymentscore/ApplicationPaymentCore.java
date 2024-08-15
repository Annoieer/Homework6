package homework_6.paymentscore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ApplicationPaymentCore {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationPaymentCore.class);
        Map<String, Object> map = new HashMap<>();
        map.put("server.port", "8282");
        map.put("server.servlet.context-path", "/payments-app");
        application.setDefaultProperties(map);
        application.run(args);
    }
}
