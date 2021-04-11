package guru.springframework.spring5webapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@RequestMapping("/customers")
	@ResponseBody
	public List<Customers> getCustomers() {
		return repo.findAll();
		// return repo.findAll().toString();
	}

	@RequestMapping("/customers/{cid}")
	@ResponseBody
	public Optional<Customers> getCustomer(@PathVariable("cid") long cid) {
		return repo.findById(cid);
		// return repo.findById(cid).toString();
	}

	@PostMapping("/customers")
	public Customers createCustomers(@RequestBody Customers customers) {
		repo.save(customers);
		return customers;
		// return repo.findAll().toString();
	}

	@DeleteMapping("/customers/{cid}")
	public Customers deleteCustomers(@PathVariable("cid") long cid) {
		Customers cust = repo.getOne(cid);
		repo.delete(cust);
		return cust;
		// return repo.findAll().toString();
	}

	@PutMapping(path = "/customers", consumes = { "application/json" })
	public Customers putCustomers(@RequestBody Customers customers) {
		repo.save(customers);
		return customers;
		// return repo.findAll().toString();
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
