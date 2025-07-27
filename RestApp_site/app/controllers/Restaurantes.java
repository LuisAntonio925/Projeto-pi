package controllers;

import java.util.List;

import models.Restaurante;
import play.mvc.Controller;

public class Restaurantes extends Controller{
	public static void formCadastrarRestaurante() {
		render();
	}
	public static void listar2() {
		List<Restaurante> listaRest = Restaurante.findAll();
		render(listaRest);
		
	}
	public static void salvar(Restaurante R) {
		R.save();
		listar2();
		
	}

}
