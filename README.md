# Projeto de Automação de Testes com Java Selenium

Este é um projeto de automação de testes utilizando Java Selenium, que implementa os design patterns Page Object Model (POM), Page Factory e Fluent Pages para melhorar a manutenção, escalabilidade e legibilidade dos testes automatizados.

## Sobre

Os testes são estruturados seguindo boas práticas, utilizando os seguintes design patterns:

- **Page Object Model (POM):** Os elementos da interface do usuário são encapsulados em classes dedicadas, facilitando a manutenção e reduzindo a duplicação de código.

- **Page Factory:** Uma page factory é utilizada para instanciar dinamicamente as classes de página conforme necessário, promovendo a reutilização do código.

- **Fluent Pages:** Métodos encadeados são utilizados para interações com os elementos da página, melhorando a legibilidade e expressividade dos testes.

## Pré-requisitos

- Java JDK
- JUnit
- WebDriver
- WebDriverManager

## Estrutura do Projeto
`src/main/java`: Contém todos os utilitários.

`src/test/java`: Contém os testes automatizados.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver alguma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Como Executar

1. Clone este repositório para o seu ambiente local:

`git clone https://github.com/dorivaldongoma/saucedemo-test-automation`

2. Abra o projeto na IDE de sua preferência.

3. Vá até ao arquivo pom.xml e baixe ou atualize as dependências do Maven.

4. Vá à suite de testes em src/test/java/testsuites e execute os testes.