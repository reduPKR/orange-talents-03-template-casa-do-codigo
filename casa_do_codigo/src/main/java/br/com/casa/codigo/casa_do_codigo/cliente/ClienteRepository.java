package br.com.casa.codigo.casa_do_codigo.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
