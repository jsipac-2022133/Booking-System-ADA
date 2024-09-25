package com.jamessipac.bookingSystem.controller.reserva;

import com.jamessipac.bookingSystem.model.Reserva;
import com.jamessipac.bookingSystem.service.reserva.ReservaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {

    private ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping
    public ResponseEntity<Map<Long, Reserva>> retornarReservas(){
        return new ResponseEntity<>(reservaService.retornarReservas(), HttpStatus.OK);
    }

    @GetMapping("/{idReserva}")
    public ResponseEntity<Reserva> consultarReservaPorId(@PathVariable Long idReserva){
        return new ResponseEntity<>(reservaService.consultarReservaPorId(idReserva), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Reserva> crearReserva(@RequestBody Reserva reserva){
        return new ResponseEntity<>(reservaService.guardarReserva(reserva), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Reserva> actualizarReserva(@RequestBody Reserva reserva){
        return new ResponseEntity<>(reservaService.actualiarReserva(reserva), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Reserva> eliminarReserva(@RequestBody Reserva reserva){
        return new ResponseEntity<>(reservaService.eliminarReserva(reserva), HttpStatus.OK);
    }

}


























