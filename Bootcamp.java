public class Bootcamp {
    public static void main(String[] args) {
        Deelnemer u1 = new Deelnemer();
        u1.persoonlijkheid=true;
        u1.ta=5.2;
        u1.leeftijd=12;
        u1.naam="Bob";
        Deelnemer u2 = new Deelnemer();
        u2.persoonlijkheid=false;
        u2.ta=8.3;
        u2.leeftijd=26;
        u2.naam="Fritz";
        Deelnemer u3 = new Deelnemer();
        u3.persoonlijkheid=true;
        u3.ta=4.2;
        u3.leeftijd=40;
        u3.naam="Rita";

        controle(u1);
        controle(u2);
        controle(u3);
    }

    static void controle(Deelnemer trainee){
        if(trainee.persoonlijkheid==true && trainee.ta >= 4.5 && trainee.leeftijd <35){
            System.out.println(trainee.naam + " mag door");
        } else {
            System.out.println(trainee.naam + " mag niet door");
        }


    }

}

class Deelnemer{
    boolean persoonlijkheid;
    double ta;
    int leeftijd; //moet onder de 35 zijn
    String naam;
}

