/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

/**
 *
 * @author USUARIO
 */
public class Punto_pendiente {
    private Double pendiente;
    private Double n1;
    private Double n2;

    public Punto_pendiente(Double pendiente, Double n1, Double n2){
    this.pendiente=pendiente;
    this.n1=n1;
    this.n2=n2;

  }

   
     public Double Punto_pendiente(Punto_pendiente p) {
       return (getN1()+ getPendiente()+(getN2()));
    }

    public Double getPendiente() {
        return pendiente;
    }

    public void setPendiente(Double pendiente) {
        this.pendiente = pendiente;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }
     
}
