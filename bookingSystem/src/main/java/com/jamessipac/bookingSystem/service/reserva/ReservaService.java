package com.jamessipac.bookingSystem.service.reserva;

import com.jamessipac.bookingSystem.model.Reserva;

import java.util.Map;

public interface ReservaService {
    Map<Long, Reserva> retornarReservas();
    Reserva consultarReservaPorId(Long idReserva);
    Reserva guardarReserva(Reserva reserva);
    Reserva actualiarReserva(Reserva reserva);
    Reserva eliminarReserva(Reserva reserva);
}
