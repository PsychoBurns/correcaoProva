class Main {
  public static void main(String[] args) {
    Quarto quarto01 = new Quarto(1);
        Quarto quarto02 = new Quarto(2);

        Paciente paciente01 = new Paciente("Mateus", 5, "Pereira");
        Paciente paciente02 = new Paciente("Camila", 10, "Pereira");
        Paciente paciente03 = new Paciente("Fernanda", 7, "Pereira");
        Paciente paciente04 = new Paciente("Raul", 8, "Pereira");

        Ala ala01 = new Ala(1, "Radiografia", 1);
        Ala ala02 = new Ala(2, "Emergencia",2);
        
        System.out.println("----------------------");
        paciente01.exibirRelatorioPac();
        paciente02.exibirRelatorioPac();
        System.out.println("----------------------");

        System.out.println("----------------------");
        ala01.exibiRelatorio();
        ala02.exibiRelatorio();
        System.out.println("----------------------");

        System.out.println("----------------------");
        quarto01.verificarQuartoVazio();
        System.out.println("----------------------");

        System.out.println("----------------------");
        System.out.println(paciente03.diasInternado);
        
        System.out.println("----------------------");

  }
}