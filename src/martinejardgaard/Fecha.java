/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinejardgaard;

/**
 *
 * @author Horacio
 */
public class Fecha {
    int dia;
    int mes;
    int horamilitar;
    int anno;

    public Fecha(int dia, int horamilitar) {
        this.dia = dia;
        this.horamilitar = horamilitar;
    }

    public Fecha() {
    }

    public Fecha(int dia, int mes, int horamilitar, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.horamilitar = horamilitar;
        this.anno = anno;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    

    public Fecha(int dia, int horamilitar, int anno) {
        this.dia = dia;
        this.horamilitar = horamilitar;
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHoramilitar() {
        return horamilitar;
    }

    public void setHoramilitar(int horamilitar) {
        this.horamilitar = horamilitar;
    }
    
    
    
}
