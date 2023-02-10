public class Player {
    private String name;
    private int age;
    private String gameType;

    public Player() {
        super();
    }

    public Player(String name, int age, String gameType) {
        super();
        this.name = name;
        this.age = age;
        this.gameType = gameType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public void displayPlayer(){
        System.out.println("Player's Name : "+getName()+"\nPlayer's Age : "+getAge()+"\nPlayer's Game type : "+getGameType());
    }
}


