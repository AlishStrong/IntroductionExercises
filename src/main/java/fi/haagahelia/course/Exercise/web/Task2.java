package fi.haagahelia.course.Exercise.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * I additionally added if for the case when location = "home"
 * because grammatically "Welcome to home..." is incorrect,
 * I decided to include different return strings in my code,
 * one of which returns "Welcome " + location + ", " + name + "!",
 * when location = "home".
 * In other cases, the return string is "Welcome to " + location + ", " + name + "!"
 * */

@Controller
@ResponseBody
public class Task2 {
	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "location") String location, @RequestParam(name = "name") String name) {
		if (location.equals("home")) {
			return "Welcome " + location + ", " + name + "!";
		} else {
			return "Welcome to " + location + ", " + name + "!";
		}
	}
}
