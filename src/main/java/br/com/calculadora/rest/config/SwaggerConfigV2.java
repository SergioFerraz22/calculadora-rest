package br.com.calculadora.rest.config;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface SwaggerConfigV2 {
    @Operation(summary = "Calcular juros simples",
            description = "Este endpoint calcula o juro simples com base no valor principal, taxa de juros e tempo. " +
                    "O valor principal representa o montante inicial do investimento, a taxa de juros é expressa " +
                    "em porcentagem e o tempo representa o período de tempo em que o investimento é realizado.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação bem-sucedida"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    double jurosSimples(
            @Parameter(description = "Valor principal do investimento") double a,
            @Parameter(description = "Taxa de juros anual (em percentual)") double b,
            @Parameter(description = "Tempo de investimento (em anos)") int tempo
    );

    @Operation(summary = "Calcular juros compostos",
            description = "Este endpoint calcula o juro composto com base no valor principal, taxa de juros e tempo. " +
                    "O valor principal representa o montante inicial do investimento, a taxa de juros é expressa " +
                    "em porcentagem e o tempo representa o período de tempo em que o investimento é realizado.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação bem-sucedida"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    double jurosCompostos(
            @Parameter(description = "Valor principal do investimento") double a,
            @Parameter(description = "Taxa de juros anual (em percentual)") double b,
            @Parameter(description = "Tempo de investimento (em anos)") int tempo
    );
}
