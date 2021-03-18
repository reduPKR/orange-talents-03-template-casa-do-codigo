package br.com.casa.codigo.casa_do_codigo.localizacao.estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoModel, Long> {
    @Query(value = "select * from estados e where e.nome = :nome and e.pais_id = :id", nativeQuery = true)
    Optional<EstadoModel> findEstadoPais(String nome, long id);
}
