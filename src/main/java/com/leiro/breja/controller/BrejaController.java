package com.leiro.breja.controller;

import static com.leiro.breja.util.Constants.BREJA_CADASTRO;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.leiro.breja.model.Breja;
import com.leiro.breja.service.BrejaService;
import com.leiro.breja.service.BrejaServiceImpl;

@Controller
@RequestMapping("brejas")
public class BrejaController {
	
	public static final Log LOG = LogFactory.getLog(BrejaServiceImpl.class);
	
	@Autowired
	private BrejaService brejaService;
	
	@GetMapping("/novo")
	public String novo(Breja breja) {
		return BREJA_CADASTRO;
	}
	
	@GetMapping("/")
	public String showForm(Breja breja) {
		return BREJA_CADASTRO;
	}
	
	
	@PostMapping("novo")
	public String cadastrar(@Valid Breja breja, BindingResult result, Model model, RedirectAttributes attributes) {
		
		if(result.hasErrors()) {
			return novo(breja);	
		}
		
		//Mantem mesmo após o redirect
		attributes.addFlashAttribute("mensagem","Breja Salva com Sucesso");
		
		return "redirect:/brejas/novo";
	}
	
	@GetMapping("/cadastro")
	public String cadastro() {
		return "breja/cadastro-produto";
	}
	

}
