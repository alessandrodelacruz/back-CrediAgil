package com.crediagil.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crediagil.dao.PromocionesDAO;
import com.crediagil.entity.Promociones;

@Service
public class PromocionesService {

	@Autowired
	private PromocionesDAO promocionesDAO;

	public List<Promociones> listAll() {
		return promocionesDAO.findAll();
	}

	public void save(Promociones bean) {
		promocionesDAO.save(bean);
	}

	public void delete(Integer cod) {
		promocionesDAO.deleteById(cod);
	}

	public Optional<Promociones> find(Integer cod) {
		return promocionesDAO.findById(cod);
	}

}
