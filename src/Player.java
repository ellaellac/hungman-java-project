public class Player {
    private static int life = 8;


    //Getter and setter

    public static int getLife() {
        return life;
    }

    public static void setLife(int life) {
        Player.life = life;
    }

    //Method
    public static void deductLife() {
        life--;
    }


}
