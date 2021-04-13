package guru.springframework.spring5webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Servlet {
	@GetMapping("helloworldM")
	public String helloworldM(Model model) {
		// add some attributes using model
		return "helloM";
	}

	@GetMapping("helloworldMV1")
	public ModelAndView helloWorldMV() {
		ModelAndView modelAndView = new ModelAndView("helloMV");
		return modelAndView;
	}
}
