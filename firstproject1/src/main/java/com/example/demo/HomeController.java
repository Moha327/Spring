package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	
	
	        @RequestMapping("/greeting")
	        public String index(){
	            return "Hello user!";
	          }
	        @RequestMapping(value="/greeting/hello", method=RequestMethod.GET)
	        public String hello(){
	          return "Hello world! What route did you use to access me?";
	        }
	        @RequestMapping("/greeting/goodbye")
	        public String world(){
	          return "Goodbye world!";
	        }
	        @RequestMapping("/m/{track}/{module}/{lesson}")
	        public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
	        	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
	        }
}
