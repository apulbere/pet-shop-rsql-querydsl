# Example of RSQL-QueryDSL

```java
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
```
