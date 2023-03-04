package com.pilha.livros;

public class Book<T> {
    private T title; //titulo do livro
    private Book<T> nextBook; //livro usado como referencia para os metodos

    public Book() { }

    public Book(T title) {
        this.nextBook = null;
        this.title = title;
    }

    public T getTitle() {
        return title;
    }

    public void setTitle(T title) {
        this.title = title;
    }

    public Book<T> getNextBook() {
        return nextBook;
    }

    public void setNextBook(Book nextBook) {
        this.nextBook = nextBook;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Titulo=" + title +
                '}';
    }
}
