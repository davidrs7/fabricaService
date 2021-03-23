package com.Inventarios.springboot.model;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name= "INV_COLORES",schema = "DB_FABRICA")
public class Inv_Colores {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "inv_colores_generator")
	@SequenceGenerator(name="inv_colores_generator",sequenceName = "SEQ_COLORES",allocationSize = 1)
	private long Color_Codigo;
	
	@Column(name = "COLOR_DESCRIPCION")
	private String color_Descripcion;
	
	
	@Column(name = "COLOR_CODIGO_HTML")
	private String color_Html;
	
	
	@CreationTimestamp
	private Date createdAt;
	
	@CreationTimestamp
	private Date updateAt;
	
	
	//GETTERS Y SETTERS
	public long getColor_Codigo() {
		return Color_Codigo;
	}

	public void setColor_Codigo(long color_Codigo) {
		Color_Codigo = color_Codigo;
	}

	public String getColor_Descripcion() {
		return color_Descripcion;
	}

	public void setColor_Descripcion(String color_Descripcion) {
		this.color_Descripcion = color_Descripcion;
	}

	public String getColor_Html() {
		return color_Html;
	}

	public void setColor_Html(String color_Html) {
		this.color_Html = color_Html;
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

	
}
