public class Quarto {
    int numero;
    Paciente paciente01;
    Paciente paciente02;
    Paciente paciente03;


    Quarto(int n) {
        numero = n;

    }

    public int maxDiasInternado() {
        return 1;
    }

    public int minDiasInternado() {
        return 1;
    }

    public int diasPorPac() {

        return 1;
    }

    public void verificarQuartoVazio() {
        if (numero != 0) {
            System.out.println("Não há espaço.");
        } else
            System.out.println("Há quarto disponiveis");
        return;
    }
}