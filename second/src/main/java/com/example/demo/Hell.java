package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Hell {
	 @RequestMapping("/")
	 public String index(Model model) {
	        model.addAttribute("dojoName", "Burbank");
	        return "index.jsp";
	    }
	 @RequestMapping("/{track}")
	    public String showLesson(@PathVariable("track") String track){
	    	return "index2.jsp";
	    }
}
