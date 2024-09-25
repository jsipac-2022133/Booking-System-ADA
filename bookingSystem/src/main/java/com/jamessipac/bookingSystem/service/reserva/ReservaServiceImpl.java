package com.jamessipac.bookingSystem.service.reserva;

import com.jamessipac.bookingSystem.model.Reserva;
import com.jamessipac.bookingSystem.model.Usuario;
import com.jamessipac.bookingSystem.repository.reserva.ReservaRepository;
import com.jamessipac.bookingSystem.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;

    private final UsuarioService usuarioService;

    public ReservaServiceImpl(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @Override
    public Map<Long, Reserva> retornarReservas() {
        return reservaRepository.retornarReservas();
    }

    @Override
    public Reserva consultarReservaPorId(Long idReserva) {
        return reservaRepository.consultarReservaPorId(idReserva);
    }

    @Override
    public Reserva guardarReserva(Reserva reserva) {
        Usuario usuario=usuarioService.consultarUsuarioPorId(reserva.getUsuarioId());
        if(usuario==null){
            System.out.println("El usuario con id "+reserva.getUsuarioId()+" no existe");;
        }else{
            return reservaRepository.guardarReserva(reserva);
        }

        return null;
    }

    @Override
    public Reserva actualiarReserva(Reserva reserva) {

        Usuario usuario=usuarioService.consultarUsuarioPorId(reserva.getUsuarioId());
        if(usuario==null){
            System.out.println("El usuario con id "+reserva.getUsuarioId()+" no existe");;
        }else {
            return reservaRepository.actualizarReserva(reserva);
        }

        return null;
    }

    @Override
    public Reserva eliminarReserva(Reserva reserva) {
        return reservaRepository.eliminarReserva(reserva);
    }
}
