package com.jordi.apitriolet.repositories;

import com.jordi.apitriolet.models.encargado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface encargadoRepository extends JpaRepository<encargado,String> {
}
