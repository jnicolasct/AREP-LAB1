package edu.escuelaing.arep.AREPLAB1;

public class Calculos {
    LinkedList lista;
    double mean;

    public Calculos(LinkedList lista) {
        this.lista = lista;
    }

    public double mean(){
        lista.reiniciar();
        double contador = 0.0;
        for (int i=0; i<lista.getTamano(); i++){
            contador = contador + lista.nextNode().getValor();
        }
        double tamano2 = (double) lista.getTamano();
        double respuesta = contador/tamano2;
        this.mean = respuesta;

        return respuesta;
    }

    public double deviation(){
        lista.reiniciar();
        double contador = 0.0;
        for (int i=0; i<lista.getTamano(); i++){
            double vNodo= lista.nextNode().getValor();
            double resta = vNodo-this.mean;
            double aSumar = resta * resta;
            contador = contador + aSumar;
        }
        double tamano2 = (double) lista.getTamano()-1;
        double resp = contador/tamano2;
        double respuesta = Math.sqrt(resp);
        return respuesta;
    }


}


