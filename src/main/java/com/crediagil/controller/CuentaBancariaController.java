package com.crediagil.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crediagil.entity.CuentaBancaria;
import com.crediagil.entity.CuentaUsuario;
import com.crediagil.entity.TiposDeCambio;
import com.crediagil.entity._Respuesta;
import com.crediagil.service.CuentaBancariaService;
import com.crediagil.service.CuentaUsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cuentaBancaria")
public class CuentaBancariaController {

	@Autowired
	private CuentaBancariaService cuentaBancariaService;

	@GetMapping("/lista")
	@ResponseBody
	public List<CuentaBancaria> lista() {
		return cuentaBancariaService.listAll();
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody CuentaBancaria bean) {
		cuentaBancariaService.save(bean);
	}

	@PostMapping("/registrarC")
	public _Respuesta  registrarCliente(@RequestBody CuentaBancaria bean) {
		_Respuesta resp = new _Respuesta();
		resp.setMsg("camrdi");
		cuentaBancariaService.save(bean);
		
		return resp;
	}

	@PostMapping("/actualizar")
	public void actualizar(@RequestBody CuentaBancaria bean) {
		cuentaBancariaService.save(bean);
	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		cuentaBancariaService.delete(cod);
	}

	@GetMapping("/buscar/{codigo}")
	@ResponseBody
	public Optional<CuentaBancaria> buscar(@PathVariable("codigo") Integer cod) {
		return cuentaBancariaService.find(cod);
	}
	
	@PostMapping("/listarPorCliente")
	public List<CuentaBancaria> listaPorCliente(@RequestBody CuentaBancaria bean) {
			return  cuentaBancariaService.listarPorCliente(bean);
	}
	
	@PostMapping("/retornaPorNumdeCuenta")
	public CuentaBancaria retornaPorNumdeCuenta(@RequestBody CuentaBancaria bean) {
		CuentaBancaria obj = new CuentaBancaria();
		obj = cuentaBancariaService.retornaPorNumdeCuenta(bean);
		return obj;
	}
}
