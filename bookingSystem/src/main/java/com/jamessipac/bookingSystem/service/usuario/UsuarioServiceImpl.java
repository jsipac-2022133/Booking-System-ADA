package com.jamessipac.bookingSystem.service.usuario;

import com.jamessipac.bookingSystem.model.Usuario;
import com.jamessipac.bookingSystem.repository.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Map<Long, Usuario> retornarUsuarios() {
        return usuarioRepository.retornarUsuarios();
    }

    @Override
    public Usuario consultarUsuarioPorId(Long idUsuario) {
        return usuarioRepository.consultarUsuarioPorId(idUsuario);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.guardarUsuario(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarioRepository.actualizarUsuario(usuario);
    }

    @Override
    public Usuario eliminarUsuario(Usuario usuario) {
        return usuarioRepository.eliminarUsuario(usuario);
    }
}
