# Calculadora REST API

Esta é uma API RESTful simples para uma calculadora que realiza operações básicas e cálculos de juros simples e compostos.

## Funcionamento

A API oferece os seguintes endpoints para realizar operações matemáticas e cálculos de juros:

- `/adicao`: Realiza a adição de dois números.
- `/subtracao`: Realiza a subtração de dois números.
- `/multiplicacao`: Realiza a multiplicação de dois números.
- `/divisao`: Realiza a divisão de dois números.
- `/juros-simples`: Calcula juros simples com base em um principal, taxa e tempo.
- `/juros-compostos`: Calcula juros compostos com base em um principal, taxa e tempo.

## Padrões de Projeto Aplicados

Esta API foi desenvolvida seguindo alguns padrões de projeto, incluindo os princípios do SOLID, para garantir um código organizado, flexível e de fácil manutenção:

- **Injeção de Dependência**: As dependências das classes foram injetadas usando o padrão de Injeção de Dependência, conforme o princípio da Inversão de Dependência do SOLID. Isso permite uma fácil substituição de implementações e uma melhor testabilidade do código.
- **Separação de Responsabilidades (Separation of Concerns)**: As classes foram organizadas de forma a separar as diferentes responsabilidades, seguindo o princípio da Responsabilidade Única do SOLID. Isso promove um código mais modular e coeso.
- **Documentação com OpenAPI**: A API foi documentada usando o padrão OpenAPI para facilitar o entendimento dos endpoints e dos parâmetros esperados.

## Como Executar

Para executar a API localmente, siga estas etapas:

1. Clone este repositório.
2. Certifique-se de ter o Java e o Maven instalados em sua máquina.
3. Navegue até o diretório raiz do projeto.
4. Execute o comando `mvn spring-boot:run`.
5. Acesse os endpoints da API usando um cliente REST, como Postman ou curl.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver alguma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.
