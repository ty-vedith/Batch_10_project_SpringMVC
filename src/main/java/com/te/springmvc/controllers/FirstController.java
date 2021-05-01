package com.te.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	@RequestMapping(path = "/first", method = RequestMethod.GET)
	public ModelAndView getFirstPage() {
		ModelAndView andView = new ModelAndView();
		andView.addObject("name", "Pradeep");
		andView.setViewName("/WEB-INF/views/app.jsp");
		andView.setViewName("app");
		return andView;

}
}
