package composicao.exercicio01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelDeTrabalhador nivelDeTrabalhador;
    private double salarioBase;
    private Departamento departamento;
    private List<ContratoHoras> contratos = new ArrayList<>();

    public Trabalhador(String nome, NivelDeTrabalhador nivelDeTrabalhador, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivelDeTrabalhador = nivelDeTrabalhador;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelDeTrabalhador getNivelDeTrabalhador() {
        return nivelDeTrabalhador;
    }

    public void setNivelDeTrabalhador(NivelDeTrabalhador nivelDeTrabalhador) {
        this.nivelDeTrabalhador = nivelDeTrabalhador;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHoras> getContratos() {
        return contratos;
    }


    public void adicionarContrato(ContratoHoras contrato){
        contratos.add(contrato);
    }

    public void removerContrato(ContratoHoras contrato){
        contratos.remove(contrato);
    }

    public double renda(int ano , int mes ){
        double soma =  salarioBase;
        Calendar calendar = Calendar.getInstance();
        for (ContratoHoras c : contratos){

            calendar.setTime(c.getData());
            int c_ano = calendar.get(Calendar.YEAR);
            int c_mes = 1 + calendar.get(Calendar.MONTH);
            if(c_ano == ano || c_mes == mes){
                soma += c.valorTotal();
            }
        }
        return soma;
    }

}
