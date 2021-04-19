package aps_poo;

public class CadastroFuncionario extends CadastroAcademia {
    double carteiraTrabalho;
    double salario;
   float horario;
    String área;
  
            
    public void Cadastro() {
        //System.out.println("---------------------------------");
        System.out.println("Número da Carteira de Trabalho: " + this.carteiraTrabalho);
        System.out.println("Horário de Trabalho: "+ this.horario);
        System.out.println("Área que esta trabalhando:"+ this.área);
        salario = 1000;
        System.out.println("Salario atual: "+ this.salario);
        //System.out.println("---------------------------------");
        
    }
}
