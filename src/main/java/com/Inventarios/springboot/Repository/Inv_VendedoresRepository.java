package com.Inventarios.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.Inventarios.springboot.model.Inv_Vendedores; 

public interface Inv_VendedoresRepository extends JpaRepository<Inv_Vendedores, Long> {

}
