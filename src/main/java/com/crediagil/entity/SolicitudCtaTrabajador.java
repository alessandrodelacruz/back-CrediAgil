package com.crediagil.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOLICITUD_CTA_TRABAJADOR")
public class SolicitudCtaTrabajador implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_SOLICITUD", nullable = false, unique = true)
	private String codsolicitud;

	@Column(name = "COD_TRABAJADOR")
	private String codtrabajador;

	@Column(name = "FECHA_SOLICITUD")
	private String fechasolicitud;

	@Column(name = "MONTO_INGRESO")
	private String montoingreso;

	@Column(name = "MONTO_SOLICITAR")
	private String montosolicitar;

	@Column(name = "NRO_CUOTAS_A_PAGAR")
	private String nrocuotasapagar;

	@Column(name = "COD_ESTADO")
	private String codestado;

	public String getCodsolicitud() {
		return codsolicitud;
	}

	public void setCodsolicitud(String codsolicitud) {
		this.codsolicitud = codsolicitud;
	}

	public String getCodtrabajador() {
		return codtrabajador;
	}

	public void setCodtrabajador(String codtrabajador) {
		this.codtrabajador = codtrabajador;
	}

	public String getFechasolicitud() {
		return fechasolicitud;
	}

	public void setFechasolicitud(String fechasolicitud) {
		this.fechasolicitud = fechasolicitud;
	}

	public String getMontoingreso() {
		return montoingreso;
	}

	public void setMontoingreso(String montoingreso) {
		this.montoingreso = montoingreso;
	}

	public String getMontosolicitar() {
		return montosolicitar;
	}

	public void setMontosolicitar(String montosolicitar) {
		this.montosolicitar = montosolicitar;
	}

	public String getNrocuotasapagar() {
		return nrocuotasapagar;
	}

	public void setNrocuotasapagar(String nrocuotasapagar) {
		this.nrocuotasapagar = nrocuotasapagar;
	}

	public String getCodestado() {
		return codestado;
	}

	public void setCodestado(String codestado) {
		this.codestado = codestado;
	}

	public String getDocumentoadjunto() {
		return documentoadjunto;
	}

	public void setDocumentoadjunto(String documentoadjunto) {
		this.documentoadjunto = documentoadjunto;
	}

	public String getDocumentoenvio() {
		return documentoenvio;
	}

	public void setDocumentoenvio(String documentoenvio) {
		this.documentoenvio = documentoenvio;
	}

	public String getFechaaprobacion() {
		return fechaaprobacion;
	}

	public void setFechaaprobacion(String fechaaprobacion) {
		this.fechaaprobacion = fechaaprobacion;
	}

	public String getEstadodesembolso() {
		return estadodesembolso;
	}

	public void setEstadodesembolso(String estadodesembolso) {
		this.estadodesembolso = estadodesembolso;
	}

	public String getTxtobersabacion() {
		return txtobersabacion;
	}

	public void setTxtobersabacion(String txtobersabacion) {
		this.txtobersabacion = txtobersabacion;
	}

	@Column(name = "DOCUMENTO_ADJUNTO")
	private String documentoadjunto;

	@Column(name = "DOCUMENTO_ENVIO")
	private String documentoenvio;

	@Column(name = "FECHA_APROBACION")
	private String fechaaprobacion;

	@Column(name = "ESTADO_DESEMBOLSO")
	private String estadodesembolso;

	@Column(name = "TXT_OBSERVACION")
	private String txtobersabacion;

}
