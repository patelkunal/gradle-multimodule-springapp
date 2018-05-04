package webservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
public class ServiceApp {

	public static void main(String []args) {
		System.out.println("ServiceApp is starting !!");
		SpringApplication.run(ServiceApp.class, args);
		System.out.println("ServiceApp is shutting down !!");
	}

}
