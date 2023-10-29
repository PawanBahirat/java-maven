package javamaven.javamaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMavenApplication.class, args);
		
		getData();
	}
	@GetMapping(value = "/get-data")
	public static Object getData() {
	    return new Object() {
	        public String name = "pawan";
	    };
	}
}
