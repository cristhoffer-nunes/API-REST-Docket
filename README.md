# API REST Docket

API REST para o sistema de cartórios com todas as funcionalidades do sistema.

**Planejamento do projeto**: Foi utilizado o plugin Spring no Eclipse para realizar a criação do projeto e foi inspirado em um projeto pessoal onde realizo uma API REST para incluir, consultar, atualizar e deletar um produto.

## Tecnologias
![Spring Badge](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)

## Dependências utilizadas

* Spring Web
* Spring Data JPA
* Spring Boot Devtools
* MySQL Driver
* Bean Validation

## Baixando o repositório:

Para baixar esse repositório no seu computador, rode o código abaixo ou clicke em [download](https://github.com/cristhoffer-nunes/API-REST-Docket/archive/main.zip).

```bash
$ git clone https://github.com/cristhoffer-nunes/API-REST-Docket.git
```

## Configurando e iniciando o projeto: 

Importe o projeto como Maven Project em sua IDE de preferência e edite no arquivo **application.properties** os dados necessários para realizar a conexão com o MySQL

> spring.datasource.url=jdbc:mysql://localhost:3306/**INSIRA AQUI SEU SCHEMA** <br>
spring.datasource.username=**INSIRA SEU USUARIO DO MYSQL** <br>
spring.datasource.password=**INSIRA SUA SENHA DO MYSQL** <br>

Feito as configurações necessárias execute o projeto e acesse o programa de sua preferência para realizar as requisições <br> **GET, POST, PUT, DELETE**.
 

## Requisição GET
* **Todos** os cartórios poderão ser consultados de uma unica vez. <br>
Utilize a requisição GET e insira a seguinte url: 
> http://localhost:8080/cartorio

* O cartório poderá ser consultado pelo id. <br>
Utilize a requisição GET e insira a seguinte url (Substituia o  * pelo o **ID** do cartório): 
> http://localhost:8080/cartorio/*

* O cartório poderá ser consultado pelo **nome ou parte de seu nome** (se mais de um cartório conter a parte do nome todos serão exibídos). <br>
Utilize a requisição GET e insira a seguinte url (Substituia o  * pelo **NOME OU PARTE DO NOME** do cartório): 
> http://localhost:8080/cartorio/nome/*

* Poderá ser feito uma consulta paginada. Se **mais de 5 cartórios** for solictado para exbir então **será exibindo apenas 5**. <br>
Utilize a requisição GET e insira a seguinte url (Substituia os * respectivamente pelo **NÚMERO DA PÁGINA E A QUANTIDADE DE CARTÓRIOS**.): 
> http://localhost:8080/cartorio/pagina/*/*

## Requisição POST
* Utilize a requisição POST e insira a seguinte url: 
> http://localhost:8080/cartorio
* Em seu programa de preferência para realizar as requisições utilize como key: <br>
> nome <br>
> endereco <br>
> certidao <br>

## Requisição PUT
* Utilize a requisição PUT e insira a seguinte url:
> http://localhost:8080/cartorio
* Em seu programa de preferência para realizar as requisições utilize como key (é **obrigatório inserir o ID do cartório** para poder alterá-lo): <br>
> id <br>
> nome <br>
> endereco <br>
> certidao <br>

## Requisição DELETE
* Utilize a requisição DELETE e insira a seguinte url (Substitua o * pelo ID do cartório):
> http://localhost:8080/cartorio/*



