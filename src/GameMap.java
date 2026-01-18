import java.util.ArrayList;
import java.util.List;
public class GameMap {
    private List<GameObject> gameObjects;
    public GameMap(){
        this.gameObjects = new ArrayList<>();
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
