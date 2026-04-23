# 🎮 StartupBust — Batalha Naval em Java

> Afunde as Startups antes que elas afundem você.

Projeto desenvolvido como exercício prático durante os estudos com o livro **"Usando Java"**, implementando um jogo no estilo batalha naval totalmente no terminal.

---

## 📖 Sobre o Projeto

O jogador tenta afundar 3 Startups escondidas num tabuleiro 7x7, digitando coordenadas como `a0`, `c4`, `f6`. A cada acerto o jogo responde com **hit** ou **kill** — e no fim, sua pontuação é avaliada pelo número de tentativas.

---

## 🗂️ Estrutura do Projeto

```
StartupBust/
├── GameHelper.java          # Leitura de input e posicionamento no grid
├── StartupBoardGame.java    # Lógica do tabuleiro e coordenadas
├── Startup.java             # Entidade Startup: localização e verificação de chutes
└── StartupBust.java         # Controlador principal + main()
```

### Responsabilidades de cada classe

| Classe | Responsabilidade |
|---|---|
| `GameHelper` | Lê o input do usuário e posiciona as Startups aleatoriamente no grid 7x7 |
| `StartupBoardGame` | Gerencia o tabuleiro, converte coordenadas numéricas para formato `letra+número` |
| `Startup` | Armazena as células de cada Startup e verifica se o chute foi miss/hit/kill |
| `StartupBust` | Orquestra o fluxo completo do jogo: setup → loop de jogo → resultado final |

---

## 🕹️ Como Jogar

1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/StartupBust.git
```

2. Compile todos os arquivos
```bash
javac *.java
```

3. Execute o jogo
```bash
java StartupBust
```

4. Digite coordenadas no formato `letraColuna + linha` para tentar afundar as Startups:
```
Enter a guess:
> a0
miss

Enter a guess:
> c3
hit

Enter a guess:
> c4
kill
```

---

## 🧠 Conceitos Aplicados

- ✅ Orientação a Objetos — encapsulamento, instâncias e responsabilidades por classe
- ✅ `ArrayList` — coleções dinâmicas para armazenar localizações e Startups ativas
- ✅ Loops e controle de fluxo — `while`, `for-each`, `break`
- ✅ Geração aleatória — posicionamento dinâmico com `Random`
- ✅ Depuração — identificação e correção de bugs reais durante o desenvolvimento

---

## 📚 Referência

Baseado nos exercícios do livro:

> **Usando Java** — *Kathy Sierra & Bert Bates*  
> Editora Alta Books

---

## 👨‍💻 Autor
- Pyetro Ribeiro
Feito com ☕ e muitos `System.out.println()` de debug.
