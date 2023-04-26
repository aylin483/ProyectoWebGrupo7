package com.ProyectoWeb.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "registro")
public class Registrar implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistro;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 50)
    private String apellidos;

    @Column(nullable = false, unique = true, length = 15)
    private String telefono;

    @Column(nullable = false, unique = true, length = 50) //no todos los usuarios tienen que tener el mismo correo
    private String correo;

    @Column(nullable = false, length = 65) 
    private String password;
     
    public Registrar() {
    }

    public Registrar(String nombre, String apellidos, String telefono, String correo, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.password = password;
    }

}
