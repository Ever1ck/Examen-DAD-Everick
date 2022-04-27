package edu.pe.solucion1;

public class Tienda {
	private int numProductos;
    public Tienda(int nProductos){
            this.numProductos=nProductos;
    }
    public boolean cogerProducto(){
            if (this.numProductos>0){
                    this.numProductos--;
                    return true;
            }
            return false;
    }
}
