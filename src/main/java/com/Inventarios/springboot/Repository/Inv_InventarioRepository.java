package com.Inventarios.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Inventarios.springboot.model.Inv_Inventario; 

public interface Inv_InventarioRepository extends JpaRepository<Inv_Inventario, Long> {

}
