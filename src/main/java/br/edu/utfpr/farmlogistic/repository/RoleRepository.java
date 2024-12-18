package br.edu.utfpr.farmlogistic.repository;


import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.utfpr.farmlogistic.model.Role;
import br.edu.utfpr.farmlogistic.model.RoleName;


public interface RoleRepository extends JpaRepository<Role, UUID> {
        @Query("FROM Role r WHERE r.name = :name")
        public Optional<Role> findByName(RoleName name);
}
