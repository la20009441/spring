package com.wipro.fsd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.fsd.model.StudentMarks;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MarksController {
	
	//private static final Logger logger = LoggerFactory.getLogger(MarksController.class);
	
/*	*//**
	 * Simply selects the home view to render by returning its name.*//*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale	 is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}*/
	@RequestMapping(value= {"/displayMarksForm","/"}, method=RequestMethod.GET)
	public ModelAndView marks(Model model) {
		StudentMarks studentMarks = new StudentMarks();
		model.addAttribute("studentMarks", studentMarks);
		return new ModelAndView("displayMarksForm");
	}
	
	@RequestMapping(value="/displayTotalMarks",method=RequestMethod.POST)
	public ModelAndView output(Model model,@ModelAttribute("studentMarks") StudentMarks studentMarks) {
		model.addAttribute("stdName", studentMarks.getStdName());
		model.addAttribute("totalMarks", (studentMarks.getEngMark()+studentMarks.getMatMark()+studentMarks.getSciMark()));
		return new ModelAndView("displayTotalMarks");
	}
}
