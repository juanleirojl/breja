package com.leiro.breja.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leiro.breja.model.Cliente;
import static com.leiro.breja.util.Constants.*;

@Controller
@RequestMapping("clientes")
public class ClienteController {
	
	@GetMapping("/")
	public String showForm(Cliente cliente) {
		return CLIENTE_CADASTRO;
	}
	
	
	@PostMapping("/")
	public ModelAndView adicionaCliente(@Valid @ModelAttribute Cliente cliente, BindingResult bindingResult) {
		ModelAndView mv = new ModelAndView();
		
		if(bindingResult.hasErrors()) {
			mv.setViewName(CLIENTE_CADASTRO);
		}else {
			mv.setViewName(CLIENTE_CADASTRO);
			mv.addObject("cliente", cliente);
		}
		
		return mv;
	}

}
