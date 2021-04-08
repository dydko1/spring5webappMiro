package guru.springframework.spring5webapp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

    @GetMapping({"/test12", "/hello"})
    public String hello(@RequestParam(value = "name", defaultValue = "World", required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("courses")
    public ModelAndView courses(@RequestParam("cname") String coursename)
    {
        //String cname= req.getParameter("cname");
        System.out.println("The course name is: " + coursename);
        //session.setAttribute("cname",coursename);
        ModelAndView mv =new ModelAndView();
        mv.addObject("cname", coursename);
        mv.setViewName("course");
        return mv;
    }
}