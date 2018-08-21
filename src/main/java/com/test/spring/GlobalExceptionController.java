package com.test.spring;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionController {

	
	/**
	 * This below method shows  exception handling  global with CustomGenericException
	 */
	@ExceptionHandler(CustomGenericException.class)
	public ModelAndView handleCustomException(CustomGenericException ex) {
		ModelAndView model = new ModelAndView("generic_error");
		model.addObject("errMsg", ex.getErrMsg());
		return model;
	}
	
	
	/**
	 * This below method shows  exception handling  global with ArithmeticException
	 */
	@ExceptionHandler(ArithmeticException.class)
	public ModelAndView handleArithmeticException(Exception e) {
		ModelAndView model = new ModelAndView("generic_error");
		model.addObject("errMsg",e.getLocalizedMessage());
		return model;
	}
	
}