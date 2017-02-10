package designpatterns;

/**
 * Created by nxc141130 on 10/9/16.
 */
public class Animal {
    private String name;
    private int weight;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight>0){
            this.weight = weight;
        }
        else{
            System.out.println("Set a valid weight");
        }

    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
