package med.voll.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// That's a controller, We use the "Rest" before the Controller because
//we are working with an API REST not a traditional application web
@RequestMapping("/hello")
/*
* We use this to say what is the URL that this controller is going to respond
* */
public class HelloController {

    @GetMapping
    /*
    * which HTTP protocol method is to call
    * */
    public String olaMundo(){
        return "Hello world Spring";
    }

}
