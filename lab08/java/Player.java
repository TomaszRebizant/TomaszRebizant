public class Player {
    private Boolean alive;

    public Player(String alive){
        if(Math.random() < 0.5){
            this.alive = true;
    }
    else{
        this.alive = false;
    }
    }
    public Boolean isAlive(){
        return this.alive;
    }
    public String toString(){
        return "Player is alive: " + this.alive;
    }
}

