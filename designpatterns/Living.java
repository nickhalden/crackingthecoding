package designpatterns;

/**
 * Created by nxc141130 on 10/9/16.
 */
public interface Living {

    public void setName(String newName);
    public String getName();

    public double getHeight();
    public void setHeight(double newHeight);

    public double getWeight();
    public void setWeight(double newWeight);

    public void setFavFood(String food);
    public String getFavFood();

    public void setSound(String sound);
    public String getSound();

    public void setSpeed(String speed);
    public String getSpeed();

}
