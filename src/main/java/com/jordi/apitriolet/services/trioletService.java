package com.jordi.apitriolet.services;


import com.jordi.apitriolet.models.encargado;
import com.jordi.apitriolet.models.matricula;
import com.jordi.apitriolet.repositories.encargadoRepository;
import com.jordi.apitriolet.repositories.matriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class trioletService {

    private matriculaRepository matriculaRepository;
    private encargadoRepository encargadoRepository;

    @Autowired
    public trioletService(com.jordi.apitriolet.repositories.matriculaRepository matriculaRepository, com.jordi.apitriolet.repositories.encargadoRepository encargadoRepository) {
        this.matriculaRepository = matriculaRepository;
        this.encargadoRepository = encargadoRepository;
    }
    public List<matricula> listarMatriculados(){return matriculaRepository.findAll();}

    public List<encargado> ListarEncargados(){return encargadoRepository.findAll();}

    public void guardarMatricula(matricula mat){
        matriculaRepository.save(mat);
    }

    public Integer traerCodigo(){
        return Math.toIntExact(matriculaRepository.count())+1;
    }

}
