package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.rest.webservices.restfulwebservices.HelloWorldBean;


@CrossOrigin("http://localhost:4200")
@RestController
public class HelloWorld {
	
	@GetMapping(path="/hello-world")
	public String helloWorld()
	{
		return "Hello world from Rest";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
//		throw new RuntimeException("Some error occured, contact support team!!!");
		return new HelloWorldBean("Hello World from a Bean - changed");
	}
	
	@GetMapping(path="/hello-world-bean/path-var/{name}")
	public HelloWorldBean helloWorldPathVar(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello World, %s",name));
	}

}
