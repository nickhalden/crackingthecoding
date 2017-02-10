package designpatterns;

/**
 * Created by nxc141130 on 10/9/16.
 */
public class Monkey implements Living {

    String name;
    @Override
    public void setName(String newName) {
        name=newName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public void setHeight(double newHeight) {

    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setWeight(double newWeight) {

    }

    @Override
    public void setFavFood(String food) {

    }

    @Override
    public String getFavFood() {
        return null;
    }

    @Override
    public void setSound(String sound) {

    }

    @Override
    public String getSound() {
        return null;
    }

    @Override
    public void setSpeed(String speed) {

    }

    @Override
    public String getSpeed() {
        return null;
    }
}
