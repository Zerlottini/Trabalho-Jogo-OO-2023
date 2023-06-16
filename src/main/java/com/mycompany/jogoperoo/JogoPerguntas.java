package com.mycompany.jogoperoo;


import java.util.ArrayList;
import java.util.Scanner;

public class JogoPerguntas {

    //Atributos 
    private static ArrayList<Personagem> personagens;
    private static ArrayList<Perguntas> perguntas;
    private static Personagem jogador1;
    private static Personagem jogador2;

    public static void main(String[] args) {
      
      //Métodos Iniciar jogo e Exibir Menu 
        inicializarJogo();
        exibirMenuInicial();
        
    }

    //Método Iniciar jogo
    private static void inicializarJogo() {
        personagens = new ArrayList<>();
        perguntas = new ArrayList<>();

        // Cadastrar personagens
        Personagem p1 = new Personagem("Hawking", 100, true);
        Personagem p2 = new Personagem("Newton", 100, true);
        Personagem p3 = new Personagem("Voltaire", 100, true);

        personagens.add(p1);
        personagens.add(p2);
        personagens.add(p3);

        // Cadastrar perguntas
        ArrayList<String> alternativasPergunta1 = new ArrayList<>();
        alternativasPergunta1.add("Uma estrutura de controle de repetição"); //Verdadeira
        alternativasPergunta1.add("Um tipo de dado numérico");
        alternativasPergunta1.add("Uma estrutura de controle condicional");
        perguntas.add(new Perguntas("Na programação, o que é um loop?", alternativasPergunta1, 0));

        ArrayList<String> alternativasPergunta2 = new ArrayList<>();
        alternativasPergunta2.add("Inteiro");
        alternativasPergunta2.add("Ponto flutuante");
        alternativasPergunta2.add("Vetor"); //Verdadeira
        perguntas.add(new Perguntas("Qual das seguintes alternativas, não é um tipo de dado primitivo em programação?", alternativasPergunta2, 2));

        ArrayList<String> alternativasPergunta3 = new ArrayList<>();
        alternativasPergunta3.add("Um arquivo que contém código fonte");
        alternativasPergunta3.add("Um conjunto de instruções que realiza uma tarefa específica"); //Verdadeira
        alternativasPergunta3.add("Um tipo de dado booleano");
        perguntas.add(new Perguntas("O que é um método em programação orientada a objetos?", alternativasPergunta3, 1));

        ArrayList<String> alternativasPergunta4 = new ArrayList<>();
        alternativasPergunta4.add("Um mecanismo que permite a um objeto se comunicar com outro objeto");
        alternativasPergunta4.add("Um processo de criar uma nova classe a partir de uma classe existente"); //Verdadeira
        alternativasPergunta4.add("Uma estrutura de controle de repetição");
        perguntas.add(new Perguntas("O que é herança em programação orientada a objetos?", alternativasPergunta4, 1));

        ArrayList<String> alternativasPergunta5 = new ArrayList<>();
        alternativasPergunta5.add("Um gráfico que mostra a execução sequencial das operações de um programa");
        alternativasPergunta5.add("Um modelo visual que representa as classes em um sistema e seus relacionamentos"); //Verdadeira
        alternativasPergunta5.add("Uma representação gráfica de uma estrutura de dados");
        perguntas.add(new Perguntas("O que é um diagrama de classes na modelagem de software?", alternativasPergunta5, 1));

        ArrayList<String> alternativasPergunta6 = new ArrayList<>();
        alternativasPergunta6.add("class"); //Verdadeira
        alternativasPergunta6.add("object");
        alternativasPergunta6.add("method");
        perguntas.add(new Perguntas("Qual das seguintes palavras-chave é usada para definir uma classe em Java?", alternativasPergunta6, 0));

        ArrayList<String> alternativasPergunta7 = new ArrayList<>();
        alternativasPergunta7.add("Uma função que realiza uma tarefa específica");
        alternativasPergunta7.add("Uma instância de uma classe"); //Verdadeira
        alternativasPergunta7.add("Um valor booleano");
        perguntas.add(new Perguntas("O que é um objeto em programação orientada a objetos?", alternativasPergunta7, 1));

        ArrayList<String> alternativasPergunta8 = new ArrayList<>();
        alternativasPergunta8.add("Um operador que compara dois valores");
        alternativasPergunta8.add("Um operador que realiza operações matemáticas");
        alternativasPergunta8.add("Um operador que atribui um valor a uma variável"); //Verdadeira
        perguntas.add(new Perguntas("O que é um operador de atribuição em programação?", alternativasPergunta7, 2));

        ArrayList<String> alternativasPergunta9 = new ArrayList<>();
        alternativasPergunta9.add("Encapsulamento");
        alternativasPergunta9.add("Herança"); 
        alternativasPergunta9.add("Loops"); //Verdadeira
        perguntas.add(new Perguntas("Qual das alternativas à seguir, não é um princípio da programação orientada a objetos?", alternativasPergunta9, 2));

        ArrayList<String> alternativasPergunta10 = new ArrayList<>();
        alternativasPergunta10.add("Um gráfico que mostra a estrutura hierárquica de um sistema");
        alternativasPergunta10.add("Um modelo visual que representa a interação entre objetos em um sistema"); //Verdadeira
        alternativasPergunta10.add("Uma representação gráfica de uma estrutura condicional"); 
        perguntas.add(new Perguntas("O que é um diagrama de sequência na modelagem de software?", alternativasPergunta10, 1));

        ArrayList<String> alternativasPergunta11 = new ArrayList<>();
        alternativasPergunta11.add("Realizar uma operação de adição");
        alternativasPergunta11.add("Realizar uma operação lógica de OU"); 
        alternativasPergunta11.add("Realizar uma operação lógica de E"); //Verdadeira
        perguntas.add(new Perguntas("Qual é a função do operador && em programação?", alternativasPergunta11, 2));

        ArrayList<String> alternativasPergunta12 = new ArrayList<>();
        alternativasPergunta12.add("Um trecho de código que não é executado");
        alternativasPergunta12.add("Uma função que exibe uma mensagem na tela"); 
        alternativasPergunta12.add("Uma anotação no código que não afeta a execução e serve para documentação"); //Verdadeira
        perguntas.add(new Perguntas("O que é um comentário em programação?", alternativasPergunta12, 2));

        ArrayList<String> alternativasPergunta13 = new ArrayList<>();
        alternativasPergunta13.add("Um programa de computador.");
        alternativasPergunta13.add("Uma linguagem de programação."); 
        alternativasPergunta13.add("Uma sequência de passos para resolver um problema."); //Verdadeira
        perguntas.add(new Perguntas("O que é um algoritmo?", alternativasPergunta13, 2));

        ArrayList<String> alternativasPergunta14 = new ArrayList<>();
        alternativasPergunta14.add("Reservar espaço na memória para armazenar valores."); //Verdadeira
        alternativasPergunta14.add("Definir as instruções do programa."); 
        alternativasPergunta14.add("Especificar as operações aritméticas a serem executadas.");
        perguntas.add(new Perguntas("Qual é a função da declaração de variáveis em um programa?", alternativasPergunta14, 0));

        ArrayList<String> alternativasPergunta15 = new ArrayList<>();
        alternativasPergunta15.add("Uma função que realiza uma tarefa específica."); 
        alternativasPergunta15.add("Uma variável que armazena dados associados a um objeto."); //Verdadeira
        alternativasPergunta15.add("Um valor constante que não pode ser alterado.");
        perguntas.add(new Perguntas("O que é um atributo em programação orientada a objetos?", alternativasPergunta15, 1));
      
    }

    //Método Exibir Menu Inicial
    private static void exibirMenuInicial() {
        Scanner scanner = new Scanner(System.in); //Entrada usuário
        int opcao; //Variavel para opção escolhida

        //Executado até que a opção seja igual a 4 (Sair)
        do {
          
            
            System.out.println("\n------------------");
            System.out.println("-- COMBAT QUIZ --");
            System.out.println("------------------");
            
            System.out.println("\nMENU INICIAL");
            System.out.println("1. Inicializar o jogo");
            System.out.println("2. Informações dos desenvolvedores");
            System.out.println("3. Explicação do jogo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) { // Executar diferentes ações com base na opção escolhida 
                case 1:
                    menuEscolhaPersonagem();
                    break;
                case 2:
                    exibirInformacoesDesenvolvedores();
                    break;
                case 3:
                    exibirExplicacaoJogo();
                    break;
                case 4:
                    System.out.println("Obrigado por jogar! Até mais."); // Exibição 
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente."); // Exibição 
            }
        } while (opcao != 4);
    }

    // Método Exibir Menu Personagem 
    private static void menuEscolhaPersonagem() {
        Scanner scanner = new Scanner(System.in); //Entrada usuário
        int opcao; //Variavel para opção escolhida

        
        System.out.println("\nMENU ESCOLHA DE PERSONAGEM"); //Exibição e organização menu 
        System.out.println("Escolha um personagem:");
        
  
        ArrayList<Personagem> personagensDisponiveis = new ArrayList<>(personagens); // Cria uma cópia da lista original

        //Para cada personagem na lista, o seu índice (i) é incrementado em 1 e é exibido o número do personagem e o seu nome.
        for (int i = 0; i < personagensDisponiveis.size(); i++) { 
        Personagem personagem = personagensDisponiveis.get(i);
        System.out.println((i + 1) + ". " + personagem.getNome()); //Exibição 
        }

        do {
        System.out.print("\nJogador 1, escolha um personagem (digite o número correspondente): "); //Exibição 
        
        opcao = scanner.nextInt(); //Armazenar Escolha 
          
        } while (opcao < 1 || opcao > personagensDisponiveis.size());

        jogador1 = personagensDisponiveis.remove(opcao - 1); //Remove o personagem escolhido da lista de personagens disponíveis
        opcao--;

        System.out.println("\nPersonagem escolhido para o Jogador 1: " + jogador1.getNome()); //Exibir escolha Jogador 1 

        System.out.println("\nPersonagens disponíveis para o Jogador 2:"); //Nova lista
        for (int i = 0; i < personagensDisponiveis.size(); i++) { 
        Personagem personagem = personagensDisponiveis.get(i);
        System.out.println((i + 1) + ". " + personagem.getNome()); //Exibição
    }

        do {
        System.out.print("Jogador 2, escolha um personagem (digite o número correspondente): ");
        System.out.println("");
        opcao = scanner.nextInt();
        } while (opcao < 1 || opcao > personagensDisponiveis.size());

        jogador2 = personagensDisponiveis.remove(opcao - 1); // Remove o personagem escolhido da lista de personagens disponíveis

        System.out.println("Personagens escolhidos: " + jogador1.getNome() + " e " + jogador2.getNome());
    iniciarPartida(); //Exibe personagens escolhidos 
}

    // Método Iniciar Partida  
    private static void iniciarPartida() {
        Scanner scanner = new Scanner(System.in); //Entrada usuário
        int rodada = 1; //Inicializado em 1, primeira rodada 

        while (jogador1.getHP() > 0 && jogador2.getHP() > 0) { //Condição para inicio e continuidade do jogo, HP > 0 
            
            System.out.println("\n----- RODADA " + rodada + " -----"); //Exibir rodada 
            System.out.println(jogador1.getNome() + " - Vida: " + jogador1.getHP() + "%"); //Status e nome personagem Jogador1 
            System.out.println(jogador2.getNome() + " - Vida: " + jogador2.getHP() + "%"); //Status e nome personagem Jogador2

            Perguntas pergunta = perguntas.get(rodada - 1);

            System.out.println("\nPERGUNTA:"); // Exibe Enunciado perguntas
            System.out.println(pergunta.getEnunciado());


            //Acessa a pergunta correspondente à rodada atual da lista de perguntas e a armazena na variável pergunta.
            ArrayList<Alternativas> alternativasPergunta = pergunta.getAlternativas();
            for (int i = 0; i < alternativasPergunta.size(); i++) {
                System.out.println((char) ('A' + i) + ". " + alternativasPergunta.get(i)); // converte o valor numérico da opção para o caractere correspondente
            }

            //Solicita ao jogador 1 para escolher uma alternativa e armazena a resposta na variável respostaJogador1.
            System.out.print("\n" + jogador1.getNome() + ", escolha a alternativa (A | B | C): ");
            char respostaJogador1 = scanner.next().toUpperCase().charAt(0);
          
            //Solicita ao jogador 2 para escolher uma alternativa e armazena a resposta na variável respostaJogador2.
            System.out.print(jogador2.getNome() + ", escolha a alternativa (A | B | C): ");
            char respostaJogador2 = scanner.next().toUpperCase().charAt(0);

            //Solicita uma confirmação dos jogadores para suas respostas,'s' para confirmar ou 'n' para voltar a escolher.
            System.out.print("\nTem certeza das respostas? (s/n): ");
            char confirmacao = scanner.next().toLowerCase().charAt(0);

            //Casos Respostas 
            if (confirmacao == 's') {
                int opcaoCorreta = pergunta.getOpcaoCorreta();

                
                //Casos Respostas
                if (respostaJogador1 - 'A' == opcaoCorreta && respostaJogador2 - 'A' == opcaoCorreta) { //Acerto de Ambos 
                    System.out.println("\nAmbos acertaram! Próxima pergunta.\n"); //Mensagem
                  
                } else if (respostaJogador1 - 'A' == opcaoCorreta) { //Acerto Jogador 1
                    System.out.println("\n" + jogador1.getNome() + " acertou! " + jogador2.getNome() + " errou."); //Mensagem 
                    jogador2.setHP(jogador2.getHP() - 10);//Subtração HP Jogador2
                  
                    if (jogador2.getHP() < 0) {
                        jogador2.setHP(0);
                    }
                  
                } else if (respostaJogador2 - 'A' == opcaoCorreta) { //Acerto Jogador 2 
                    System.out.println("\n" + jogador2.getNome() + " acertou! " + jogador1.getNome() + " errou."); //Mensagem
                    jogador1.setHP(jogador1.getHP() - 10);//Subtração HP Jogador1
                  
                    if (jogador1.getHP() < 0) {
                        jogador1.setHP(0);
                    }
                  
                } else {

                    //Erro de ambos, converte o valor numérico da opção correta para o caractere correspondente
                    System.out.println("\nAmbos erraram! Resposta correta: " + (char)('A' + opcaoCorreta));
                    jogador1.setHP(jogador1.getHP() - 10); //Subtração HP Jogador1 
                    jogador2.setHP(jogador2.getHP() - 10); //Subtração HP Jogador2

                    //Atualizar HP Jogadores
                    if (jogador1.getHP() < 0) { 
                        jogador1.setHP(0);
                    }
                    if (jogador2.getHP() < 0) {
                        jogador2.setHP(0);
                    }
                }

                //Se algum jogador atingiu 0 HP, é exibida a mensagem "FIM DO JOGO" e o resultado da partida juntamente com as pontuações.
                if (jogador1.getHP() == 0 || jogador2.getHP() == 0) {
                    System.out.println("\n----- FIM DO JOGO -----");
                  
                    if (jogador1.getHP() == jogador2.getHP()) {
                        System.out.println("O jogo empatou!");
                      
                    } else if (jogador1.getHP() > jogador2.getHP()) {
                        System.out.println("Vencedor: " + jogador1.getNome()); //Vitoria Jogador1
                      
                    } else {
                        System.out.println("Vencedor: " + jogador2.getNome()); //Vitoria Jogador2
                    }
                  
                    System.out.println(jogador1.getNome() + " - Pontuação: " + jogador1.getHP()); //Pontuação Jogador1
                    System.out.println(jogador2.getNome() + " - Pontuação: " + jogador2.getHP()); //Pontuação Jogador2
                    break;
                }

                rodada++; //Incremento da variável rodada para avançar para a próxima rodada.

              //O loop continua até que algum jogador atinja 0 HP e a partida seja encerrada.
              
            }
        }
    }

    //Metodo Exibir Informações 
    private static void exibirInformacoesDesenvolvedores() {
        
        System.out.println("\nINFORMAÇÕES DOS DESENVOLVEDORES");
        System.out.println("Desenvolvido por:");
        System.out.println("Henrique Zerlottini");
        System.out.println("Davi Samuel");
        System.out.println("Pedro Henrique");
    }

    //Metodo Exibir Explicação 
    private static void exibirExplicacaoJogo() {
        
        System.out.println("\nEXPLICAÇÃO DO JOGO");
        System.out.println("\n- O jogo consiste em um duelo de perguntas e respostas entre dois jogadores.");
        System.out.println("- Cada jogador escolhe um personagem e, a cada rodada, ambos respondem a uma pergunta.");
        System.out.println("- Se ambos acertarem, ninguém perde vida. Se apenas um acertar, o outro perde 10% de vida.");
        System.out.println("- Se ambos errarem, ambos perdem 10% de vida.");
        System.out.println("- O jogo continua até que um dos jogadores fique com 0% de vida.");
    }
}

//Se ambos os jogadores acertarem, é exibida uma mensagem informando que ambos acertaram.
//Se apenas o jogador 1 acertar, é exibida uma mensagem informando que o jogador 1 acertou e o jogador 2 errou, e o HP do jogador 2 é reduzido em 10.
//Se apenas o jogador 2 acertar, é exibida uma mensagem informando que o jogador 2 acertou e o jogador 1 errou, e o HP do jogador 1 é reduzido em 10.
//Se ambos os jogadores errarem, é exibida uma mensagem informando que ambos erraram, e o HP de ambos os jogadores é reduzido em 10.

