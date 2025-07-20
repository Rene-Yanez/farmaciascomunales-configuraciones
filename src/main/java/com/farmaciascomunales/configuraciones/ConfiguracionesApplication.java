import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableScheduling 
public class ConfiguracionesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfiguracionesApplication.class, args);
    }
}