package com.te.springmvcassignment;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvcassignment.employee.Employee;
import com.te.springmvcassignment.employeerepo.EmployeeRepo;

@Controller
public class DemoControll {
   @Autowired
	EmployeeRepo repo;
	
	@GetMapping("/index")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}
	
	@PostMapping("/ragister")
	public String ragister(@ModelAttribute Employee employee ) {
		repo.repo(employee);
		return "sucess.jsp";
	}
	@GetMapping("/delete")
	public String delect( ) {
		return "delete.jsp";
	}
	@PostMapping("/delete")
	public String delect1(@ModelAttribute Employee employee) {
		repo.remove(employee);
		return "deletesucess.jsp";
	}
	@GetMapping("/getinfo")
	public String getemp( ) {		
		return "getinfo.jsp";
	}
	@PostMapping("/getinfo")
	public String getdetails(@RequestParam String id, Model model) {
		System.out.println(id);
		Employee employee2=repo.get(Integer.parseInt(id));
		Model addAttribute = model.addAttribute(id, employee2);
		 model.addAttribute("id", employee2);
		if (addAttribute==null) {
			return "unsucess.jsp" ;
		}
		return "getsucess.jsp";
	}
	@GetMapping()
	public String update() {
		
	}
}
