 class Game {
    public String name;
    public int MaxNumPlayers;

    public Game(String name, int MaxNumPlayers) {
        this.name = name;
        this.MaxNumPlayers = MaxNumPlayers;
    }
    @Override
     public String toString() {
        return "Maximum number of players for " + name + " is " + MaxNumPlayers;
    }
}
class GameWithTimeLimit extends Game {
    public int TimeLimit;

    public GameWithTimeLimit(String name, int MaxNumPlayers, int TimeLimit) {
        super(name, MaxNumPlayers);
        this.TimeLimit = TimeLimit;
    }
    @Override
    public String toString() {
        return super.toString() + "\nTime Limit for " + name + " is " + TimeLimit + " minutes ";
    }
}

