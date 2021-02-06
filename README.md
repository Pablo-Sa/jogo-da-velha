# POC - Tic Tac Toe (Jogo da Velha)


# Deploy
## AWS - Elastic Container Service (ECS)
### Link direto para a documentação da Aplicação: http://ec2co-ecsel-no4rlbq56f2z-1148948020.us-east-2.elb.amazonaws.com/swagger-ui.html


# Heroku
* Fiz o Deploy desta aplicação no Heroku, abaixo segue o Link de acesso a mesma, tal lhe redirecionará para a página de documentação da API, feita utilizando o Framework Swagger, que através dela, poderá verificar todos os EndPoints disponíveis, bem como a utilização dos mesmos, assim caso queria testar o funcionamento da mesma sem precisar ambientar nada basta clicar no link abaixo.

    * https://poc-jogo-da-velha.herokuapp.com/swagger-ui.html  
    
   OBS: Esta é uma conta gratuita do Heroku, então ao tentar acessar a API pela primeira vez, bem provavelmente que irá demorar responder um pouco, pois por se tratar de conta gratuita o ambiente não fica disponível para acesso imediato, existirá um Delay, como uma inicialização do ambiente de onde a mesma está alocada, após aguardar uns instantes, a aplicação está disponível e com funcionamente similar a uma em produção

## DOCKER
Caso Queira Executar tal aplicação em um Container Docker, ambiente Ubuntu ou Windows, favor executar os passos abaixo.
- Partindo do pressuposto que já tenha instalado o Docker e o Docker-Compose em seu host S.O Linx como : Ubuntu, CentoOS e derivados ou Windows.
 - Somente  à partir do Arquivo `Docker-Compose.Yml` que se encontra na pasta raiz do projeto é possível gerar uma imagem Docker e por fim criar o Container.
 Basta simplesmente executar com o comando --> `docker-compose up`.

## docker-compose up
* Tudo Será feito de forma automatizada, pacotes seram instalados e ambientado. Lembrando que tal comando deve ser executado pelo terminal na pasta informada acima, exatamente onde se encontra o arquivo Docker-Compose.yml. Com o comando acima realizado, a aplicação inteira já está configurada e se tudo deu certo você deverá conseguir acessar a mesma pelo navegador, através do endereço de IP da qual a máquina host que foi instalado o Docker, na porta 80. 
#### 3 - Buildar e executar a aplicação

Dentro do diretório root da aplicação executar os passos abaixo.

3.1 Para rodar os testes:

##Obs para rodar os testes lembre-se que o maven precisa estar instalado. 

`$ mvn test #Para rodar os testes`

3.2 Para buildar a aplicação:
`$ mvn clean install #buildando o pacote da aplicação`

3.3 Para executar a aplicação:

O Maven através do `spring-boot-maven-plugin` gera o jar executável.
Então basta entrar no diretório `target/` e executar:

`$ java -jar target/br.com.poc.jogo.velha-0.0.1-SNAPSHOT.jar app.jar`

OBS: Caso apresente errro no comando acima tente informar todo o Diretório, então supondo que a pasta do projeto esteja em C:\
Logo o Comando Será : 
`$ java -jar "C:\pastadoprojeto\target\br.com.poc.jogo.velha-0.0.1-SNAPSHOT.jar"`

A partir deste ponto se tudo ocorrer corretamente a aplicação estará executando normalmente. 

É possível utilizar o client do swagger através da url [http://localhost/swagger-ui.html]

## Principais tecnologias e frameworks utilizados (Back-End)

- Spring Boot
- JUnit 5
- Mockito
- Swagger
- Lombook
- Bean Validation

## Bean Validation
Utilizado o mesmo para validações na Entidade DtoGame, tanto anotações padrões, bem como também foi criada uma anotação customizada.

## Lombok
Utilizado as anotações do Lombok para geração dos Getters and Setters e Construtores.
