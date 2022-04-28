/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfabrica;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CFabricaNavios extends CFabrica {

    private String classe;

     public void resumoProd(int p1) {
        
        JOptionPane.showMessageDialog(null, "RESUMO DE PRODUÇÃO\nNAVIO DA CLASSE "+this.classe+"\nTempo de produção:\nCusto de produção:");
    }

    /**
     * @return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }

}
