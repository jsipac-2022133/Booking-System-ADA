package com.jamessipac.bookingSystem.repository.usuario;

import com.jamessipac.bookingSystem.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
