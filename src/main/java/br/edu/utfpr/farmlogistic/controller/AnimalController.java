package br.edu.utfpr.farmlogistic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.farmlogistic.model.Animal;
import br.edu.utfpr.farmlogistic.repository.AnimalRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/animals")

public class AnimalController {
    
     @Autowired
    private AnimalRepository animalRepository;

    // Criar um novo animal
    @PostMapping
    public ResponseEntity<Animal> createAnimal(@RequestBody Animal animal) {
        Animal savedAnimal = animalRepository.save(animal);
        return ResponseEntity.status(201).body(savedAnimal);
    }

    // Listar todos os animais
    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    // Buscar um animal por ID
    @GetMapping("/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Long id) {
        return animalRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Atualizar um animal
    @PutMapping("/{id}")
    public ResponseEntity<Animal> updateAnimal(@PathVariable Long id, @RequestBody Animal updatedAnimal) {
        return animalRepository.findById(id).map(animal -> {
            animal.setPeso(updatedAnimal.getPeso());
            animal.setRaca(updatedAnimal.getRaca());
            animal.setTipoAlimentacao(updatedAnimal.getTipoAlimentacao());
            animal.setIdade(updatedAnimal.getIdade());
            animal.setEstadoSaude(updatedAnimal.getEstadoSaude());
            Animal savedAnimal = animalRepository.save(animal);
            return ResponseEntity.ok(savedAnimal);
        }).orElse(ResponseEntity.notFound().build());
    }

    // Deletar um animal
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable Long id) {
        if (animalRepository.existsById(id)) {
            animalRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
