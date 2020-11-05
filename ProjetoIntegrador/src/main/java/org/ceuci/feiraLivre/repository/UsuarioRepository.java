package org.ceuci.feiraLivre.repository;

import org.ceuci.feiraLivre.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
