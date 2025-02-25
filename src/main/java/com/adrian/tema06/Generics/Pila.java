package com.adrian.tema06.Generics;


import java.util.LinkedList;

public class Pila<T> {
    private LinkedList<T> elementos = new LinkedList<>();

    public void push(T elemento) {
        elementos.addFirst(elemento);
    }

    public T pop() {
        return elementos.isEmpty() ? null : elementos.removeFirst();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public void clear() {
        elementos.clear();
    }

    public Pila<T> clone() {
        Pila<T> copia = new Pila<>();
        copia.elementos.addAll(this.elementos);
        return copia;
    }

    public LinkedList<T> peek(int n) {
        return new LinkedList<>(elementos.subList(0, Math.min(n, elementos.size())));
    }

    public int search(T element) {
        int index = elementos.indexOf(element);
        return (index == -1) ? -1 : index + 1;
    }

    public void reverse() {
        LinkedList<T> reversed = new LinkedList<>();
        for (T elem : elementos) {
            reversed.addFirst(elem);
        }
        elementos = reversed;
    }
}