package com.jamessipac.bookingSystem.repository.usuario;

import com.jamessipac.bookingSystem.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository; // o JpaRepository si usas JPA
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {  // Cambia a JpaRepository si usas JPA
    Usuario findByEmail(String email);
}
