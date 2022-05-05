public class Paciente {
    String nome;
    int diasInternado;
    Medico medico;

    Paciente(String nome, int diasInternado, String nomeMedico) {
        medico = new Medico(nomeMedico);
        this.nome = nome;
        this.diasInternado = diasInternado;

    }

    public void exibirRelatorioPac() {
        System.out
                .println("Paciente: " + nome + "\n Medico: " + medico.nome + "\n Qtd dias Internado: " + diasInternado);
    }

    public int exibirDiasInternado() {
        return diasInternado;
    }
}