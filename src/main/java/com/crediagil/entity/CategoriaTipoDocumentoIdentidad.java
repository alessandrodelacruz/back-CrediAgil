package com.crediagil.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAT_TIPO_DOCUMENTOIDENTIDAD")
public class CategoriaTipoDocumentoIdentidad implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_TIPO_DOCUMENTOIDENTIDAD", nullable = false, unique = true)
	private String codTipoDocumentoIdentidad;

	@Column(name = "DES_TIPO_DOCUMENTOIDENTIDAD")
	private String descripcionTipoDocumentoIdentidad;

	public String getCodTipoDocumentoIdentidad() {
		return codTipoDocumentoIdentidad;
	}

	public void setCodTipoDocumentoIdentidad(String codTipoDocumentoIdentidad) {
		this.codTipoDocumentoIdentidad = codTipoDocumentoIdentidad;
	}

	public String getDescripcionTipoDocumentoIdentidad() {
		return descripcionTipoDocumentoIdentidad;
	}

	public void setDescripcionTipoDocumentoIdentidad(String descripcionTipoDocumentoIdentidad) {
		this.descripcionTipoDocumentoIdentidad = descripcionTipoDocumentoIdentidad;
	}
	
	

}
