package herenca.exercicio01;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(1001 , "Andre" , 0.0);
        ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1005 , "Leticia" , 0.0 , 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1010 , "Henrique" , 0.0 , 0.01);

        // UPCASTING
        Conta contaUpcasting = contaEmpresarial;

        // DOWNCASTING
        ContaEmpresarial contaEmpresarialDowncasting = (ContaEmpresarial) contaUpcasting;
        contaEmpresarialDowncasting.emprestimo(100.0);




    }
}
