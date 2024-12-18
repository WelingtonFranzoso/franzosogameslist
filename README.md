# Franzoso Games List
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/franzoso-agregador-de-investimentos/blob/main/LICENSE) 

# Sobre o projeto

Franzoso Games List é uma API REST desenvolvida como parte do Intensivão Java Spring, um evento organizado pela DevSuperior. A aplicação é construída com o padrão de camadas e permite a manipulação de uma lista de jogos. Os jogos podem ser listados com base em diferentes parâmetros, e também é possível alterar suas posições na lista. Todos os dados são inicializados diretamente no banco de dados através de um script import.sql.

## Modelo conceitual
![Modelo Conceitual](https://github.com/WelingtonFranzoso/franzosogameslist/blob/main/assets/franzosogameslist.png?raw=true)

# Funcionalidades
- Listagem de Jogos: Permite consultar jogos a partir de parâmetros como nome, categoria, entre outros.
- Alteração de Posições: É possível alterar a posição dos jogos na lista.
- Banco de Dados Semear: O banco de dados é populado automaticamente através do script import.sql com dados de jogos.

# Tecnologias utilizadas
- Java 17
- Spring Boot: Framework para construção da API.
- JPA / Hibernate: Para interação com o banco de dados relacional.
- Maven: Ferramenta de automação de build.
- Docker: Containerização da aplicação.
- Banco de Dados: PostgreSQL

# Como executar o projeto

## Back end
### Pré-requisitos: 

- Java 17
- Maven
- Docker
- PostgreSQL (ou Docker configurado para rodar o PostgreSQL)

```bash
# clonar repositório
git clone git@github.com:WelingtonFranzoso/franzosogameslist.git

# entrar na pasta do projeto back end
cd franzosogameslist

# executar o projeto
./mvnw spring-boot:run
```

### Banco de Dados

Caso queira configurar o PostgreSQL manualmente, crie uma base de dados com o nome games_list e execute o script import.sql para popular a base com dados de exemplo.

Caso prefira utilizar o Docker, um arquivo docker-compose.yml pode ser adicionado ao projeto para facilitar a configuração do PostgreSQL em containers.

# Autor

Welington Franzoso
https://www.linkedin.com/in/welington-franzoso-88a8301b9
