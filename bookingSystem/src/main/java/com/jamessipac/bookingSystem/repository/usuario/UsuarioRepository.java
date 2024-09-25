package com.jamessipac.bookingSystem.repository.usuario;

import com.jamessipac.bookingSystem.model.Usuario;

import java.util.Map;

public interface UsuarioRepository {
    Map<Long, Usuario> retornarUsuarios();
    Usuario consultarUsuarioPorId(Long idUsuario);
    Usuario guardarUsuario(Usuario usuario);
    Usuario actualizarUsuario(Usuario usuario);
    Usuario eliminarUsuario(Usuario usuario);
}
