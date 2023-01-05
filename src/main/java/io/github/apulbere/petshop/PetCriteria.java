package io.github.apulbere.petshop;

import io.github.apulbere.rsqlquerydsl.criteria.LocalDateCriteria;
import io.github.apulbere.rsqlquerydsl.criteria.LongCriteria;
import io.github.apulbere.rsqlquerydsl.criteria.StringCriteria;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PetCriteria {
    LongCriteria id = LongCriteria.empty();
    LocalDateCriteria born = LocalDateCriteria.empty();
    StringCriteria petType = StringCriteria.empty();
    StringCriteria nickname = StringCriteria.empty();
}
