import java.util.ArrayList;
import java.util.List;
public class GameMap {
    //Game Map is a container for all other GameObjects and would provide the
    //boundary for object positions
    private List<GameObject> gameObjects;
    public GameMap(){
        this.gameObjects = new ArrayList<>();
        System.out.println("Game map created...");
    }
    public List<GameObject> getGameObjects() {
        return gameObjects;
    }

    public void addGameObject(GameObject gameObject) {
        gameObjects.add(gameObject);
    }

    public void removeGameObject(GameObject gameObject) {
        gameObjects.remove(gameObject);
    }
    public void updateAll() {
        for (GameObject obj : gameObjects) {
            obj.update();
        }
    }
}
