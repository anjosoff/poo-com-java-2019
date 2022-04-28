package pfabrica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class CFabrica {

    private int numEmpregados;
    private int numEquipamentos;
    private double tempoProd1;

    public void tempoProd(int p1) {
        float result;
        result=(float) (p1/(tempoProd1*Math.sqrt(numEquipamentos*numEmpregados)));

    }

    public void custoProd(int p1) {
        float result,raiz;
        raiz=(float) Math.sqrt(numEmpregados);
        result=p1*raiz*2;
        
    }
    public void resumoProd(int p1) {

    }

    /**
     * @return the numEmpregados
     */
    public int getNumEmpregados() {
        return numEmpregados;
    }

    /**
     * @param numEmpregados the numEmpregados to set
     */
    public void setNumEmpregados(int numEmpregados) {
        this.numEmpregados = numEmpregados;
    }

    /**
     * @return the numEquipamentos
     */
    public int getNumEquipamentos() {
        return numEquipamentos;
    }

    /**
     * @param numEquipamentos the numEquipamentos to set
     */
    public void setNumEquipamentos(int numEquipamentos) {
        this.numEquipamentos = numEquipamentos;
    }

    /**
     * @return the tempoProd1
     */
    public double getTempoProd1() {
        return tempoProd1;
    }

    /**
     * @param tempoProd1 the tempoProd1 to set
     */
    public void setTempoProd1(double tempoProd1) {
        this.tempoProd1 = tempoProd1;
    }

}
