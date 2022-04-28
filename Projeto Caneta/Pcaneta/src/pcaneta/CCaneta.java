/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcaneta;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CCaneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;

    void rabiscar() {
        if (this.tampa) {
            JOptionPane.showMessageDialog(null, "A caneta está tampada, não é possivel rabiscar!");
        } else {
            JOptionPane.showMessageDialog(null, "Rabiscando...");
        }
    }

    void tampar() {
        this.tampa = true;
    }

    void destampar() {
        this.tampa = false;
    }

    void status() {
        String estadotampa;
        if (this.tampa) {
            estadotampa = "Tampada";

        } else {
            estadotampa = "Destampada";
        }
        JOptionPane.showMessageDialog(null, ">Status atualizado<\nModelo:"+this.modelo+"\nCor:"+this.cor+"\nPonta:"+this.ponta+"\nPorcentagem de carga:"+this.carga+"%\nSituação da tampa:"+estadotampa);
    }

}
