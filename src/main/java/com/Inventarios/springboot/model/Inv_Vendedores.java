package com.Inventarios.springboot.model;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name= "INV_VENDEDORES",schema = "DB_FABRICA")
public class Inv_Vendedores {
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "inv_vendedor_generator")
	@SequenceGenerator(name="inv_vendedor_generator",sequenceName = "SEQ_VENDEDOR",allocationSize = 1)
	private long VENDEDOR_CODIGO;
	
	@Column(name = "VENDEDOR_NOMBRES")
	private String VENDEDOR_NOMBRES;	 
	@Column(name = "VENDEDOR_APELLIDOS")
	private String VENDEDOR_APELLIDOS;
	@Column(name = "VENDEDOR_TELEFONO")
	private String VENDEDOR_TELEFONO;
	@Column(name = "VENDEDOR_TIPIDEN")
	private int VENDEDOR_TIPIDEN;
	@Column(name = "VENDEDOR_IDENTIFICACION")
	private String VENDEDOR_IDENTIFICACION;
	@Column(name = "VENDEDOR_DIRECCION")
	private String VENDEDOR_DIRECCION;
	@Column(name = "VENDEDOR_ACTIVO")
	private String VENDEDOR_ACTIVO;	
	@CreationTimestamp
	private Date createdAt;	
	@CreationTimestamp
	private Date updateAt;
	public long getVENDEDOR_CODIGO() {
		return VENDEDOR_CODIGO;
	}
	public void setVENDEDOR_CODIGO(long vENDEDOR_CODIGO) {
		VENDEDOR_CODIGO = vENDEDOR_CODIGO;
	}
	public String getVENDEDOR_NOMBRES() {
		return VENDEDOR_NOMBRES;
	}
	public void setVENDEDOR_NOMBRES(String vENDEDOR_NOMBRES) {
		VENDEDOR_NOMBRES = vENDEDOR_NOMBRES;
	}
	public String getVENDEDOR_APELLIDOS() {
		return VENDEDOR_APELLIDOS;
	}
	public void setVENDEDOR_APELLIDOS(String vENDEDOR_APELLIDOS) {
		VENDEDOR_APELLIDOS = vENDEDOR_APELLIDOS;
	}
	public String getVENDEDOR_TELEFONO() {
		return VENDEDOR_TELEFONO;
	}
	public void setVENDEDOR_TELEFONO(String vENDEDOR_TELEFONO) {
		VENDEDOR_TELEFONO = vENDEDOR_TELEFONO;
	}
	public int getVENDEDOR_TIPIDEN() {
		return VENDEDOR_TIPIDEN;
	}
	public void setVENDEDOR_TIPIDEN(int vENDEDOR_TIPIDEN) {
		VENDEDOR_TIPIDEN = vENDEDOR_TIPIDEN;
	}
	public String getVENDEDOR_IDENTIFICACION() {
		return VENDEDOR_IDENTIFICACION;
	}
	public void setVENDEDOR_IDENTIFICACION(String vENDEDOR_IDENTIFICACION) {
		VENDEDOR_IDENTIFICACION = vENDEDOR_IDENTIFICACION;
	}
	public String getVENDEDOR_DIRECCION() {
		return VENDEDOR_DIRECCION;
	}
	public void setVENDEDOR_DIRECCION(String vENDEDOR_DIRECCION) {
		VENDEDOR_DIRECCION = vENDEDOR_DIRECCION;
	}
	public String getVENDEDOR_ACTIVO() {
		return VENDEDOR_ACTIVO;
	}
	public void setVENDEDOR_ACTIVO(String vENDEDOR_ACTIVO) {
		VENDEDOR_ACTIVO = vENDEDOR_ACTIVO;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	 
   // generate getters y setters

 

}
