package com.sportstore.www.backend;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class REST_services {

	@Autowired
	public ProductsRepository pr;

	@GetMapping("/getall")
	public List<Products> getAll() {
		return (List<Products>) pr.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Products> getOne(@PathVariable(value = "id") Long id) {
		return pr.findById(id);
	}

}
