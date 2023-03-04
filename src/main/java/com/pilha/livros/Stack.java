package com.pilha.livros;

public class Stack<T> {
    private Book<T> bookTop=null;

    public Stack() { this.bookTop=null; }


    //adiciona novo livro ao topo da pilha
    public void push(T titleNewBook) {
        Book newBook = new Book(titleNewBook);
        newBook.setNextBook(bookTop);
        bookTop = newBook;
    }


    //retira o livro que esta no topo da pilha
    public Book pop() {
        if (!this.isEmpty()) {
            Book bookPoped = bookTop;
            bookTop = bookTop.getNextBook();
            return bookPoped;
        }
        return null;
    }


    //retorna o livro que esta no topo sem modifica lo
    public Book top() { return bookTop; }


    //verifica se a pilha está vazia
    public boolean isEmpty() { return bookTop == null ? true : false; }


    @Override
    public String toString() {
        String stringReturn = "------------\n";
        stringReturn += "   pilha\n";
        stringReturn += "------------\n";

        //percorrer toda a pilha e mostra as informações de cada livro
        Book assistantBook = bookTop;
        int i = 1;
        while (true) {
            if (assistantBook != null) {
                stringReturn += "["+(i++)+"° Livro {titulo= "+assistantBook.getTitle()+"}]\n";
                assistantBook = assistantBook.getNextBook();
            } else {
                break;
            }
        }
        stringReturn += "------------\n";
        return stringReturn;
    }
}
