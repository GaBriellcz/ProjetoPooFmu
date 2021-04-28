package aps_poo;

import java.time.Year;

public class CadastroCliente extends CadastroAcademia {
    protected float altura;
    protected float peso;
    protected float mensal;
    protected int AnoDuracao;
  
    
    public void DuraçãoDaMatricula(){
        int anoAtual = Year.now().getValue();
        int resultado = anoAtual + AnoDuracao;
        System.out.println("\n O Cliente vai Treinar até " + resultado + "\n");
    }
    
    CadastroCliente(){
    mensal = 70f;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getMensal() {
        return mensal;
    }

    public void setMensal(float mensal) {
        this.mensal = mensal;
    }

    public int getAnoDuração() {
        return AnoDuracao;
    }

    public void setAnoDuração(int AnoDuração) {
        this.AnoDuracao = AnoDuração;
    }


    @Override
    public String toString() {
        return   " Altura = " + altura + "\n Peso = " + peso + " Kilos" + "\n Mensal = " + mensal +  " Reais" + "\n Duração = " + AnoDuracao + " Anos" ;
    }

  
    
    
}
