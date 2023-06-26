package com.crediagil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crediagil.dao.PrestamoCuotasDAO;
import com.crediagil.entity.PrestamoCuotas;

@Service
public class PrestamoCuotasServiceimpl {
	@Autowired
	private PrestamoCuotasDAO prestamoCuotasDAO;

//	@Override
//	public void save(PrestamoCuotas bean) {
//		// TODO Auto-generated method stub
//		prestamoCuotasDAO.save(bean);
//	}

}
