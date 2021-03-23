package com.Inventarios.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.Inventarios.springboot.model.Inv_Tallas; 

public interface Inv_TallasRepository extends JpaRepository<Inv_Tallas, Long> {

}
