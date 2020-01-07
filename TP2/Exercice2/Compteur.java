class Compteur extends Thread{
    int maxValue;
    String nom;

    Compteur(String nom,int maxValue){
        this.maxValue = maxValue;
        this.nom = nom;
        this.start();
    }

    public void run() {
        int val = 1;
        try{
        while(val <= this.maxValue){
            System.out.println("Nom : " + nom + " Value : " + val);
            val++;
            // avec un delais de 100ms
            //sleep(100);
            // avec des delais aleatoire
            sleep(Math.round(Math.random() * 200));
        }
        }
        catch(InterruptedException e){
            return;
        }
    }
}