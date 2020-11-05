package org.ceuci.feiraLivre.repository;

import org.ceuci.feiraLivre.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

}
