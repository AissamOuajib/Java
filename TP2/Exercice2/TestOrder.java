import java.util.Scanner;

class TestOrder{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        for(int i = 0;i<n;i++){
          new Compteur("Compteur " + (i+1), 110);  
        }
    }
}


// Question 3 : 
// Est determiné, mais parfois il ne complete pas le compte
// Question 5 :
// le principale resource utilisé c'est le processeur car c'est lui qui fait
// les calculs et les traitements des informations.