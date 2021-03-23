package com.Inventarios.springboot.model;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name= "INV_INVENTARIO",schema = "DB_FABRICA")
public class Inv_Inventario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "inv_inventario_generator")
	@SequenceGenerator(name="inv_inventario_generator",sequenceName = "SEQ_INVENTARIO",allocationSize = 1)
	private long inventario_codigo;
	
	
	@Column(name="REF_CODIGO")
	private long ref_codigo;
	 
	
	@Column(name = "TALLA_CODIGO")
	private long talla_codigo;
	
	@Column(name = "COLOR_CODIGO")
	private long color_codigo;
	
	@Column(name = "CANTIDAD")
	private long cantidad;
	
	@CreationTimestamp
	private Date createdAt;
	
	@CreationTimestamp
	private Date updateAt;
	
	@JoinColumn(name="REF_CODIGO",referencedColumnName = "ref_codigo",insertable=false, updatable=false)
	@ManyToOne(optional=false)
	private  Inv_Referencias Referencias;
	
	@JoinColumn(name="COLOR_CODIGO", referencedColumnName = "Color_Codigo",insertable=false, updatable=false)
	@ManyToOne(optional=false)
	private Inv_Colores Colores;
	
	@JoinColumn(name="TALLA_CODIGO",referencedColumnName = "talla_Codigo",insertable=false, updatable=false)
	@ManyToOne(optional=false)
	private Inv_Tallas Tallas;

	public Inv_Referencias getReferencias() {
		return Referencias;
	}

	public void setReferencias(Inv_Referencias referencias) {
		Referencias = referencias;
	}

	public Inv_Colores getColores() {
		return Colores;
	}

	public void setColores(Inv_Colores colores) {
		Colores = colores;
	}

	public Inv_Tallas getTallas() {
		return Tallas;
	}
	
	

	public void setTallas(Inv_Tallas tallas) {
		Tallas = tallas;
	}

	public long getInventario_codigo() {
		return inventario_codigo;
	}

	public void setInventario_codigo(long inventario_codigo) {
		this.inventario_codigo = inventario_codigo;
	}

	public long getRef_codigo() {
		return ref_codigo;
	}

	public void setRef_codigo(long ref_codigo) {
		this.ref_codigo = ref_codigo;
	}

	public long getTalla_codigo() {
		return talla_codigo;
	}

	public void setTalla_codigo(long talla_codigo) {
		this.talla_codigo = talla_codigo;
	}

	public long getColor_codigo() {
		return color_codigo;
	}

	public void setColor_codigo(long color_codigo) {
		this.color_codigo = color_codigo;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
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
 
	// getters y setters
	
	
	
}
