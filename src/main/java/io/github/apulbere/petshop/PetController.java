package io.github.apulbere.petshop;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static io.github.apulbere.petshop.QPet.pet;

@AllArgsConstructor
@RestController
public class PetController {

    private final PetMapper petMapper;
    private final PetRepository petRepository;

    @GetMapping("/pets")
    List<PetRecord> search(PetCriteria criteria, Pageable page) {
        var predicate = criteria.id.match(pet.id)
                .and(criteria.born.match(pet.birthdate))
                .and(criteria.nickname.match(pet.name))
                .and(criteria.petType.match(pet.type));
        return petRepository.findAll(predicate, page)
                .stream()
                .map(petMapper::map)
                .toList();
    }
}
