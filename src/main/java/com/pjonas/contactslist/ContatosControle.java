package com.pjonas.contactslist;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {

	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();

	static {
		LISTA_CONTATOS.add(new Contato("1", "Jonas", "85", "90000-9999"));
		LISTA_CONTATOS.add(new Contato("2", "Vanessa", "85", "91000-8888"));
		LISTA_CONTATOS.add(new Contato("3", "Janio", "85", "92100-7777"));
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/lista")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		return modelAndView;
	}

}
