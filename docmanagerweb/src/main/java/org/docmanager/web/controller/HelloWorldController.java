package org.docmanager.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	
	@Value("${test.key}")
	String testKey;
	
	@GetMapping(value="/helloworld/{name}")
	public ModelAndView displayHelloWorld(@PathVariable String name)
	{
		Map<String, String> map = new HashMap<>();
		map.put("message", testKey);
		map.put("name", name);
		return new ModelAndView("helloworld", map );
	}
	
	@GetMapping(value="/test/hello", params= {"name","age"})
	public String anotherUrl(Model model, @RequestParam("name") String name)
	{
		model.addAttribute("message", "Ceci est le deuxieme controlleur");
		model.addAttribute("name", name);
		return "helloworld";
	}
}
