package com.poo.enums;

import java.util.Scanner;

public enum Estados {
    AC("Acre", "AC", "Norte"),
    AL("Alagoas", "AL", "Nordeste"),
    AP("Amapá", "AP", "Norte"),
    AM("Amazonas", "AM", "Norte"),
    BA("Bahia", "BA", "Nordeste"),
    CE("Ceará", "CE", "Nordeste"),
    DF("Distrito Federal", "DF", "Centro-Oeste"),
    ES("Espírito Santo", "ES", "Sudeste"),
    GO("Goiás", "GO", "Centro-Oeste"),
    MA("Maranhão", "MA", "Nordeste"),
    MT("Mato Grosso", "MT", "Centro-Oeste"),
    MS("Mato Grosso do Sul", "MS", "Centro-Oeste"),
    MG("Minas Gerais", "MG", "Sudeste"),
    PA("Pará", "PA", "Norte"),
    PB("Paraíba", "PB", "Nordeste"),
    PR("Paraná", "PR", "Sul"),
    PE("Pernambuco", "PE", "Nordeste"),
    PI("Piauí", "PI", "Nordeste"),
    RJ("Rio de Janeiro", "RJ", "Sudeste"),
    RN("Rio Grande do Norte", "RN", "Nordeste"),
    RS("Rio Grande do Sul", "RS", "Sul"),
    RO("Rondônia", "RO", "Norte"),
    RR("Roraima", "RR", "Norte"),
    SC("Santa Catarina", "SC", "Sul"),
    SP("São Paulo", "SP", "Sudeste"),
    SE("Sergipe", "SE", "Nordeste"),
    TO("Tocantins", "TO", "Norte");

    private final String nome;
    private final String uf;
    private final String regiao;

    
    Estados(String nome, String uf, String regiao){
        this.nome = nome;
        this.uf = uf;
        this.regiao = regiao;
    }
    
    public String getNome(){
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public String getRegiao() {
        return regiao;
    }

    public static void imprimirEstado(){
        for (Estados estado : Estados.values() ) {
            System.out.println(estado.getNome());
        }
    }

    public static void imprimirRegiao(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a regiao que voce deseja");
        String regiaoRecebida = scanner.nextLine();

        for (Estados estado : Estados.values()) {
            if (estado.getRegiao().equalsIgnoreCase(regiaoRecebida)) {
                System.out.println(estado.getNome());
            }
        }
        scanner.close();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        
        do {
            EnumsApplication.limpa_windows();
            System.out.println("===== MENU =====");
            System.out.println("1. imprimir Regiao");
            System.out.println("2. imprimir Por Estado");
            System.out.println("31. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("imprimir todos os Estados");
                    imprimirEstado();
                    break;
                case 2:
                    System.out.println("Imprimir estados por Regiao");
                    break;
                case 3:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            System.out.println();
        } while (opcao != 3);

        scanner.close();
    }

}
