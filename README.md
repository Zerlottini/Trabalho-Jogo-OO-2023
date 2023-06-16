# Trabalho-Jogo-OO-2023
Trabalho de Orientação a Objetos, desenvolver um jogo de perguntas e respostas. 

# Documentação do Sistema

## Objetivo do Sistema
O código representa um jogo de quiz simples no qual os jogadores podem escolher um personagem e responder a perguntas de múltipla escolha. 

Aqui está uma visão geral do código:
A classe Personagem representa um personagem no jogo. Ela possui atributos como nome, HP (pontos de vida) e status.
A classe Perguntas representa uma pergunta no jogo. Ela possui atributos como a própria pergunta, uma lista de alternativas e o índice da resposta correta.
A classe Alternativas representa uma alternativa (resposta) para uma pergunta. Ela possui atributos como a resposta em si e um status indicando se é a resposta correta.
A classe JogoPerguntas é a classe principal que controla o jogo. Ela inicializa o jogo criando personagens e perguntas e fornece opções de menu para os jogadores escolherem personagens, ver informações sobre os desenvolvedores, obter uma explicação do jogo ou sair do jogo.
Para jogar o jogo, você pode executar o método principal (main) na classe JogoPerguntas. 
Ele exibirá um menu com opções. 
Escolha a opção 1 para selecionar personagens para o Jogador 1 e o Jogador 2.
Após selecionar os personagens, o jogo prosseguirá com perguntas de múltipla escolha e avaliação das respostas.

## Definições e Siglas

Classe JogoPerguntas:

Atributos: São variáveis da classe JogoPerguntas que armazenam dados utilizados em diferentes partes do jogo, como as listas de personagens e perguntas, além dos jogadores selecionados.

ArrayList: É uma classe em Java que implementa uma lista de tamanho dinâmico, permitindo adicionar, remover e acessar elementos de maneira flexível.

Scanner: É uma classe em Java que permite ler a entrada do usuário a partir do teclado.

Classes:
JogoPerguntas: É uma classe principal que contém o método main() e é responsável por iniciar o jogo e exibir o menu inicial.

Personagem: É uma classe que representa um personagem do jogo, com atributos como nome, pontos de vida (HP) e se está disponível ou não.

Perguntas: É uma classe que representa uma pergunta do jogo, com atributos como o enunciado da pergunta, uma lista de alternativas e o índice da resposta correta.

Métodos:
inicializarJogo(): É um método responsável por inicializar o jogo, cadastrando os personagens e perguntas no jogo.

exibirMenuInicial(): É um método que exibe o menu inicial do jogo e solicita ao jogador que escolha uma opção. Dependendo da opção escolhida, ele executa diferentes ações, como exibir as informações dos desenvolvedores ou iniciar o jogo.

menuEscolhaPersonagem(): É um método que exibe o menu de escolha de personagem, permitindo que os jogadores selecionem seus personagens a partir de uma lista de personagens disponíveis.

iniciarPartida(): É um método que inicia a partida do jogo. Ele exibe o status dos jogadores e apresenta uma pergunta a cada rodada. Os jogadores devem escolher uma alternativa, e o jogo verifica se a resposta está correta, atualizando os pontos de vida dos jogadores.

Classe Alternativas:

Atributos:

enunciado_A: Uma String que representa o enunciado da alternativa.
status: Um booleano que indica se a alternativa está correta ou não.

Métodos:

Construtor: Inicializa os atributos da classe.
getEnunciado(): Retorna o enunciado da alternativa.
getStatusA(): Retorna o status da alternativa (se está correta ou não).
setEnunciado(String enunciado_A): Define o enunciado da alternativa.
setStatusA(boolean status): Define o status da alternativa.

Classe Perguntas:

Atributos:
enunciado: Uma String que representa o enunciado da pergunta.
alternativa: Uma lista de objetos da classe Alternativas, que representa as opções de resposta para a pergunta.
opcaoCorreta: Um inteiro que indica o índice da opção correta dentro da lista de alternativas.
Métodos:
Construtor: Inicializa os atributos da classe.
getEnunciado(): Retorna o enunciado da pergunta.
setEnunciado(String enunciado): Define o enunciado da pergunta.
getAlternativas(): Retorna a lista de alternativas da pergunta.
setAlternativas(ArrayList<String> alternativas): Define a lista de alternativas da pergunta.
getOpcaoCorreta(): Retorna o índice da opção correta.
setOpcaoCorreta(int opcaoCorreta): Define o índice da opção correta.
  
Classe Personagem:

Atributos:
nome: Uma String que representa o nome do personagem.
hp: Um inteiro que representa os pontos de vida do personagem.
status: Um booleano que indica o status do personagem.
Métodos:
Construtor: Inicializa os atributos da classe.
getNome(): Retorna o nome do personagem.
getHP(): Retorna os pontos de vida do personagem.
getStatus(): Retorna o status do personagem.
setNome(String nome): Define o nome do personagem.
setHP(int hp): Define os pontos de vida do personagem.
setStatus(boolean status): Define o status do personagem.

## Colaboradores
- [Henrique Zerlottini](https://github.com/Zerlottini)
- [Pedro Henrique](https://github.com/PedroHen0510)
- [Davi Samuel](https://github.com/DaviSamuelFB)
- ...

## Diagrama de Classes do Sistema
Consulte [este link]("C:\Users\zerlo\Downloads\DiagramaDeSistema.drawio.png") para visualizar o diagrama de classes do sistema.

## Modelo Entidade-Relacionamento da Base de Dados
Consulte [este link](link_para_modelo_entidade_relacionamento.png) para visualizar o modelo entidade-relacionamento da base de dados do sistema.
