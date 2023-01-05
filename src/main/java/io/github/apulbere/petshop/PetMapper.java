package io.github.apulbere.petshop;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PetMapper {

    PetRecord map(Pet pet);
}
