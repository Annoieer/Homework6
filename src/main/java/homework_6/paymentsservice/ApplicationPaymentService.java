package homework_6.paymentsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ApplicationPaymentService {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationPaymentService.class);
        Map<String, Object> map = new HashMap<>();
        map.put("server.port", "8585");
        map.put("server.servlet.context-path", "/payments-service");
        application.setDefaultProperties(map);
        application.run(args);
    }
}
