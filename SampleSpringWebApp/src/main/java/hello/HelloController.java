package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
public class HelloController {
	
	private static final String template = "Hello, %s!";
	
    @RequestMapping("/welcome")
    public HelloUser helloUser(@RequestParam(value="name", defaultValue="World") String name) {
        return new HelloUser(String.format(template, name));
    }

}