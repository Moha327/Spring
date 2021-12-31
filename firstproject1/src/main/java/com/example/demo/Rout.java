package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rout {
	 @RequestMapping("/coding")
     public String index(){
         return "Hello Coding Dojo!";
       }
     @RequestMapping(value="/coding/python", method=RequestMethod.GET)
     public String python(){
       return "Python/Django was awesome!";
     }
     @RequestMapping(value="/coding/java" , method=RequestMethod.GET)
     public String world(){
       return "Java/Spring is better!";
     }
     @RequestMapping("/l/{track}")
     public String showLesson(@PathVariable("track") String  track){
     	return "The " + track +" is awesome!" ;
     }
     @RequestMapping("/{dojo}")
     public String showLesson2(@PathVariable("dojo") String dojo){
    	 if(dojo=="dojo") {return "The dojo is awesome!";}
	    	if(dojo.equals("burbank-dojo")) {return "Burbank Dojo is located in Southern California";}
	    	if(dojo.equals("san-jose")) {return "SJ dojo is the headquarters";}
	    	
	    	return dojo;
     }
}
