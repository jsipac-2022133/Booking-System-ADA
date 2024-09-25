package com.jamessipac.bookingSystem.model;

import java.time.LocalDateTime;

public class Reserva {

    private Long idReserva;
    private Long usuarioId;
    private LocalDateTime fechaReserva;



    public Reserva(Long idReserva, Long usuarioId) {
        this.idReserva = idReserva;
        this.usuarioId = usuarioId;
        this.fechaReserva = LocalDateTime.now();
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", usuarioId=" + usuarioId +
                ", fechaReserva=" + fechaReserva +
                '}';
    }
}
