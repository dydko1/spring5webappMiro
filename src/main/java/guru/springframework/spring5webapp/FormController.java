package guru.springframework.spring5webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@Autowired
	CustomerRepo repo;

	@RequestMapping("/")
	public String edureka() {
		return "edureka";
	}

	@RequestMapping("/details")
	public String details(Customers customers) {
		repo.save(customers);
		return "edureka";
	}

	@RequestMapping("/getdetails")
	public String getdetails(Customers customers) {
		return "ViewCustomers";
	}

	@PostMapping("/getdetails")
	public ModelAndView getdetails(@RequestParam Long cid) {
		ModelAndView mv = new ModelAndView("Retrive");
		Customers customers = repo.findById(cid).orElse(null);
		mv.addObject(customers);
		return mv;
	}

	/*
	 * @PostMapping("details") public String viewdetails(@RequestParam("cid") int
	 * cid, @RequestParam("cname") String cname,
	 * 
	 * @RequestParam("cemail") String cemail, ModelMap modelMap) {
	 * modelMap.put("cid", cid); modelMap.put("cname", cname);
	 * modelMap.put("cemail", cemail); return "ViewCustomers"; }
	 */
}
