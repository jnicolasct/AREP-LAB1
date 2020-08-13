package edu.escuelaing.arep.AREPLAB1;

public class LinkedList {
    private Node cabeza;
    private Node cola;
    private int tamano;
    private Node nextNode;
    private Node priorNode;

    public LinkedList() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;

    }

    public void addNode(double value){
        Node nuevo = new Node(value, null, null);
        if (tamano == 0){
            cabeza = nuevo;
            cola = nuevo;
            this.nextNode = cabeza;
            this.priorNode = null;
        }
        else{
            cola.setNextNode(nuevo);
            nuevo.setPriorNode(cola);
            cola = nuevo;
        }
        tamano = tamano + 1;
    }

    public void removeNode(){
        if (tamano == 1){
            cabeza = null;
            cola = null;
        }
        else if(tamano > 1){
            Node nuevo = cola.getPriorNode();
            nuevo.setNextNode(null);
            cola = nuevo;
        }
        tamano = tamano - 1;
    }

    public Node nextNode(){
        if (nextNode != null){
            priorNode = nextNode;
            nextNode = nextNode.getNextNode();
            return priorNode;
        }
        else{

        }
        return null;
    }

    public Node priorNode(){
        if (priorNode != null){
            Node retorno = priorNode;
            nextNode = priorNode.getNextNode();
            priorNode = priorNode.getPriorNode();
            return retorno;
        }
        return null;
    }


    public Node getCabeza() {
        return cabeza;
    }

    public void setCabeza(Node cabeza) {
        this.cabeza = cabeza;
    }

    public Node getCola() {
        return cola;
    }

    public void setCola(Node cola) {
        this.cola = cola;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void reiniciar(){
        nextNode = cabeza;
        priorNode = null;
    }

}

