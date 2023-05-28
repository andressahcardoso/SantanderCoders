import classes.cachorro;

public class cachorito {
    public static void main(String[] args)  {
        cachorro cachorro1 = new cachorro();
        cachorro cachorro2 = new cachorro("Puppy", 3, 10);

        System.out.println(cachorro2.toString());
        
        cachorro1.setNome("Puppy");
        // nome = "Puppy";
        // cachorro1.cor = "Marrom";
        // cachorro1.altura = 25;;
        // cachorro1.peso = 30;

        cachorro1.latir();
        System.out.println(cachorro1.pegar());
       

        System.out.println(cachorro1.interagir("carrinho"));
    }
}
