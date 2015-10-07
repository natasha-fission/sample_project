package com.fission.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.fission.beans.Movie;
import com.fission.dao.MovieDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/*private MovieDAO md;
	public void setMd(MovieDAO md) {
		this.md = md;
	}

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "AllMovies";
	}*/
	
	@RequestMapping(value = "/AllMovies")
	public String AllMovies(HttpServletRequest req, HttpServletResponse res) {
		Resource r=new ClassPathResource("servlet-context.xml");  
		BeanFactory factory=new XmlBeanFactory(r);  
		      
		MovieDAO mdao= (MovieDAO)factory.getBean("md");
		
		req.setAttribute("MList", mdao.listMovies());
		System.out.println("in all movies");
	return "ViewAll";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET )
	public String addNew(Model model)
	{
		return "addNew";
	}
	
	@RequestMapping(value="/addMovie", method=RequestMethod.POST )
	public void addMovie(HttpServletRequest req, HttpServletResponse res)
	{
		Resource r=new ClassPathResource("servlet-context.xml");  
		BeanFactory factory=new XmlBeanFactory(r);  
		      
		MovieDAO mdao= (MovieDAO)factory.getBean("md");
		
		Movie m= new Movie();
		m.setId(Integer.parseInt(req.getParameter("id")));
		m.setName(req.getParameter("name"));
		m.setDirector(req.getParameter("director"));
		m.setLanguage(req.getParameter("language"));
	//	m.setRelease( new Date(req.getParameter("date")));
		
		mdao.addMovie(m);
		AllMovies(req,res);
	}
	
}
