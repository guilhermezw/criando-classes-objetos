package vetor.exercicio06;

public class Aluguel {
    private String nome;
    private String email;
    private int numeroQuarto;


    public Aluguel(String nome, String email, int numeroQuarto) {
        this.nome = nome;
        this.email = email;
        this.numeroQuarto = numeroQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    @Override
    public String toString() {
        return "Quarto " + numeroQuarto + ": " + nome + " (" + email + ")";
    }
}
