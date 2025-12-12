package org.example.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "scores")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "participant_id", nullable = false)
    private Participant participant;

    private Integer ronda;           // 1, 2, 3…
    private Double distancia;        // o hits, tiempo, etc.
    private Double puntos;
    private String observaciones;
}
