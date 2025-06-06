package com.eventos.tec.repositories;

import com.eventos.tec.domain.cupom.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, UUID> {
}
