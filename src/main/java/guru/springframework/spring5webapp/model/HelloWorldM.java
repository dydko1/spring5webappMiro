package guru.springframework.spring5webapp.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import guru.springframework.spring5webapp.dao.PlanetDAO;

@Controller
public class HelloWorldM {
	@GetMapping("helloworldM")
	public String helloworldM(Model model) {
///
		return "helloM";
	}

	private void addPlanets() {
		// TODO Auto-generated method stub
		
	}

	@GetMapping("helloworldMV1")
	public ModelAndView helloWorldMV() {
		ModelAndView modelAndView = new ModelAndView("helloMV");
		return modelAndView;
	}
}
