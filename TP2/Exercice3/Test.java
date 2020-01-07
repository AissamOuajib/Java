class Test{
    public static void main(String[] args) {
        Valeur myVal = new Valeur(10);
        Runnable job1 = new Ajob(myVal, 1);
        Runnable job2 = new Ajob(myVal, -1);
        Thread t1 = new Thread(job1),t2 = new Thread(job2);
        t1.start();
        t2.start();
        while(t1.isAlive() || t2.isAlive()){
            
        }
        System.out.println(" La valeur stocke est : "+myVal.getVal());
    }
}

// Question 4 : 
// La valeur qui doit etre stockée dans myVal c'est la valeur initial 
// qu'on passe au constructeur (dans notre cas c'est 10)
// Question 5 :
// depend de la valeur initiale de myVal positive ou negative
// d'apres cette valeur on calcule les fois d'ajout de 1 et d -1
// Question 5 :
// On a changé le mode de traitement de thrad de job et on les 
// suçauvegarder dans des variables
// Question 8 : 
// apres l'jout de synchronized la valeur finale est l'initiale
