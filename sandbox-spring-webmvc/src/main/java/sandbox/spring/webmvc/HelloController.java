package sandbox.spring.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
class HelloController
{

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model)
    {
        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";
    }
}