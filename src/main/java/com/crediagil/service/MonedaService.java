package com.crediagil.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crediagil.dao.MonedaDAO;
import com.crediagil.dao.TiposDeCambioDAO;
import com.crediagil.entity.Moneda;
import com.crediagil.entity.TiposDeCambio;

@Service
public class MonedaService {

	@Autowired
	private MonedaDAO monedaDAO;

	public List<Moneda> listAll() {
		return monedaDAO.findAll();
	}


}
