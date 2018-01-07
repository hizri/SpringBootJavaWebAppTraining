package hizri.com.firstapplication.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller("error")
public class ErrorController {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", exception.getStackTrace());
		mv.addObject("url", request.getRequestURL());
		mv.setViewName("error");
		return mv;
	}
	
}
