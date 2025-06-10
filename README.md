# Problema da Mochila Fracionária (Java)

Este projeto resolve o clássico **Problema da Mochila Fracionária** usando a abordagem de **algoritmo guloso (greedy algorithm)** em Java.

## 💼 Problema

Dada uma mochila com uma capacidade máxima e uma lista de itens (cada um com um valor e um peso), o objetivo é **maximizar o valor total** colocado na mochila. Neste problema, é permitido **quebrar os itens** (usar frações deles).

## 📌 Exemplo de Entrada

Itens disponíveis:

| Valor | Peso |
|-------|------|
| 80    | 10   |
| 120   | 20   |
| 180   | 30   |
| 160   | 40   |

Capacidade da mochila: `60`

## ✅ Resultado

Com base no valor por peso (`valor/peso`), os melhores itens são escolhidos primeiro.

**Saída esperada:**

Valor total na mochila: 380.00

## 🚀 Como Executar

### Pré-requisitos
- Java JDK instalado (recomendado JDK 17+)
- VS Code com extensões de Java

### Comandos

```bash
javac MochilaFracionaria.java
java MochilaFracionaria

📁 Estrutura do Projeto

📦MochilaFracionaria
 ┣ 📄 MochilaFracionaria.java
 ┗ 📄 README.md

🧠 Estratégia
O algoritmo:

Ordena os itens por valor/peso decrescente.

Adiciona os itens à mochila:

Se couberem inteiros, adiciona tudo.

Caso contrário, adiciona uma fração.

📝 Licença
Este projeto é livre para uso acadêmico e educacional.

✍️ Autor
Nome: João Antônio da Costa

