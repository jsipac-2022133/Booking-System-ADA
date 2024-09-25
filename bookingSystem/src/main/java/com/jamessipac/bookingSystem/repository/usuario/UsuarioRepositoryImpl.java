package com.jamessipac.bookingSystem.repository.usuario;

import com.jamessipac.bookingSystem.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository{

    private Map<Long, Usuario> usuarios=new HashMap<>();
    private Long contadorId=0L;

    @Override
    public Map<Long, Usuario> retornarUsuarios() {
        return usuarios;
    }

    @Override
    public Usuario consultarUsuarioPorId(Long idUsuario) {
        return usuarios.get(idUsuario);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        usuario.setIdUsuario(++contadorId);
        return usuarios.put(contadorId, usuario);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarios.put(usuario.getIdUsuario(), usuario);
    }

    @Override
    public Usuario eliminarUsuario(Usuario usuario) {
        return usuarios.remove(usuario.getIdUsuario());
    }
}
