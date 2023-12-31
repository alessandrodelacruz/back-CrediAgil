package com.crediagil.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crediagil.dao.PrestamoClienteDAO;
import com.crediagil.entity.PrestamoCliente;

@Service
public class PrestamoClienteService {

	@Autowired
	private PrestamoClienteDAO prestamoClienteDAO;

	public List<PrestamoCliente> listAll() {
		return prestamoClienteDAO.findAll();
	}

	public void save(PrestamoCliente bean) {
		prestamoClienteDAO.save(bean);
	}

	public void delete(Integer cod) {
		prestamoClienteDAO.deleteById(cod);
	}

	public Optional<PrestamoCliente> find(Integer cod) {
		return prestamoClienteDAO.findById(cod);
	}

}
