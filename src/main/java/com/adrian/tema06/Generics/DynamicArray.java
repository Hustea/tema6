package com.adrian.tema06.Generics;

import java.util.ArrayList;

public class DynamicArray<T> {
    private ArrayList<T> elementos;

    public DynamicArray() {
        this.elementos = new ArrayList<>();
    }

    public void add(T elemento) {
        elementos.add(elemento);
    }

    public void clear() {
        elementos.clear();
    }

    public DynamicArray<T> clone() {
        DynamicArray<T> copia = new DynamicArray<>();
        copia.elementos.addAll(this.elementos);
        return copia;
    }

    public int indexOf(T element) {
        return elementos.indexOf(element);
    }

    public void trimToSize() {
        elementos.trimToSize();
    }

    public boolean swap(int index1, int index2) {
        if (index1 >= 0 && index1 < elementos.size() && index2 >= 0 && index2 < elementos.size()) {
            T temp = elementos.get(index1);
            elementos.set(index1, elementos.get(index2));
            elementos.set(index2, temp);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}
