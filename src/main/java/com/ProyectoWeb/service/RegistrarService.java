
package com.ProyectoWeb.service;

import com.ProyectoWeb.domain.Registrar;
import java.util.List;


public interface RegistrarService {
    
     public List<Registrar> getRegistrars(); 
    
    public Registrar getRegistrar(Registrar registrar);
    
    public void save(Registrar registrar); //para insertar, salvar, modificar, no retorna nada ( si viene l idCliente o no)

    public void delete(Registrar registrar); //´para eliminar
    
    public List<Registrar> getRegistrarPorNombreApellidosTelefono(String nombre, String apellidos, String telefono);

    public List<Registrar>getRegistrarPorNombre(String nombre);

    public List<Registrar>getRegistrarPorTelefono(String telefono);
}
