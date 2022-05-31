package POO;

public class RodarAplicao {
    public static void main(String[] args) {
    /**
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTamque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTamque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Cinza","Mercedes-Benz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTamque());
        System.out.println(carro2.totalValorTanque(6.46));
     */
    /**
    Funcionario funcionario = new Funcionario();

    Funcionario gerente = new Gerente();
    Funcionario vendedor = new Vendedor();
    Funcionario faxineiro = new Faxineiro();
    */

    ClasseMae[] classes = new ClasseMae[]{new ClasseFilha(), new ClasseFilha2(), new ClasseMae()};

    for (ClasseMae classe: classes){
        classe.metodo1();
    }

    System.out.println("");

    for (ClasseMae classe:classes){
        classe.metodo2();
    }

    System.out.println("");

    ClasseFilha2 classeFilha2 = new ClasseFilha2();
    classeFilha2.metodo2();
    }
}