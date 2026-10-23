import java.util.Random;
public class rpggame {

    static int bosshp = 700;
    static int bossdmg = 50;
    static String defence = "";
    static int[] hps = {250, 250, 250, 250};
    static int[] dmg = {10, 20, 30, 0};
    static String[] type = {"Physical", "Magical", "Kinetic", "Medic"};
    static int len = hps.length;
    static String deftype = "";
    static int luckyIndex = 0;
    static Random random = new Random();
    static int heal = 50;
    public static void main(String[] args){
    while (!isFinished()){
        round();
    }

    }
    public static boolean isFinished(){
        if (bosshp <= 0) {
            return true; 
            
        }
        else if (hps[0] <= 0 && hps[1] <= 0 && hps[2] <= 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void changeLuckyindex(){
        luckyIndex = random.nextInt(len);
        if (deftype.equals(type[luckyIndex]) || luckyIndex == 4){
            changeLuckyindex();
        }
        else {
            System.out.println("lucky: " + type[luckyIndex]);
        }
    }
    
    public static void changeBossDefence(){
    
    deftype = type[random.nextInt(len)];
    System.out.println("Boss choise: " + deftype);
}

    public static void bossHits(){
        for (int i = 0; i < len; i++){
        if ((hps[i] - 50) < 0){
            hps[i] = 50;
        }
        else {
            hps[i] -= 50;
        }
    }
}
    public static void heroesHit(){
        
        for (int i = 0; i < len; i++){
            if (hps[i] <= 0) {
                continue;
            }

            if (type[i].equals(deftype)) {
                continue;
            }
            if (i == luckyIndex) {
                int luckydmg = dmg[luckyIndex] * (random.nextInt(9) + 2);
                bosshp -= luckydmg;
                System.out.println(type[luckyIndex] + " will hit " + luckydmg);

                }
            else {
                bosshp -= dmg[i];
            }
            if (bosshp <= 0){
                bosshp = 0;
                break;
            }
        }
    }
    public static void printStatistics(){
        System.out.println("-------------");
        System.out.println("Boss health: " + bosshp);
        for (int i = 0; i < len; i++){
            System.out.println("attack type:" + type[i]);
            System.out.println("health: " + hps[i]);
        }
        System.out.println("-------------");
        if (bosshp == 0){
            System.out.println("Heroes won!!");
        }
    
        for (int i = 0; i < len; i ++){
            if (hps[i] > 0){
                break;
            }
            if (hps[i] <= 0) {
                continue;
            }
            if (hps[len - 1] == 0){
                System.out.println("Boss Won!!");
            }
        }
        }

    public static void medicHeals(){
        if (hps[3] <= 0) {
            return;
        }
        else {
        for (int i = 0; i < len; i ++) {
            if (i == 4) {
                continue;
            }
            if (hps[i] <= 0){
                continue;
                }
            
            if (hps[i] > 0 && hps[i] < 100) {
                hps[i] += heal;
                break;
            }
            
            }
        }
    }
    
    


    public static void round(){
        changeBossDefence();
        changeLuckyindex();
        heroesHit();
        if (bosshp > 0) {
            bossHits();
        }
        medicHeals();
        printStatistics();
    }
    


}
