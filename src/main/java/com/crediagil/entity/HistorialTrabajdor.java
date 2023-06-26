package com.crediagil.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HISTORIAL_TRABAJADOR")
public class HistorialTrabajdor implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_HISTORIAL", nullable = false, unique = true)
	private String codhistorial;

	@Column(name = "COD_TRABAJADOR")
	private String codtrabajdor;

	@Column(name = "COD_BANCO")
	private String codbanco;

	@Column(name = "IMPORTE_PRESTAMO")
	private String importeprestamo;

	@Column(name = "IMPORTE_PRESTAMO_RESTANTE")
	private String importeprestamorestane;

	public String getCodhistorial() {
		return codhistorial;
	}

	public void setCodhistorial(String codhistorial) {
		this.codhistorial = codhistorial;
	}

	public String getCodtrabajdor() {
		return codtrabajdor;
	}

	public void setCodtrabajdor(String codtrabajdor) {
		this.codtrabajdor = codtrabajdor;
	}

	public String getCodbanco() {
		return codbanco;
	}

	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}

	public String getImporteprestamo() {
		return importeprestamo;
	}

	public void setImporteprestamo(String importeprestamo) {
		this.importeprestamo = importeprestamo;
	}

	public String getImporteprestamorestane() {
		return importeprestamorestane;
	}

	public void setImporteprestamorestane(String importeprestamorestane) {
		this.importeprestamorestane = importeprestamorestane;
	}

	
}
