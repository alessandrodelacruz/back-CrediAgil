package com.crediagil.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_USUARIO", nullable = false, unique = true)
	private String codBanco;

	@Column(name = "APELLIDO_PATERNO")
	private String apepaterno;

	@Column(name = "APELLIDO_MATERNO")
	private String apematerno;

	@Column(name = "NOMBRES")
	private String nombres;

	@Column(name = "USUARIO")
	private String usuario;

	@Column(name = "CONTRASENIA")
	private String contrasenia;

}
