    package pilhaefila;

    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.Scanner;
    import java.util.Stack;

    public class PilhaEFila {

        //Instancia uma fila
        Queue<Integer> fila = new LinkedList<>();
        //Instancia uma pila
        Stack<Integer> pilha = new Stack<>();

        public PilhaEFila() {
            Pilha p = new Pilha();
            Fila f = new Fila();

            int menu = 0;
            while (menu != 3) {

                System.out.println("******* MENU PRINCIPAL *******");
                System.out.println(" 1 - PILHA");
                System.out.println(" 2 - FILA");
                System.out.println(" 3 - SAIR");
                System.out.println("******************************");

                System.out.print("Escolha o tipo de Estrutura de Dados:");
                menu = new Scanner(System.in).nextInt();

                if (menu == 1) {
                    p.play();
                }
                if (menu == 2) {
                    f.play();
                }
                if (menu == 3) {
                    break;
                }

                if ((menu < 1) || (menu > 3)) {
                    System.out.println("Opção Inválida!");
                }

            }

        }

        public static void main(String[] args) {
            new PilhaEFila().getClass();

        }

        class Pilha {

            int num = 0;

            // Método para Inserir elementos na Pilha
            public void Push() {

                System.out.print("Digite o elemento a ser inserido na Pilha: ");
                num = new Scanner(System.in).nextInt();
                pilha.push(num);

            }

            // Método para Retirar elementos da Pilha
            public void Pop() {
                pilha.pop();
                System.out.println("O último elemento foi removido da lista.");

            }

            // Método para Exibir o Último elemento da Pilha
            public void ExibirTopoPilha() {

                System.out.println(pilha.peek());
            }

            // Método para Remover todos elementos da Pilha
            public void ExibirPilha() {

                System.out.println(pilha);
            }

            // Método Gerenciador da Pilha
            public void play() {

                boolean Executar = true;

                System.out.println("\n======= MENU PILHA =======");
                System.out.println("1 - Inserir na Pilha");
                System.out.println("2 - Retirar da Pilha");
                System.out.println("3 - Exibir o ultimo elemento da Pilha: ");
                System.out.println("4 - Exibir a Pilha Inteira: ");
                System.out.println("5 - Sair");
                System.out.println("============================");

                while (Executar == true) {

                    int opcao = 0;

                    while ((opcao < 1) || (opcao > 5)) {

                        System.out.print("Digite opcao: ");
                        opcao = new Scanner(System.in).nextInt();

                    }

                    /* Chamando os métodos de acordo com
                     * a opção selecionada no Menu da Pilha*/
                    if (opcao == 1) {
                        Push();
                    }
                    if (opcao == 2) {
                        Pop();
                    }
                    if (opcao == 3) {
                        ExibirTopoPilha();
                    }
                    if (opcao == 4) {
                        ExibirPilha();
                    }
                    if (opcao == 5) {
                        Executar = false;
                    }

                    System.out.print("\n");

                }

            }

        }

        class Fila {

            int numero = 0;

            // Método para Inserir elementos na Fila
            public void InserirNaFila() {
                System.out.print("Digite o elemento a ser inserido na Fila: ");
                numero = new Scanner(System.in).nextInt();
                fila.add(numero);
            }

            // Método para Remover elementos da Fila
            public void RemoverDaFila() {
                fila.remove();
                System.out.println("O primeiro elemento foi removido da lista.");

            }

            // Método para Exibir o elemento do topo da fila
            public void ExibirTopoFila() {

                System.out.println(fila.peek());
            }

            // Método para Exibir todos os elementos da Fila
            public void ExibirFila() {

                System.out.println(fila);

            }

            // Método Gerenciador da Fila
            public void play() {

                boolean executar = true;

                System.out.println("\n======= MENU  FILA =======");
                System.out.println("1 - Inserir na Fila: ");
                System.out.println("2 - Remover da Fila: ");
                System.out.println("3 - Exibir o primeiro elemento da Fila: ");
                System.out.println("4 - Exibir a Fila Inteira: ");
                System.out.println("5 - Sair ");
                System.out.println("============================");

                while (executar == true) {

                    int opcao = 0;

                    while ((opcao < 1) || (opcao > 5)) {

                        System.out.print("Digite opcao: ");
                        opcao = new Scanner(System.in).nextInt();

                    }

                    /* Chamando os métodos de acordo com
                     * a opção selecionada no Menu da Fila*/
                    if (opcao == 1) {
                        InserirNaFila();
                    }
                    if (opcao == 2) {
                        RemoverDaFila();
                    }
                    if (opcao == 3) {
                        ExibirTopoFila();
                    }
                    if (opcao == 4) {
                        ExibirFila();
                    }
                    if (opcao == 5) {
                        executar = false;
                    }

                    System.out.print("\n");

                }

            }

        }
    }
