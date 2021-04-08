package guru.springframework.spring5webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
    @RequestMapping("/")
    public String edureka()
    {
        return "edureka";
    }

    // Post details method
}
