package com.consulta.cep.controller;

import com.consulta.cep.dto.request.CepRequest;
import com.consulta.cep.dto.response.CepResponseDTO;
import com.consulta.cep.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cep")
public class CepController {

    private final CepService cepService;

    @Autowired
    public CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping(value = "/")
    public ResponseEntity<CepResponseDTO> consultaCep(@RequestBody CepRequest request) throws Exception {
        var cep = cepService.consultaCep(request);
        return ResponseEntity.ok().body(cep);
    }
}
