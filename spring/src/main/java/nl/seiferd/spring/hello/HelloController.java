package nl.seiferd.spring.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String hi(@PathVariable("id") String id){
        return "Hi there " + id;
    }

}
