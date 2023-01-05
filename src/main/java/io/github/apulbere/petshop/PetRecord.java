package io.github.apulbere.petshop;

import java.time.LocalDate;

public record PetRecord(Long id, LocalDate birthdate, String type, String name) {
}
