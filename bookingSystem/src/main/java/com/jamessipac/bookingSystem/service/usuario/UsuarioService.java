package com.jamessipac.bookingSystem.service.usuario;

import com.jamessipac.bookingSystem.model.Usuario;

import java.util.Map;

public interface UsuarioService {
    Map<Long, Usuario> retornarUsuarios();
    Usuario consultarUsuarioPorId(Long idUsuario);
    Usuario guardarUsuario(Usuario usuario);
    Usuario actualizarUsuario(Usuario usuario);
    Usuario eliminarUsuario(Usuario usuario);
}
