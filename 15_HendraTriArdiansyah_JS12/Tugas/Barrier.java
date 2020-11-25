package Tugas;
public class Barrier implements Destroyable{
    private int strength;
    
    public Barrier(int Strength){
        this.strength = Strength;
    }
    public int Strength(){
        return strength;
    }
    public void setStrength(int Strength){
        this.strength = Strength;
    }

    @Override
    public void destroyed() {
        int destroy = (int) (this.strength*0.112);
        this.strength = this.strength-destroy;
    }
    public String getBarrierInfo(){
        return "Barrier Strength = "+ strength+"\n";
    }
}
