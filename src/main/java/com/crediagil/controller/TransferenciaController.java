package com.crediagil.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crediagil.entity.Moneda;
import com.crediagil.entity.TiposDeCambio;
import com.crediagil.entity.Transferencia;
import com.crediagil.service.MonedaService;
import com.crediagil.service.TranferenciaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/transferencia")
//@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class TransferenciaController {
	
	@Autowired
	private TranferenciaService tranferenciaService;
	
	@GetMapping("/lista")
	@ResponseBody
	public List<Transferencia> listar(){
		List objtList = new ArrayList<>();
		try {
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return objtList;
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Transferencia bean) {
		try {
			tranferenciaService.save(bean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@PostMapping("/listarPorCuentaBancaria")
	public List<Transferencia> listarPorIdCuentaOrigen(@RequestBody Transferencia bean) {
			return  tranferenciaService.listarPorIdCuentaOrigen(bean);
	}

}
