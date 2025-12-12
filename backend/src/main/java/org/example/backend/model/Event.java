package org.example.backend.model;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "events")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String descripcion;

    @Column(nullable = false)
    private LocalDateTime fechaInicio;

    @Column(nullable = false)
    private LocalDateTime fechaFin;

    private String ubicacion;

    private Integer maxParticipantes;

    @Enumerated(EnumType.STRING)
    private EventStatus status = EventStatus.PLANIFICADO;

    // Relación con participantes
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Participant> participantes = new ArrayList<>();

    // Jueces del evento (muchos a muchos)
    @ManyToMany
    @JoinTable(
            name = "event_judges",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "judge_id")
    )
    private List<User> jueces = new ArrayList<>();
}

