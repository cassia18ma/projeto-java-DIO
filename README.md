# 💳 Projeto Bank-DIO


Este projeto foi desenvolvido durante o **Bootcamp NTT DATA Quality Assurance**, realizado pela **Digital Innovation One (DIO)**.  
O objetivo foi praticar conceitos de **Java** e **Programação Orientada a Objetos**, através da simulação de um **sistema bancário digital**, 
com funcionalidades como **criação de contas, PIX, investimentos, depósitos, saques e transferências**.

---

## 🚀 Tecnologias utilizadas
- **Java 21**
- **Lombok** (para reduzir boilerplate de getters, toString, etc.)
- **Paradigma Orientado a Objetos**
- **Tratamento de Exceções Personalizadas**

---

## 📚 O que aprendi com este projeto
- Criar **modelos de domínio** para representar entidades bancárias (`Wallet`, `AccountWallet`, `InvestmentWallet`, `Investment`).
- Trabalhar com **enums** (`BankService`).
- Implementar **exceções personalizadas** para regras de negócio.
- Usar **listas e streams** para manipular dados.
- Organizar o código em **camadas de repositório, modelo e exceptions**.
- Criar um **menu interativo no console** usando `Scanner`.

---

## 🛠 Funcionalidades implementadas
- Criar conta com chave(s) PIX.
- Criar investimento.
- Criar carteira de investimento vinculada a uma conta.
- Depositar em conta.
- Sacar da conta.
- Transferir dinheiro entre contas (via PIX).
- Aplicar dinheiro em investimento.
- Resgatar valores de investimento.
- Listar contas existentes.
- Listar investimentos.
- Listar carteiras de investimento.
- Atualizar investimentos (aplicando rendimento percentual).
- Consultar histórico da conta (extrato simplificado).

---

## ⚠️ Limitações atuais
- O sistema roda apenas em **console**.
- Ainda faltam algumas **validações extras** para evitar erros em casos específicos.
- O controle de valores é feito em **centavos como unidades discretas de Money**, o que pode ser otimizado no futuro.
- Não há **persistência em banco de dados** (os dados somem ao encerrar o programa).

---

## 🔮 Melhorias futuras
- Adicionar **testes automatizados (JUnit)**.
- Criar **camada de persistência** com banco de dados.
- Melhorar a **interface com o usuário** (ex: aplicação web com Spring Boot).
- Implementar **validações mais completas** em operações financeiras.
- Internacionalização (mensagens em português/inglês).

---

## ▶️ Como executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/dio-bank.git