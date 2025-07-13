public class Player {
    private String name;
    private  int money = 1500;
    private int location = 0;
    private char character;
    Player(char character, String name){
        this.character = character;
        this.name = name;

    }
    public int getMoney() {
        return money;
    }
    public void changeMoney(int money) {
        this.money += money;
    }
    public int getLocation() {
        return location;
    }
    public void setLocation(int location) {
        this.location += location;
        if(this.location >= 26){
            changeMoney(1000);
            this.location -= 26;
        }
    }
    public char getCharacter() {
        return character;
    }
    public String getName() {
        return name;
    }

    public Boolean checkLoss(){
        if(money<=0){
            return true;
        }
        return false;
    }
}
