
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
@Table(name = "reserva")
public class Reservar implements Serializable {
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;

    @Column()
    private double fechaentrada;

    @Column()
    private double fechasalida;
    
    @Column()
    private int cantadulto;

    @Column()
    private int cantnino;

    public Reservar() {
    }

    public Reservar(double fechaentrada, double fechasalida, int cantadulto, int cantnino) {
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
        this.cantadulto = cantadulto;
        this.cantnino = cantnino;
    }

    
}
