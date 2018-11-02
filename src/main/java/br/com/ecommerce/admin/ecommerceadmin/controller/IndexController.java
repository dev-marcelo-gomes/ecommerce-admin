package br.com.ecommerce.admin.ecommerceadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "Funcionou"; 
	}
}
