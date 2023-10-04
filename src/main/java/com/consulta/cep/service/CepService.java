package com.consulta.cep.service;

import com.consulta.cep.dto.request.CepRequest;
import com.consulta.cep.dto.response.CepResponseDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;

public interface CepService {
	CepResponseDTO consultaCep(CepRequest cep) throws IOException, Exception;
}
