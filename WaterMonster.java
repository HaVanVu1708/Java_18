package Java_18;

import Java_18.Monster;

public class WaterMonster extends Monster {
    public WaterMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Attack with water!";
    }
}
