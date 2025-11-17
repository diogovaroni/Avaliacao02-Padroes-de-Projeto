# 📘 Exercícios de Design Patterns – Java

Este repositório contém a implementação de **quatro exercícios** utilizando princípios de **POO**, **SOLID** e **Design Patterns**, seguindo o mesmo estilo adotado pelo professor em sala.

---

## ✔️ Questão 01 – Factory Method + Singleton

### 🎯 Objetivo
Criar um sistema de geração de relatórios (PDF, CSV, Excel), onde cada formato possui sua própria fábrica.  
Um gerenciador central utiliza **Singleton** para garantir apenas uma instância responsável por coordenar a criação.

### 🧩 Padrões utilizados
- Factory Method  
- Singleton

### 📁 Estrutura
EXERCICIO_01_FACTORY/
RelatorioFactory (abstract)
PDFRelatorioFactory / CSVRelatorioFactory / ExcelRelatorioFactory
Relatorio (interface)
PDFRelatorio / CSVRelatorio / ExcelRelatorio
RelatorioManager (Singleton)
Main

yaml
Copiar código

---

## ✔️ Questão 02 – Strategy

### 🎯 Objetivo
Implementar cálculo de frete com três estratégias intercambiáveis: PAC, Sedex e Expresso.  
O usuário pode alternar a estratégia em tempo de execução.

### 🧩 Padrões utilizados
- Strategy

### 📁 Estrutura
EXERCICIO_02_STRATEGY/
FreteStrategy (interface)
PACStrategy / SedexStrategy / ExpressoStrategy
CalculadoraFrete (Context)
Main

yaml
Copiar código

---

## ✔️ Questão 03 – Observer

### 🎯 Objetivo
Criar um sistema de notificação para mudanças de estoque. Ao alterar a quantidade de um produto, os observadores inscritos (loja física, e-commerce e financeiro) são notificados automaticamente.

### 🧩 Padrões utilizados
- Observer

### 📁 Estrutura
EXERCICIO_03_OBSERVER/
Observador (interface)
LojaFisicaObserver / EcommerceObserver / FinanceiroObserver
Produto (Subject)
Main

markdown
Copiar código

---

## ✔️ Questão 04 – Chain of Responsibility

### 🎯 Objetivo
Criar uma cadeia de validação de **documentos fiscais (NF-e)**.  
A validação deve acontecer em etapas:

1. Schema XML  
2. Certificado digital  
3. Regras fiscais  
4. Banco de dados (com rollback se etapas posteriores falharem)  
5. Consulta SEFAZ  

### 🔧 Requisitos adicionais
- Execução condicional entre handlers  
- Circuit Breaker (interrompe após 3 falhas)  
- Timeout por validador  
- Rollback em validadores que modificam o documento  

### 🧩 Padrões utilizados
- Chain of Responsibility

### 📁 Estrutura
EXERCICIO_04_CHAIN/
Handler (abstract)
SchemaValidator
CertificadoValidator
RegrasFiscaisValidator
BancoValidator (rollback)
SefazValidator
CircuitBreaker
TimeoutHandler
Main

yaml
Copiar código

---

## 🛠️ Tecnologias utilizadas
- Java  
- Programação Orientada a Objetos  
- Princípios SOLID  
- Design Patterns

---

## ▶️ Como executar
Abra qualquer exercício e depois execute a classe `Main` correspondente.

---
