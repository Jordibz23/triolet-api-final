package com.jordi.apitriolet.controller;

import com.jordi.apitriolet.models.Response;
import com.jordi.apitriolet.models.encargado;
import com.jordi.apitriolet.models.matricula;
import com.jordi.apitriolet.services.trioletService;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/triolet")
@CrossOrigin(origins = "*",allowedHeaders = "*",methods = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT})
public class trioletController {

    private trioletService trioletService;

    @Autowired
    public trioletController(com.jordi.apitriolet.services.trioletService trioletService) {
        this.trioletService = trioletService;
    }

    @GetMapping(value = "/listar-matriculados", headers = "Accept=Application/json")
    public ResponseEntity<List<matricula>> listarMatriculados(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(trioletService.listarMatriculados());
    }

    @GetMapping(value = "/listar-encargados", headers = "Accept=Application/json")
    public ResponseEntity<List<encargado>> listarEncargados(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(trioletService.ListarEncargados());
    }

    @GetMapping(value = "/ultimoid", headers = "Accept=Application/json")
    public ResponseEntity<Integer> ultimoId(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(trioletService.traerCodigo());
    }

    @PostMapping(value="/agregar-matricula", headers = "Accept=Application/json")
    public ResponseEntity<Response> agregarMatricula(@RequestBody matricula matri){
        try {
            System.out.println(matri);

            trioletService.guardarMatricula(matri);
            return new ResponseEntity<>(new Response("Matricula guardada correctamente"),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new Response("Error al guardar la matricula"),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
