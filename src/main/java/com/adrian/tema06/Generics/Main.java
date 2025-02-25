package com.adrian.tema06.Generics;

public class Main {
    public static void main(String[] args) {

        Pila<Integer> pila = new Pila<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Pila original: " + pila.peek(3));
        pila.reverse();
        System.out.println("Pila invertida: " + pila.peek(3));
        System.out.println("Search 20: " + pila.search(20));
        pila.clear();
        System.out.println("Pila vacía: " + pila.isEmpty());


        Cola<String> cola = new Cola<>();
        cola.enqueue("A");
        cola.enqueue("B");
        cola.enqueue("C");
        System.out.println("Cola original: " + cola.search("B"));
        cola.reverse();
        System.out.println("Último elemento: " + cola.peekLast());
        cola.clear();
        System.out.println("Cola vacía: " + cola.isEmpty());


        DynamicArray<Double> array = new DynamicArray<>();
        array.add(1.1);
        array.add(2.2);
        array.add(3.3);
        System.out.println("Array original: " + array);
        array.swap(0, 2);
        System.out.println("Array tras swap: " + array);
        System.out.println("Índice de 2.2: " + array.indexOf(2.2));
        array.clear();
        System.out.println("Array vaciado: " + array);
    }
}
