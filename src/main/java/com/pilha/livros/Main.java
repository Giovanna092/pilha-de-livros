package com.pilha.livros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        Stack<String> pilhaLivros = new Stack<>();


        String tituloLivro = "Titulo do livro";
        int opcoes=0;
        while (!(opcoes==5)) {
            if (pilhaLivros.isEmpty()) {
                System.out.println("A pilha está vazia. Adicione um novo livro");
                System.out.println("Titulo do livro que será adicionado: ");
                tituloLivro = entrada.nextLine();
                pilhaLivros.push(tituloLivro);
                System.out.println("Livro '"+ tituloLivro +"' adicionado");
            }

            System.out.println("Opcoes:\n[1] adicionar novo livro\n[2] remover livro\n[3] mostrar livro no topo\n[4] mostrar pilha de livros\n[5] sair");
            opcoes = op.nextInt();
            switch (opcoes){
                case 1:
                    System.out.println("Titulo do livro que será adicionado: ");
                    tituloLivro = entrada.nextLine();
                    pilhaLivros.push(tituloLivro);
                    System.out.println("Livro '"+ tituloLivro +"' adicionado");
                    break;
                case 2:
                    System.out.println("Livro '"+pilhaLivros.pop().getTitle()+"' removido");

                    break;
                case 3:
                    System.out.println("Livro '"+pilhaLivros.top().getTitle()+"'");
                    break;
                case 4:
                    System.out.println(pilhaLivros);
                    break;
                case 5:
                    System.out.println("Fim da execucão.");
                    break;
                default:
                    System.out.println("valor invalido. Tente novamente!");
                    break;
            }
        }
        entrada.close();
    }
}
