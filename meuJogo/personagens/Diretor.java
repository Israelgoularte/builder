package meuJogo.personagens;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diretor {

    private String escolhas;
    private ConstroePersonagem builder;
    private int controle;
    Scanner leitor = new Scanner(System.in);

    public Diretor() {
        this.builder = new ConstroePersonagem();
        controle = 0;
        escolhas = "";
    }

    public Personagem criarPersonagem(int num){
        if(num == 1){
            builder.setArmor("Heavy");
            builder.setWeapon("Sword");
            builder.setRaca("Elfo");
            builder.setClasse("Warrior");
            builder.setNome("jog01");
            builder.builder().atualizaStatus();
            return builder.builder();
        }else{
            builder.setArmor("Heavy");
            builder.setWeapon("Katanna");
            builder.setRaca("Orc");
            builder.setClasse("Tank");
            builder.setNome("jog02");
            builder.builder().atualizaStatus();
            return builder.builder();
        }
    }

    public Personagem criarPersonagem(){ 

        System.out.println("Raça          Classe          Armor           Weapon\n"
                            +"1 - Humano    4 - Archer       8 - Heavy      11 - Bow\n"
                            +"2 - Elfo      5 - Tank         9 - Light      12 - Katanna\n"
                            +"3 - Orc       6 - Mago        10 - Robe       13 - Retributter\n"
                            +"              7 - Warrior                     14 - Sword\n"
                            +"30 -  para Finalizar         40 - Status Atual do Personagem\n"
                            +"ou digite sair para desistir");
                            
                            
        try{
            switch(leitor.nextInt()){
                case 1:
                if(builder.setRaca("Humano"))
                {
                    this.escolhas += "Humano ";
                    this.controle++;
                    return null;
                }
                case 2:
                if(builder.setRaca("Elfo"))
                {
                    this.escolhas += "Elfo ";
                    this.controle++;
                    return null;
                }
                case 3:
                if(builder.setRaca("Orc"))
                {
                    this.escolhas += "Orc ";
                    this.controle++;
                    return null;
                }
                case 4:
                if(builder.setClasse("Archer"))
                {
                    this.escolhas += "Archer ";
                    this.controle++;
                    return null;
                }
                case 5:
                if(builder.setClasse("Tank"))
                {
                    this.escolhas += "Tank ";
                    this.controle++;
                    return null;
                }
                
                case 6:
                if(builder.setClasse("Mago"))
                {
                    this.escolhas += "Mago ";
                    this.controle++;
                    return null;
                }
                case 7:
                if(builder.setClasse("Warrior"))
                {
                    this.escolhas += "Warrior ";
                    this.controle++;
                    return null;
                }
                case 8:
                if(builder.setArmor("Heavy"))
                {
                    this.escolhas += "Heavy ";
                    this.controle++;
                    return null;
                }
                case 9:
                if(builder.setArmor("Light"))
                {
                    this.escolhas += "Light ";
                    this.controle++;
                    return null;
                }
                case 10:
                if(builder.setArmor("Robe"))
                {
                    this.escolhas += "Robe ";
                    this.controle++;
                    return null;
                }
                case 11:
                if(builder.setWeapon("Bow"))
                {
                    this.escolhas += "Bow ";
                    this.controle++;
                    return null;
                }
                case 12:
                if(builder.setWeapon("Katanna"))
                {
                    this.escolhas += "Katanna ";
                    this.controle++;
                    return null;
                }
                case 13:
                if(builder.setWeapon("Retributter"))
                {
                    this.escolhas += "Retributter ";
                    this.controle++;
                    return null;
                }
                case 14: 
                if(builder.setWeapon("Sword"))
                {
                    this.escolhas += "Sword ";
                    this.controle++;
                    return null;
                }
                case 30:
                if(controle>=4)
                {   
                    Personagem personagem = builder.builder();
                    personagem.atualizaStatus();
                    return personagem;
                }
                break;
                case 40:
                    System.out.println(escolhas);
                break;
                default:
                    System.out.println("Opcao invalida");
        }
    }catch(InputMismatchException e){
        System.out.println("Opcao invalida");
        leitor.nextLine();
    }
        return null;

    }
}
