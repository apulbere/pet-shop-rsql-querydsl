package io.github.apulbere.petshop;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Table(name = "pet")
@Entity
public class Pet {

    @Id
    private Long id;

    @Column
    private LocalDate birthdate;

    @Column
    private String type;

    @Column
    private String name;
}
