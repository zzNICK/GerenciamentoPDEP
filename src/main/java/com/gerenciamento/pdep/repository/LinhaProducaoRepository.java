package com.gerenciamento.pdep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciamento.pdep.entity.LinhaProducao;

public interface LinhaProducaoRepository extends JpaRepository<LinhaProducao, Integer>{
	LinhaProducao findByLpx(boolean lpx);
	LinhaProducao findByLpy(boolean lpy);

}
