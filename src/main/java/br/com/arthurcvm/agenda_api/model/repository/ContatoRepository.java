package br.com.arthurcvm.agenda_api.model.repository;

import br.com.arthurcvm.agenda_api.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
