package nttdata.eureka.config.nttConfigEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //Servidor de registros de microservicios
@SpringBootApplication
public class NttConfigEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttConfigEurekaApplication.class, args);
	}

}
