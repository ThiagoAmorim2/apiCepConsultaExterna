package com.consulta.cep.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CepRequest implements Serializable{
    private static final long serialVersionUID = 1L;
    String cep;
}
