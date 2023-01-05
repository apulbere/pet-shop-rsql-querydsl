package io.github.apulbere.petshop;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PetControllerTest extends BaseSearchTest {


    @Test
    void shouldFindByNameLike() {
        var actual = makeRequest(Map.of("nickname.like", "Br"));

        var expected = List.of(
                new PetRecord(1L, LocalDate.parse("2000-10-01"), "dog", "Britney"),
                new PetRecord(2L, LocalDate.parse("2002-12-01"), "dog", "Brownie")
        );

        assertEquals(expected, actual);
    }

}