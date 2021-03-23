package com.Inventarios.springboot.model;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name= "INV_TALLAS",schema = "DB_FABRICA")
public class Inv_Tallas {
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "inv_tallas_generator")
	@SequenceGenerator(name="inv_tallas_generator",sequenceName = "SEQ_TALLAS",allocationSize = 1)
	private long talla_Codigo;
	
	@Column(name = "TALLA_DESCRIPCION")
	private String talla_descripcion;	 
	
	@CreationTimestamp
	private Date createdAt;
	
	@CreationTimestamp
	private Date updateAt;
   // generate getters y setters
	public long getTalla_Codigo() {
		return talla_Codigo;
	}

	public void setTalla_Codigo(long talla_Codigo) {
		this.talla_Codigo = talla_Codigo;
	}

	public String getTalla_descripcion() {
		return talla_descripcion;
	}

	public void setTalla_descripcion(String talla_descripcion) {
		this.talla_descripcion = talla_descripcion;
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
