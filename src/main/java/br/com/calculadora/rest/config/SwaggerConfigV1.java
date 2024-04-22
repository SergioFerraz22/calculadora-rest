package br.com.calculadora.rest.config;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


public interface SwaggerConfigV1 {
    @Operation(summary = "Adicionar dois números",
            description = "Este endpoint calcula a soma de dois números. Ele recebe dois números como entrada " +
                    "e retorna a soma deles.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação bem-sucedida"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    double adicao(
            @Parameter(description = "O primeiro número") double a,
            @Parameter(description = "O segundo número") double b
    );

    @Operation(summary = "Subtrair dois números",
            description = "Este endpoint calcula a diferença entre dois números. Ele recebe dois números como entrada " +
                    "e retorna a subtração do segundo número do primeiro.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação bem-sucedida"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    double subtracao(
            @Parameter(description = "O primeiro número") double a,
            @Parameter(description = "O segundo número") double b
    );

    @Operation(summary = "Multiplicar dois números",
            description = "Este endpoint calcula o produto de dois números. Ele recebe dois números como entrada " +
                    "e retorna a multiplicação deles.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação bem-sucedida"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    double multiplicacao(
            @Parameter(description = "O primeiro número") double a,
            @Parameter(description = "O segundo número") double b
    );

    @Operation(summary = "Dividir dois números",
            description = "Este endpoint calcula o quociente entre dois números. Ele recebe dois números como entrada " +
                    "e retorna a divisão do primeiro número pelo segundo.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação bem-sucedida"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    double divisao(
            @Parameter(description = "O primeiro número (dividendo)") double a,
            @Parameter(description = "O segundo número (divisor)") double b
    );



}
