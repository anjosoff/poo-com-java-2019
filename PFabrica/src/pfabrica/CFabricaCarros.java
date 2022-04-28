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
public class CFabricaCarros extends CFabrica {
    
    private String marca;
    
    public void resumoProd(int p1){
    JOptionPane.showMessageDialog(null, "RESUMO DE PRODUÇÃO\n CARRO DA MARCA "+this.marca+"\nTempo de produção:\nCusto de produção:");
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
