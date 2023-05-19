package com.atividade;

public class ListaEncadeada {
    public No head;
    public No atual;
    public No anterior;


    public void addFirst(Integer value) {
        No newValue = new No(value);

        if (isEmpty()) {
            this.head = newValue;
        } else {
            newValue.next = this.head;
            this.head = newValue;
        }
    }

    public void addLast(Integer value) {
        boolean encontraPosicao = false;
        No newValue = new No(value);

        if (isEmpty()) {
            this.head = newValue;
            this.atual = newValue;
        } else {
            do {
                if (this.atual.next == null) {
                    this.atual.next = newValue;
                    this.atual = newValue;
                    encontraPosicao = true;
                }
                else {
                    this.atual = this.atual.next;
                }
            } while (!encontraPosicao);
        }
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void delete(Integer value) {
        boolean encontraPosicao = false;
        this.atual = head;

        do{
            if (this.atual.value.equals(value)) { //se achou o valor
                this.anterior.next = this.atual.next;
                this.atual = this.anterior;
                encontraPosicao = true;
            }else { //se nao achou o valor percorre a lista
                this.anterior = this.atual;
                this.atual = this.atual.next;
            }
        }while(!encontraPosicao);
    }
}
