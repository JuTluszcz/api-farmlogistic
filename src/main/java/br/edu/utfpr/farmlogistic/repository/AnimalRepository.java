package br.edu.utfpr.farmlogistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.farmlogistic.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
