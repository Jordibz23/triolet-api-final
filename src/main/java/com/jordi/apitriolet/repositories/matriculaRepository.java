package com.jordi.apitriolet.repositories;

import com.jordi.apitriolet.models.matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface matriculaRepository extends JpaRepository<matricula,Integer> {
}
