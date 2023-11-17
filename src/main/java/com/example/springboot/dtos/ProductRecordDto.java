package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank; //Nao em branco
import jakarta.validation.constraints.NotNull; //Nao nulo

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal valor) {
}
