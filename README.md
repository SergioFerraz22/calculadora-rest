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

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Springdoc OpenAPI
- Log4j
- Lombok
- Maven

## Padrões de Projeto Aplicados

Esta API foi desenvolvida seguindo alguns padrões de projeto, incluindo os princípios do SOLID, para garantir um código organizado, flexível e de fácil manutenção:

- **Injeção de Dependência**: As dependências das classes foram injetadas usando o padrão de Injeção de Dependência, conforme o princípio da Inversão de Dependência do SOLID. Isso permite uma fácil substituição de implementações e uma melhor testabilidade do código.
- **Separação de Responsabilidades (Separation of Concerns)**: As classes foram organizadas de forma a separar as diferentes responsabilidades, seguindo o princípio da Responsabilidade Única do SOLID. Isso promove um código mais modular e coeso.
- **Documentação com OpenAPI**: A API foi documentada usando o padrão OpenAPI para facilitar o entendimento dos endpoints e dos parâmetros esperados.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src/main/java`: Contém o código-fonte do projeto Java.
  - `br.com.calculadora.rest.api.controller`: Pacote que contém os controladores REST da aplicação.
  - `br.com.calculadora.rest.config`: Pacote com as configurações do Spring Boot e do OpenAPI.
  - `br.com.calculadora.rest.model`: Pacote com as classes de modelo e serviços da calculadora.
- `src/main/resources`: Contém os recursos do projeto, como arquivos de propriedades e configurações.
- `pom.xml`: Arquivo de configuração do Maven, responsável pela definição das dependências e plugins do projeto.

## Como Executar

Para executar o projeto localmente, siga estas etapas:

1. Clone o repositório para sua máquina local.
2. Abra o projeto em sua IDE Java preferida.
3. Certifique-se de ter o Maven instalado e configurado em seu ambiente.
4. Execute o comando `mvn spring-boot:run` na raiz do projeto.
5. Acesse a API em `http://localhost:8080`.

## Documentação da API

A documentação da API está disponível em `http://localhost:8080/swagger-ui.html`, onde você pode visualizar e testar os endpoints disponíveis.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver alguma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.
