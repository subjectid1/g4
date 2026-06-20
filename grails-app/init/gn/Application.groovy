package gn

//import grails.boot.GrailsApp
//import grails.boot.config.GrailsAutoConfiguration
 import grails.boot.GrailsApp
//import groovy.transform.CompileStatic

 import org.springframework.boot.autoconfigure.EnableAutoConfiguration ;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration 
public class Application   {

	public static void main(String[] args) {
		       GrailsApp.run(Application.class, args);
	}
}