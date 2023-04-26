 
package com.ProyectoWeb.service;

import com.ProyectoWeb.dao.RegistrarDao;
import com.ProyectoWeb.domain.Registrar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RegistrarServiceImpl implements RegistrarService {

    @Autowired
    RegistrarDao registrarDao;
    
    
    
    @Override
    @Transactional(readOnly = true) 
    public List<Registrar> getRegistrars() {
        return (List<Registrar>) registrarDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Registrar getRegistrar(Registrar registrar) {
        return registrarDao.findById(registrar.getIdRegistro()).orElse(null);
    }
     
 
    @Override
    @Transactional
    public void save(Registrar registrar) {
      
        registrarDao.save(registrar);
    }

    @Override
    @Transactional
    public void delete(Registrar registrar) {
        registrarDao.deleteById(registrar.getIdRegistro());
    }

    @Override
    public List<Registrar> getRegistrarPorNombreApellidosTelefono(String nombre, String apellidos, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Registrar> getRegistrarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Registrar> getRegistrarPorTelefono(String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
