package hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

//    @RequestMapping("/")
//    @ResponseBody
//    public String index() {
//        return "home";
//    }

    @PostMapping("/instabot")
    public String botBost(@RequestBody String body){
        //System.out.println(body);
        return body;
    }
}