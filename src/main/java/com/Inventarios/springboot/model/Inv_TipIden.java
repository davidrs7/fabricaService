package com.Inventarios.springboot.model;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name= "INV_TIPIDEN",schema = "DB_FABRICA")
public class Inv_TipIden {
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "inv_tipiden_generator")
	@SequenceGenerator(name="inv_tipiden_generator",sequenceName = "SEQ_TIPIDEN",allocationSize = 1)
	private long TIPIDEN_CODIGO;
	
	@Column(name = "TIPIDEN_DESCTIPCION")
	private String TIPIDEN_DESCTIPCION;	 
	
	@CreationTimestamp
	private Date createdAt;
	
	@CreationTimestamp
	private Date updateAt;
   // generate getters y setters

	public long getTIPIDEN_CODIGO() {
		return TIPIDEN_CODIGO;
	}

	public void setTIPIDEN_CODIGO(long tIPIDEN_CODIGO) {
		TIPIDEN_CODIGO = tIPIDEN_CODIGO;
	}

	public String getTIPIDEN_DESCTIPCION() {
		return TIPIDEN_DESCTIPCION;
	}

	public void setTIPIDEN_DESCTIPCION(String tIPIDEN_DESCTIPCION) {
		TIPIDEN_DESCTIPCION = tIPIDEN_DESCTIPCION;
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
