package com.crediagil.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRABAJADOR")
public class Trabajador implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_USUARIO", nullable = false, unique = true)
	private String codUsuario;

	@Column(name = "APELLIDO_PARTENO")
	private String apepaterno;

	@Column(name = "APELLIDO_MATERNO")
	private String apematerno;

	@Column(name = "NOMBRES")
	private String nombres;

	@Column(name = "COD_TIPO_DOCUMENTOIDENTIDAD")
	private String codTipoDocumento;

	@Column(name = "NRO_DOCUMENTOIDENTIDAD")
	private String numeroDocumento;

	@Column(name = "TELEFONO")
	private String telefono;

	@Column(name = "COD_BANCO")
	private String codBanco;

	@Column(name = "NRO_CUENTA_BANCARIA")
	private String nroCuentaBancaria;

	@Column(name = "NRO_CUENTA_INTERBANCARIA")
	private String nroCuentaInterbancaria;

}
