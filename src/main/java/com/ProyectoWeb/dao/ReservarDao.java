
package com.ProyectoWeb.dao;

import com.ProyectoWeb.domain.Reservar;
import org.springframework.data.repository.CrudRepository;


public interface ReservarDao extends CrudRepository<Reservar, Long> {
    
}
