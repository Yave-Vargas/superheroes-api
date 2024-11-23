package com.upiiz.superheroes.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "heroe")
public class HeroeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String poder;
    private String universo;
    private String debilidad;

    @Column(name = "url_imagen")
    private String urlImagen;

    public void setId(Long id) {
        this.id = id;
    }    
}