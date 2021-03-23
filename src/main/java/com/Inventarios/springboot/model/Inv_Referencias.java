package com.Inventarios.springboot.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name= "INV_REFERENCIAS",schema = "DB_FABRICA")
public class Inv_Referencias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "inv_referencias_generator")
	@SequenceGenerator(name="inv_referencias_generator",sequenceName = "SEQ_REFERENCIAS",allocationSize = 1)
	private long ref_codigo;
	
	@Column(name = "ref_descripcion")
	private String ref_descripcion;
	
	@CreationTimestamp
	private Date createdAt;
	
	@CreationTimestamp
	private Date updateAt;
	
	
	/// GETTERS Y SETTERS
	public long getRef_codigo() {
		return ref_codigo;
	}
	public void setRef_codigo(long ref_codigo) {
		this.ref_codigo = ref_codigo;
	}
	public String getRef_descripcion() {
		return ref_descripcion;
	}
	public void setRef_descripcion(String ref_descripcion) {
		this.ref_descripcion = ref_descripcion;
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
