# 💱 Conversor de Moedas em Java (com API em Tempo Real)

Este projeto é um **conversor de moedas** desenvolvido em Java, que utiliza uma **API pública** para obter as taxas de câmbio em tempo real. Ele converte valores a partir do **Real Brasileiro (BRL)** para outras moedas, como **Dólar Americano (USD)** e **Euro (EUR)**.

## 🚀 Funcionalidades

- Entrada de valor em BRL pelo usuário
- Seleção da moeda de destino (USD ou EUR)
- Consulta em tempo real das taxas de câmbio usando a [ExchangeRate API](https://www.exchangerate-api.com/)
- Conversão e exibição do valor convertido
- Tratamento de erros de conexão ou resposta inválida

## 🧰 Tecnologias Utilizadas

- Java 11+
- `HttpClient` para requisições HTTP
- `org.json` para leitura e manipulação de JSON

## 📦 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas-java.git
