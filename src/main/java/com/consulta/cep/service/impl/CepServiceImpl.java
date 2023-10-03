package com.consulta.cep.service.impl;

import com.consulta.cep.dto.request.CepRequest;
import com.consulta.cep.service.CepService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Service
public class CepServiceImpl implements CepService {
    @Override
    public String consultaCep(CepRequest cep) throws Exception {
        URL url = new URL("https://viacep.com.br/ws/" + cep.getCep() + "/json/");
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

        var cepRecebido = "";
        StringBuilder jsonCep = new StringBuilder();

        while ((cepRecebido = br.readLine()) != null) {
            jsonCep.append(cepRecebido);
        }
        return cepRecebido;
    }
}
