import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("OIEEEEEE MUNDO !!!!!");
        System.out.println("Segundo teste");
        System.out.println("Terceito teste");
        System.out.println("Quarto teste");


        /*
        System.out.println("Criando pilha!");
        PilhaEstatica pilha = new PilhaEstatica(100);
        System.out.println("Pilha vazia: " + pilha.isEmpty());

        System.out.println("Inserindo 10 números na pilha!");
        for(int i = 0; i < 10; i++ ){
            System.out.println(pilha.push(1+i));
        }
        System.out.println("Pilha: " + pilha);
        System.out.println("Plha vazia: " + pilha.isEmpty());
        System.out.println("Topo: " + pilha.peek());
        System.out.println("Removendo o topo: ");
        if(!pilha.isEmpty()){
            System.out.println("Removido: " + pilha.pop());
        }
        System.out.println("Novo topo: " + pilha.peek());
        System.out.println("Digite três número para serem inseridos");
        pilha.push(entrada.nextDouble());
        pilha.push(entrada.nextDouble());
        pilha.push(entrada.nextDouble());
        System.out.println("Novo topo: " + pilha.peek());
        System.out.println("Pilha atual: " + pilha);

         */

        /*
        System.out.println("Criando pilha!");
        PilhaEstatica pilha = new PilhaEstatica(20);
        System.out.println("Pilha vazia: " + pilha.isEmpty());

        System.out.println("Inserindo 10 números na pilha!");
        for(int i = 0; i < 22; i++ ){
            System.out.println(pilha.push(1+i));
        }
        System.out.println(pilha);
         */

        /*
        try {
            int opcao;
            System.out.println("PILHA DE STRING");
            System.out.println("Insira qual é a capacidade da sua pilha: ");
            int capacidade = entrada.nextInt();
            PilhaString pilhaString = new PilhaString(capacidade);

            do {
                System.out.println("---------------MENU---------------");
                System.out.println("[1] Inserir \n[2] Retirar \n[3] Retornar \n[4] Verificar se está vazia \n[5] Mostrar a pilha \n[6] Parar");
                opcao = entrada.nextInt();
                entrada.nextLine();
                while (opcao < 1 || opcao > 6) {
                    System.out.println("Opção Invalida! Insira novamente a opção: ");
                    opcao = entrada.nextInt();
                }
                if (opcao == 1) {
                    System.out.println("O que você deseja inserir: ");
                    String palavra = entrada.nextLine();
                    boolean verificar = pilhaString.push(palavra);
                    if (verificar) {
                        System.out.println("Inserido!");
                    } else {
                        System.out.println("Não foi possível inserir!");
                    }
                } else {
                    if (opcao == 2) {
                        System.out.println("Excluindo topo.....");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Topo excluído: " + pilhaString.pop());
                    } else {
                        if (opcao == 3) {
                            if (!pilhaString.isEmpty()) {
                                System.out.println("Valor do topo: " + pilhaString.peek());
                            }
                        } else {
                            if (opcao == 4) {
                                if (pilhaString.isEmpty()) {
                                    System.out.println("Pilha vazia!");
                                } else {
                                    System.out.println("Pilha não está vazia");
                                }
                            } else {
                                System.out.println(pilhaString);
                            }
                        }
                    }
                }
            } while (opcao != 6);
        }catch(Exception e){
            System.out.println("Deu erro!" + e.getMessage());
        }

         */
        try {
            int opcao;
            int cod = 0;
            System.out.println("PILHA DE STRING");
            System.out.println("Insira qual é a capacidade da sua pilha: ");
            int capacidade = entrada.nextInt();
            while(capacidade < 0){
                System.out.println("O valor da pilha precisa ser positiva. Insira novamente o valor: ");
                capacidade = entrada.nextInt();
            }
            //PilhaProduto pilhaProduto = new PilhaProduto(capacidade);


            do {
                System.out.println("---------------MENU---------------");
                System.out.println("[1] Inserir \n[2] Retirar \n[3] Retornar \n[4] Verificar se está vazia \n[5] Mostrar a pilha \n[6] Parar");
                opcao = entrada.nextInt();
                entrada.nextLine();
                while (opcao < 1 || opcao > 6) {
                    System.out.println("Opção Invalida! Insira novamente a opção: ");
                    opcao = entrada.nextInt();
                }
                if (opcao == 1) {
                    cod++;
                    System.out.println("Insira o nome: ");
                    String nome = entrada.nextLine();
                    System.out.println("Insira o preço: R$");
                    double preco = entrada.nextDouble();
                    boolean verificar = true;
                    if (verificar) {
                        System.out.println("Inserido!");
                    } else {
                        System.out.println("Não foi possível inserir!");
                    }
                } else {
                    if (opcao == 2) {
                        if (false) {
                            System.out.println("Excluindo topo.....");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println("Topo excluído: ");
                        }else{
                            System.out.println("Não é possível remover item com a pilha vazia ;)");
                        }
                    } else {
                        if (opcao == 3) {
                            if (true) {
                                System.out.println("Valor do topo: ");
                            }
                        } else {
                            if (opcao == 4) {
                                if (true) {
                                    System.out.println("Pilha vazia!");
                                } else {
                                    System.out.println("Pilha não está vazia");
                                }
                            } else {
                                System.out.println("aaaaaaaaa");
                            }
                        }
                    }
                }
            } while (opcao != 6);
        }catch(Exception e){
            System.out.println("Deu erro!" + e.getMessage());

        }


    }
}