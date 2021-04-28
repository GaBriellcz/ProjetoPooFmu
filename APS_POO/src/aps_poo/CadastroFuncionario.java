package aps_poo;

public class CadastroFuncionario extends CadastroAcademia {
    protected double carteiraTrabalho;
    protected float salario;
    protected float horario;
    protected String área;
  
    
    
    CadastroFuncionario(){
    salario = 1000.00f;
    }

    public double getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(double carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getHorario() {
        return horario;
    }

    public void setHorario(float horario) {
        this.horario = horario;
    }

    public String getÁrea() {
        return área;
    }

    public void setÁrea(String área) {
        this.área = área;
    }

    @Override
    public String toString() {
        return  " Carteira de Trabalho = " + carteiraTrabalho + "\n Salario = " + salario + "\n Horario = " + horario + "\n Área = " + área ;
    }
    
    
    
}
