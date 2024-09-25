package com.jamessipac.bookingSystem.controller.usuario;

import com.jamessipac.bookingSystem.model.Usuario;
import com.jamessipac.bookingSystem.service.usuario.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<Map<Long, Usuario>> retornarUsuarios(){
        return new ResponseEntity<>(usuarioService.retornarUsuarios(), HttpStatus.OK);
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> consultarUsuarioPorId(@PathVariable Long idUsuario){
        return new ResponseEntity<>(usuarioService.consultarUsuarioPorId(idUsuario), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.guardarUsuario(usuario), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Usuario> actualizarUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.actualizarUsuario(usuario), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Usuario> eliminarUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.eliminarUsuario(usuario), HttpStatus.OK);
    }
}
