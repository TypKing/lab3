public class PrisonBoss extends LivingBeing {
    boolean wish;
    double money;
    protected String name = "Тюремное начальство";

    public PrisonBoss() {}

     public void wasteMoney(boolean wish, double q, String s) {
         if ((wish) && (checkMoney()>q)){
             money -= q;
             System.out.println(q + " денег потратилось на " + s);
         }
         else {
             System.out.println("Что-то пошло не так, и " + s + " не осуществилось");
         }
     }

     public Double checkMoney(){
         System.out.print("На счету тюремного начальства: " + money);
         return money;
     }

     public void setWish(boolean b){
        wish = b;
         System.out.println();
     }

     public void send(Shorty shorty, Place place){
     }
}
