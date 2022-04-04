package atividade.arquiteturadesoftware.produtocliente.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	public String ProdutoController() {
		return"produto";
	}

}
