package com.pilha.livros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<String> pilhaLivros = new Stack<>();


        String tituloLivro;
        String saida = "nao";
        int menu;

        do {
            if (pilhaLivros.isEmpty()) {
                System.out.println("A pilha está vazia. Adicione um novo livro");
                System.out.println("Titulo do livro que será adicionado: ");
                tituloLivro = entrada.nextLine();
                pilhaLivros.push(tituloLivro);
                System.out.println("Livro \"" + tituloLivro + "\" adicionado");
            }

            System.out.print("Escolha uma opção: \n[1] adicionar novo livro\n[2] remover livro\n[3] mostrar livro no topo\n[4] mostrar pilha de livros\n[5] sair\n- ");

            try {
                Scanner op = new Scanner(System.in);
                menu = op.nextInt();

            } catch (InputMismatchException e) {
                //e.printStackTrace();
                System.out.println("Erro! Entrada inválida, certifique-se de digitar uma opção válida.");
                menu=6;
            }

            switch (menu) {
                case 1 -> {
                    System.out.println("Titulo do livro que será adicionado: ");
                    tituloLivro = entrada.nextLine();
                    pilhaLivros.push(tituloLivro);
                    System.out.println("Livro '" + tituloLivro + "' adicionado");
                }
                case 2 -> System.out.println("Livro '" + pilhaLivros.pop().getTitle() + "' removido");
                case 3 -> System.out.println("Livro '" + pilhaLivros.top().getTitle() + "'");
                case 4 -> System.out.println(pilhaLivros);
                case 5 -> {
                    System.out.println("Tem certeza que deseja sair? ");
                    saida = entrada.next();
                }

            }


        } while (saida.equalsIgnoreCase("nao"));

    }

}
