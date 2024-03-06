package br.com.fiap.springpjmotos.repository;

import br.com.fiap.springpjmotos.entity.TipoDeVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDeVeiculoRepository extends JpaRepository<TipoDeVeiculo, Long> {
}
