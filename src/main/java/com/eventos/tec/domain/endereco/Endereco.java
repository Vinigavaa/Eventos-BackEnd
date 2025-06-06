package com.eventos.tec.domain.endereco;

import com.eventos.tec.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "endereco")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue
    private UUID id;

    private String cidade;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
