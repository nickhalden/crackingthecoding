package bookCracking;

import java.util.HashMap;

/**
 * Created by vn0dht3 on 12/7/16.
 */
public class SocialWebsiteData  {
    private int id;
    public String my_url;
    private String name;
    private int weight;
    private HashMap<Integer,String> friendsMap;

    SocialWebsiteData() {
            friendsMap = new HashMap<>();
    }

    void addFriends(){

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int size(){
        return friendsMap.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFriendsMap(HashMap<Integer, String> friendsMap) {
        this.friendsMap = friendsMap;
    }

    public HashMap<Integer, String> getFriendsMap() {
        return friendsMap;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = random();
    }
    int random(){
        return this.id%size();
    }
}

