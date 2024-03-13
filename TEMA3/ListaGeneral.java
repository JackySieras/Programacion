package Tema3;

import java.util.Scanner;

public class ListaGeneral {
int opc;

    private Nodo raiz;

    Scanner sc = new Scanner(System.in);

    public ListaGeneral() {
        raiz = null;

    }

    public int numeroElementos() {
        int cantidad = 0;
        Nodo recorrido = raiz;
        while (recorrido != null) {
            recorrido = recorrido.siguiente;
            cantidad++;

        }
        return cantidad;
    }

    public int cantidad() {
        int cant = 0;
        Nodo reco = raiz;
        while (reco != null) {
            reco = reco.siguiente;
            cant++;
        }
        return cant;
    }

    public void insertarElemento(int posicion, int valor) {
        if (posicion <= numeroElementos() + 1) {
            Nodo nuevo = new Nodo();
            nuevo.dato = valor;
            if (posicion == 1) {
                nuevo.siguiente = raiz;
                raiz = nuevo;
            } else if (posicion == numeroElementos() + 1) {
                Nodo recorrido = raiz;
                while (recorrido.siguiente != null) {
                    recorrido = recorrido.siguiente;
                }
                recorrido.siguiente = nuevo;
                nuevo.siguiente = null;
            } else {
                Nodo recorrido = raiz;
                for (int i = 0; i < posicion - 2; i++) {
                    recorrido = recorrido.siguiente;
                }
                Nodo siguiente = recorrido.siguiente;
                recorrido.siguiente = nuevo;
                nuevo.siguiente = siguiente;
            }
        }

    }

    public void borrar(int posicion) {
        if (posicion <= cantidad()) {
            if (posicion == 1) {
                raiz = raiz.siguiente;
            } else {
                Nodo reco;
                reco = raiz;
                for (int f = 1; f <= posicion - 2; f++) {
                    reco = reco.siguiente;
                }
                Nodo prox = reco.siguiente;
                reco.siguiente = prox.siguiente;
            }
        }
    }

    public void borrarDato(int posicion) {
        if (posicion <= numeroElementos()) {
            if (posicion == 1) {
                raiz = raiz.siguiente;
            } else {
                Nodo recorrido = raiz;
                for (int i = 0; i < posicion - 2; i++) {
                    recorrido = recorrido.siguiente;

                }
                Nodo auxiliar = recorrido.siguiente;
                recorrido.siguiente = auxiliar.siguiente;
            }
        }
    }

    public boolean existe(int x) {
        Nodo reco = raiz;
        while (reco != null) {
            if (reco.dato == x) {
                return true;
            }
            reco = reco.siguiente;
        }
        return false;
    }

    public void imprimir() {
        Nodo recorrido = raiz;
        while (recorrido != null) {
            System.out.print(recorrido.dato + "  -  ");
            recorrido = recorrido.siguiente;

        }
    }

    public void Modificar(int posicion) {
        if (posicion <= numeroElementos()) {
            if (posicion == 1) {
                raiz.dato = sc.nextInt();
            }
            if (posicion == 2 && posicion != 3 && posicion != 1) {
                Nodo recorrido = raiz.siguiente;
                recorrido.dato = sc.nextInt();
            }

            if (posicion == 3 && posicion != 2 && posicion != 1) {
                Nodo recorrido = raiz.siguiente.siguiente;
                recorrido.dato = sc.nextInt();
            }
            if (posicion == 4 && posicion != 2 && posicion != 1 && posicion != 3 ) {
                Nodo recorrido = raiz.siguiente.siguiente.siguiente;
                recorrido.dato = sc.nextInt();
            }
        }

    }
        public boolean buscarValor(int valor) {
        Nodo recorrido = raiz;
        while (recorrido != null) {
            if (recorrido.dato == valor) {
                return true;
            }
            recorrido = recorrido.siguiente;
        }
        return false;
    }
}
