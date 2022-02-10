package trainingDio;

public class CarroObjeto {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Chevrolet Zafira");
        carro1.setCapacidadeTanque(58);

        System.out.println("Cor do veículo: " + carro1.getCor());
        System.out.println("Modelo do veículo: " + carro1.getModelo());
        System.out.println("Capacidade do tanque em litros: " + carro1.getCapacidadeTanque());
        System.out.println("Custo para encher o tanque em reais: " + carro1.totalValorTanque(7.00));

        Carro carro2 = new Carro("Amarelo", "Cadillac ATS", 60);

        System.out.println("________________________________________");
        System.out.println("________________________________________");

        System.out.println("Cor do veículo: " + carro2.getCor());
        System.out.println("Modelo do veículo: " + carro2.getModelo());
        System.out.println("Capacidade do tanque em litros: " +  carro2.getCapacidadeTanque());
        System.out.println("Custo para encher o tanque em reais: " +  carro2.totalValorTanque(7.00));

    }
}
