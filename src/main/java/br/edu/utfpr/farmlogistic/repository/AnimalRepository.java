package br.edu.utfpr.farmlogistic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.farmlogistic.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
        public List<Animal> findByRaca(String raca);
}
