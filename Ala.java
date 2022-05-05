public class Ala {
    int id;
    String especialidade;
    Quarto quarto;

    Ala(int id, String especialidade, int nQuarto) {
        quarto = new Quarto(nQuarto);
        this.id = id;
        this.especialidade = especialidade;
    }

    public void exibiRelatorio() {
        System.out.println("ID: " + id + "\n Especialidade: " + especialidade);
        quarto.verificarQuartoVazio();

    }

}