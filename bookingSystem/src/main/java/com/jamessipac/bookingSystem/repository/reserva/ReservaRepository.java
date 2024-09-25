package com.jamessipac.bookingSystem.repository.reserva;

import com.jamessipac.bookingSystem.model.Reserva;

import java.util.Map;

public interface ReservaRepository {
    Map<Long, Reserva> retornarReservas();
    Reserva consultarReservaPorId(Long idReserva);
    Reserva guardarReserva(Reserva reserva);
    Reserva actualizarReserva(Reserva reserva);
    Reserva eliminarReserva(Reserva reserva);
}
