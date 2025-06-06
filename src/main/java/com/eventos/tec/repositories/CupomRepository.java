package com.eventos.tec.repositories;

import com.eventos.tec.domain.cupom.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CupomRepository extends JpaRepository<Cupom, UUID> {
}
