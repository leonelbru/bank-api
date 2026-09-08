# Bank API

API REST de um sistema bancário desenvolvida em **Java com Spring Boot**.

Este projeto representa a primeira etapa de uma aplicação que será evoluída gradualmente. O foco inicial é consolidar fundamentos de desenvolvimento backend em Java, aplicando persistência de dados, regras de negócio, APIs REST, testes e conteinerização.

## Fase 1

Nesta primeira fase, o sistema permitirá:

- cadastro de cliente e conta;
- depósito;
- saque;
- transferência entre contas;
- consulta de saldo;
- consulta de extrato.

Também serão implementadas regras como validação de saldo, contas válidas em transferências, limite de uma conta por cliente e registro das movimentações realizadas. 

## Tecnologias

- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- PostgreSQL
- Docker / Docker Compose
- Maven
- Git / GitHub
- JUnit
- Mockito
- MockMVC
- Codecov

O PostgreSQL será executado em container Docker, enquanto a aplicação será estruturada em camadas para separar responsabilidades como API, regras de negócio e persistência. Os serviços serão expostos através de endpoints REST com respostas em JSON.

## Objetivo de aprendizado

A proposta desta etapa é desenvolver uma aplicação backend do zero, passando pela modelagem do domínio, persistência, implementação das regras de negócio, criação dos endpoints e testes automatizados, buscando cobertura mínima de 60%.

> Projeto em desenvolvimento.