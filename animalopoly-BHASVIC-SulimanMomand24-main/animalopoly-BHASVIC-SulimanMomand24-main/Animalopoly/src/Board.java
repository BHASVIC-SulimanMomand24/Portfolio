public class Board {
    private int[] board = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    Player[] players;
    Animal[] animals = {null, new Tiger(), new Lion(), new Dog(), new Cow(), new Horse(), new Sheep(), new Clownfish(), new Salmon(), new Pufferfish(), new Seahorse(), new Shark(), new Dolphin(), null, new Snake(), new Crocodile(), new Turtle(), new Chameleon(), new Lizard(), new Gecko(), new Eagle(), new Vulture(), new Parrot(), new Owl(), new Seagull(), new Chicken()};

    Board(Player[] players){
        this.players = players;
    }

    public void displayBoard() {

        for (int i = 0; i < 26; i++) {
            if (board[i] == 0) {
                System.out.print("Start, ");
            } else if (board[i] == 13) {
                System.out.print("Miss a turn, ");
            } else {
                System.out.print(board[i] + ", ");
            }
        }

        System.out.println("\n");
        System.out.println("\nPlayers:\n");
        for(int j = 0; j<players.length; j++){
            System.out.println(players[j].getName() + " is on space " + players[j].getLocation() + "\n");
        }
    }

    public void movePlayer(int player, int amount){
        players[player].moveLocation(amount);
        System.out.println(players[player].getName() + " moved to space: " + players[player].getLocation());
        if (players[player].getLocation() == 0){
            System.out.println("Player " + players[player].getName() + " has earned £1,000");
        }
    }

    public void displayBalances(){
        for(int i = 0; i<players.length; i++) {
            System.out.println(players[i].getName() + " balance: " + players[i].getMoney());
        }
    }
    public void checkWinner(){
        int Check = 0;
        Player winner = new Player('a', "unused");
        for(int i = 0; i<players.length; i++) {
            if(players[i].getMoney() > 0){
                Check ++;
                winner = players[i];
            }
        }
        if(Check == 1){
            winner.displayWin();
        }
    }

    public void listAnimals(){
        for(int i = 0; i<animals.length; i++) {
            if(animals[i] != null){
                System.out.println(animals[i].getSpecies());
            }
            else{
                System.out.println("Space 0 or 13");
            }
        }
    }
}
