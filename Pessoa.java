import java.util.ArrayList;

public class Pessoa {
    //Essa classe é a responsavel por todos os atributos e methodos que os usuarios usaram para poder efetuar uso de tickets
    //Por saldo, ver suas refeições que seria uma lista de tickets, e assim por diante
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private float saldo;
    private String nome, cpf;

    public Pessoa(String nome, String cpf, float saldo, Ticket tickets){
        this.nome = nome;
        this.cpf = cpf;
        this.float = 
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
}
