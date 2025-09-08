# IntStack

Uma biblioteca simples em Java para manipulação de pilhas de inteiros, com operações clássicas como `push`, `pop`, `top` e `size`, e um diferencial: o método `max()`, que retorna o maior valor da pilha **sem alterar sua estrutura ou conteúdo**.

---

## 💡 Sobre o projeto

Este projeto foi desenvolvido com o objetivo de estudar e aplicar conceitos de estruturas de dados, especialmente **pilhas encadeadas**, em Java.  
Além das funcionalidades básicas de uma pilha, foi implementado o método `max()`, que percorre a pilha temporariamente para encontrar o maior valor, restaurando-a logo em seguida.

A pilha é construída com listas encadeadas simples e não utiliza bibliotecas externas.

---

## ⚙️ Funcionalidades

- ✔️ Inserir elemento no topo da pilha (`push`)
- ✔️ Remover elemento do topo (`pop`)
- ✔️ Verificar o elemento no topo sem remover (`top`)
- ✔️ Ver o número de elementos na pilha (`size`)
- ✔️ **Encontrar o maior elemento da pilha sem alterá-la (`max`)**

---

## 🛠️ Como usar

### 1. Clone o repositório

```bash
git clone https://github.com/MarkzZero/IntStack.git
```

### 2. Importe para sua IDE

Abra sua IDE Java (como Eclipse ou IntelliJ) e importe a pasta src.

### 3. Compile e execute

Crie uma classe de teste (por exemplo Main.java) e use os métodos da pilha:

```java
Pilha p = new Pilha();
p.push(10);
p.push(25);
p.push(3);
System.out.println("Maior valor: " + p.max()); // Saída: 25
```

##📌 Observação

O método `max()` utiliza uma pilha auxiliar para restaurar a pilha original após a busca. Assim, mesmo com operações destrutivas como `pop()`, o estado da pilha permanece intacto ao final da operação.


