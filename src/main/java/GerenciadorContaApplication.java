import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"br.com.gerenciadorconta"})
public class GerenciadorContaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorContaApplication.class, args);
    }

}
