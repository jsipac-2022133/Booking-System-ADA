package com.jamessipac.bookingSystem.repository.reserva;

import com.jamessipac.bookingSystem.model.Reserva;
import com.jamessipac.bookingSystem.model.Usuario;
import com.jamessipac.bookingSystem.repository.usuario.UsuarioRepository;
import com.jamessipac.bookingSystem.service.usuario.UsuarioService;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ReservaRepositoryImpl implements ReservaRepository{

    private Map<Long, Reserva> reservas=new HashMap<>();
    private Long contadorId=0L;

    @Override
    public Map<Long, Reserva> retornarReservas() {
        return reservas;
    }

    @Override
    public Reserva consultarReservaPorId(Long idReserva) {
        return reservas.get(idReserva);
    }

    @Override
    public Reserva guardarReserva(Reserva reserva) {
        reserva.setIdReserva(++contadorId);
        return reservas.put(contadorId, reserva);
    }

    @Override
    public Reserva actualizarReserva(Reserva reserva) {
        return reservas.put(reserva.getIdReserva(), reserva);
    }

    @Override
    public Reserva eliminarReserva(Reserva reserva) {
        return reservas.remove(reserva.getIdReserva());
    }
}
