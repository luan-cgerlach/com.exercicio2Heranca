package com.mycompany.veiculos;


public class Main {
    public static void main(String[] args) {
        
        Veiculos celtaDoPaulo = new Carro(TipoDeCarros.HATCH,5, "KSN2541", "celta", 2005, 3);
        Veiculos trackerDoMauri = new Carro(TipoDeCarros.SUV,5, "NSJ4785", "tracker", 2014, 1);
        Veiculos civicDoCuca = new Carro(TipoDeCarros.SEDAN,2, "DSE2541", "civic", 2012, 7);
        Veiculos cbDoHenrique = new Moto(250, TipoDeMotos.NAKED, "JDN2360", "cb250", 2022, 4);
        Veiculos princesaDoLuan = new Moto(125,TipoDeMotos.CUSTOM, "Não Tem", "desconhecido", 1983, 4);
        Veiculos brossDoMoacir = new Moto(160, TipoDeMotos.NAKED, "SHV2415", "Bross", 2016, 1);
        
        System.out.println(celtaDoPaulo.exibirVeiculos());
        System.out.println(trackerDoMauri.exibirVeiculos());
        System.out.println(civicDoCuca.exibirVeiculos());
        System.out.println(cbDoHenrique.exibirVeiculos());
        System.out.println(princesaDoLuan.exibirVeiculos());
        System.out.println(brossDoMoacir.exibirVeiculos());
        
    }
}
