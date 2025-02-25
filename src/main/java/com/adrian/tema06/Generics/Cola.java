package com.adrian.tema06.Generics;

import java.util.LinkedList;

public class Cola<T> {
    private LinkedList<T> elementos = new LinkedList<>();

    public void enqueue(T elemento) {
        elementos.addLast(elemento);
    }

    public T dequeue() {
        return elementos.isEmpty() ? null : elementos.removeFirst();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public void clear() {
        elementos.clear();
    }

    public Cola<T> clone() {
        Cola<T> copia = new Cola<>();
        copia.elementos.addAll(this.elementos);
        return copia;
    }

    public T peekLast() {
        return elementos.isEmpty() ? null : elementos.getLast();
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
