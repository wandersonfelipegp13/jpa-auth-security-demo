# JPA Authentication with Spring Security Demo

Demo de uma API REST que autentica usuários em um bando de 
dados. Nessa demo é usado uma classe de modelo para usuários,
uma classe que implementa o UserDetails e faz uso do modelo
de usuários, e um um service para UserDetails.

É usado o Banco de Dados em memória H2, em `/h2-console`, 
com o acesso ao console liberado, de forma que é possível 
gerenciar usuários diretamente no BD. Utilize um gerador 
de hash Bcrypt, para as senhas, caso use o console do H2.

## Como rodar

```sh
$ mvn spring-boot:run
```