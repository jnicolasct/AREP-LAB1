package edu.escuelaing.arep.AREPLAB1;

public class Node {
    private double valor;
    private Node nextNode;
    private Node priorNode;


    public Node(double valor, Node nextNode, Node priorNode) {
        this.valor = valor;
        this.nextNode = nextNode;
        this.priorNode = priorNode;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPriorNode() {
        return priorNode;
    }

    public void setPriorNode(Node priorNode) {
        this.priorNode = priorNode;
    }
}
