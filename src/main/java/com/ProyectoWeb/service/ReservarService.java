
package com.ProyectoWeb.service;

import com.ProyectoWeb.domain.Reservar;
import java.util.List;


public interface ReservarService {
    
    public List<Reservar> getReservar();
    
     public Reservar getReservar (Reservar reservar);
    
    public void save(Reservar reservar);
    
    public void delete(Reservar reservar);
    
    
}
