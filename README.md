# Aposentabilidade

Aplicação full stack que avalia, a partir da idade, se uma pessoa já pode se aposentar, e guarda o histórico das avaliações feitas.

Projeto de estudo de Java full stack, em desenvolvimento.

## Tecnologias

| Camada | Tecnologias |
|---|---|
| Back-end | Java 21, Spring Boot 4, Spring Data JPA |
| Banco de dados | PostgreSQL |
| Front-end | Angular 22, TypeScript |
| Testes | JUnit 5 |

## Como funciona

O front-end em Angular chama uma API REST em Spring Boot, que aplica a regra de negócio e grava o resultado no PostgreSQL.

O back-end é organizado em camadas:

- **controller**: recebe as requisições HTTP e devolve as respostas.
- **service**: contém a regra de negócio (pode se aposentar quem tem 65 anos ou mais).
- **repository**: faz a comunicação com o banco de dados por meio do JPA.
- **model**: a entidade `Avaliacao`, que vira a tabela no banco.

## Endpoints da API

| Método | Caminho | O que faz |
|---|---|---|
| GET | `/api/status` | Informa se o serviço está no ar |
| POST | `/api/avaliacoes?idade=70` | Cria uma avaliação para a idade informada e grava no banco |
| GET | `/api/avaliacoes` | Lista todas as avaliações gravadas |

Exemplo de resposta do POST:

```json
{
  "id": 1,
  "idade": 70,
  "podeAposentar": true
}
```

## Como rodar

Pré-requisitos: Java 21, Node.js e PostgreSQL instalados.

### 1. Banco de dados

Crie um banco chamado `aposentabilidade` no PostgreSQL:

```bash
createdb aposentabilidade
```

Ajuste o usuário e a senha do banco em `backend/src/main/resources/application.properties`. As tabelas são criadas automaticamente quando o back-end sobe.

### 2. Back-end

```bash
cd backend
./mvnw spring-boot:run
```

A API fica disponível em `http://localhost:8080`.

### 3. Front-end

```bash
cd frontend
npm install
npm start
```

A aplicação abre em `http://localhost:4200`.

### Testes

```bash
cd backend
./mvnw test
```

## Situação atual

Pronto:

- API REST para criar e listar avaliações
- Gravação no PostgreSQL com JPA
- Testes unitários da regra de aposentadoria
- Tela em Angular com a lista de avaliações e o resultado de cada uma

Próximos passos:

- Formulário no front-end para criar uma avaliação
- Validação dos dados de entrada
- Autenticação com Spring Security
- Testes com Mockito

## Autora

Gabrielly Araújo
