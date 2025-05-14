# Challenge Conversor de Moedas

## Descrição do projeto

Este projeto é um **Conversor de Moedas** desenvolvido em Java, utilizando a [API ExchangeRate](https://www.exchangerate-api.com/) para buscar taxas de câmbio em tempo real. 

Conversão entre as seguintes moedas:
   - Real (BRL)
   - Dólar americano (USD)
   - Peso argentino (ARS)
   - Iene (JPY)
   - Dolar Canadense (CAD)
   - Libra esterlina (GBP)
  
O projeto foi desenvolvido como parte do curso de Java e Orientação a Objetos do programa Oracle Next Education (ONE), parceria com a Alura, com o objetivo de aplicar conceitos importantes de Java, como consumo de API, herança, polimorfismo, entre outros.

  
## Tecnologias utilizadas

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width=30>
<img src="https://img.shields.io/badge/Java-21.o.7-%23ED8B00?style=for-the-badge&logo=java-original">
<img src="https://img.shields.io/badge/Gson-2.13.1-EA4335?style=flat-square&logo=google" width=134>
<img src="https://img.shields.io/badge/HTTP_Client-Nativo-007396?style=flat-square" width=160>


## ⚙️ Dependências
 - Gson (para parsear JSON)

A dependência pode ser adicionada via Maven, Gradle, ou utilizando o .jar manualmente.


## Como Executar

1. Certifique-se de ter o Java JDK instalado (versão 21)
2. Clone o repositório:
   ```bash
   git clone https://github.com/MarcosPauloRC/Oracle-challenge-Conversor-de-Moedas.git
   ```
3. Navegue até o diretório do projeto:
   ```bash
   cd Conversor-de-Moedas
   ```


## 📦 Funcionalidades Implementadas
- ✅ Menu com **13 opções de conversão**;
- ✅ Conversões disponíveis:
  - USD ⇄ BRL
  - EUR ⇄ BRL
  - ARS ⇄ BRL
  - GBP ⇄ BRL
  - JPY ⇄ BRL
  - CAD ⇄ BRL
- ✅ Requisição HTTP à API de câmbio;
- ✅ Parsing da resposta JSON com Gson;
- ✅ Cálculo e exibição do valor convertido;
- ✅ Interface via terminal amigável;
- ✅ Tratamento de erros (valores inválidos, falha na API, etc).


## API Key

Este projeto utiliza a ExchangeRate-API. Para executar com sua própria chave:

1. Crie uma conta gratuita em [https://www.exchangerate-api.com](https://www.exchangerate-api.com).
2. Substitua a `apikey` na classe `Conversor` pela sua chave pessoal.

## **Autor:**

**Marcos Paulo Ribeiro Coelho**  
🔗 [GitHub - @MarcosPauloRC](https://github.com/MarcosPauloRC)
