package com.john.table.global.config.swagger;

import io.swagger.v3.oas.models.examples.Example;
import lombok.Builder;

@Builder
public record ExampleHolder(Example holder, String name, int status, String code) {}
