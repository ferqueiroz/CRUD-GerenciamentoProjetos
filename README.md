# Exercício 09: Gerenciamento de Projeto

## Enunciado
Crie um serviço RESTful em Spring Boot para gerenciar projetos. O objetivo é praticar mapeamento JPA com tipos de data e operações CRUD.

## Entidade: Projeto
| Atributo   | Tipo      | Descrição                                         |
|:-----------|:----------|:--------------------------------------------------|
| id         | Long      | Identificador único (chave primária, auto-gerado) |
| nome       | String    | Nome do projeto                                   |
| dataInicio | LocalDate | Data de ínicio do projeto                         |
| dataFim    | localDate | Data de término do projeto                        |

## Requisitos
1. Crie uma entidade JPA chamada Projeto com os atributos especificados
2. Configure o nome da entidade JPA como Projeto
3. Configure o nome da tabela no banco como tb_projeto
4. Pelo menos dois atributos devem ter o nome do campo diferente do nome da coluna no banco, utilizando @Column(name="...")
5. Implemente um repositório Spring Data JPA para a entidade
6. Implemente um serviço para realizar as operações de CRUD
7. Crie um controlador REST que exponha os seguintes endpoints

## Endpoints RESTful
* POST /projetos — criar novo projeto
* GET /projetos — listar todos os projetos
* GET /projetos/{id} — buscar projeto por ID
* DELETE /projetos/{id} — deletar projeto por ID

## Observações
* Não é necessário implementar validação de dados
* Utilize as convenções Java para nomes de métodos, atributos e classes
* Seu código deve estar organizado em pacotes seguindo boas práticas
