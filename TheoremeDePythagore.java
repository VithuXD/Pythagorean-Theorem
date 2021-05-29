//////////
//
// V2
// Le 4 mars 2021
// Le theoreme de pythagore
//
//////////

// formule de theoreme de pythagore: a^2+b^2=c^2

public class TheoremeDePythagore {
    public static void main(String args[]) {
    
    // les variables
    int a = 6;
    int b = 3;
    double c = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
    
    //imprimer a l'ecran
    System.out.println(" l'hypotenuse d'un triangle rectangle de cote a =" +a+" et b =" +b+ "est de "+c );
    
    }
}