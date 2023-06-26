package com.crediagil.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crediagil.dao.CuentaBancariaDAO;
import com.crediagil.dao.CuentaUsuarioDAO;
import com.crediagil.dao.TransferenciaDAO;
import com.crediagil.entity.CuentaBancaria;
import com.crediagil.entity.CuentaUsuario;
import com.crediagil.entity.TiposDeCambio;
import com.crediagil.entity.Transferencia;

@Service
public class TranferenciaService {

	@Autowired
	private TransferenciaDAO transferenciaDAO;

	@Autowired
	private CuentaBancariaDAO cuentaBancariaDAO;

	public List<Transferencia> listAll() {
		return transferenciaDAO.findAll();
	}

	public void save(Transferencia bean) {

		transferenciaDAO.save(bean);
		
		Double saldoorigen = bean.getIdcuentaorigen().getSaldo() - bean.getMonto();
		cuentaBancariaDAO.actualizarSaldoOrigen(saldoorigen, bean.getIdcuentaorigen().getId());

		Double saldodestino = bean.getIdcuentadestino().getSaldo() + bean.getMonto();
		cuentaBancariaDAO.actualizarSaldoDestino(saldodestino, bean.getIdcuentadestino().getId());
	}

	public List<Transferencia> listarPorIdCuentaOrigen(Transferencia bean) {
		return transferenciaDAO.listarPorIdCuentaOrigen(bean.getIdcuentaorigen().getId());
	}

}
