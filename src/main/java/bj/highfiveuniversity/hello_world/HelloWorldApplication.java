package bj.highfiveuniversity.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController //annotation qui dit à Spring que ce code décrit un endpoint (urlf) 
//Et cet url devait-être rendu disponible dans le navigateur 
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@GetMapping("/hello")
	//on définit une route GET "/hello"
	public String getMethodName(@RequestParam String param){
		return new String();
	}
	public String hello(String name){
		return String.format("Hello %s !",  name);
	}

}
