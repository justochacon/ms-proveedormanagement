package com.pe.gamarra.model;

import java.util.List;

public class RegistrarProveedorRequest {
	
	private String id;
	private String razonSocial;
	private String descripcion;
	private String ruc;
	private String delivery;
	private List<String> tipoPago;
	private String categoria;
	private String correo;
	private String telefono;
	private String facebook;
	private String instagram;
	private String otrosRedesSoc;
	private String direccion;
	private String user;
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public List<String> getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(List<String> tipoPago) {
		this.tipoPago = tipoPago;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getOtrosRedesSoc() {
		return otrosRedesSoc;
	}
	public void setOtrosRedesSoc(String otrosRedesSoc) {
		this.otrosRedesSoc = otrosRedesSoc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
