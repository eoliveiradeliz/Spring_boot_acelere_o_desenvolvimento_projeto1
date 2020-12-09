package com.projeto1.eneias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto1.eneias.model.Propriedade;
import com.projeto1.eneias.repository.PropriedadeRepository;

@RestController
@RequestMapping("/api")
public class PropriedadeController {

	@Autowired
	private PropriedadeRepository repository;

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	List<Propriedade> findByFiltro(@RequestParam("filtro") String filtro) {
		return repository.findByFiltro(filtro);
	}


}
