# Api StarWars
Este CRUD inclui, exclui e edita planetas de starwars, além de pesquisar na apo SWAPI quantos filmes o planeta incluido apareceu.

## Tecnologias
* Java 8
* Spring Boot 2.3.1.RELEASE
* Lombok
* JSF
* Primefaces

## Requisitos
* Java 8

## Fluxograma criação/alterar de planetas
```mermaid        
 graph LR;     
 A((INICIO))-->B[Recebe valores para inserir];
 B-->C{Algum campo está sem preencher?}; 
 C--Não-->D[Envia os dados para o banco de dados H2]; 
 C--"SIM"-->E[Apresenta mensagem de qual campo precisa ser preenchido e não permite inserir os dados.];
 D-->F((FIM));
```

## Para execução
Deve baixar o projeto do repositorio um um git clone REPOSITORIO, após deve configurar uma execução com o
tomcat, com a URL http://localhost:8090/star_wars_planets_war_exploded/"