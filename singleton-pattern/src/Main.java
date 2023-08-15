import com.singleton.example.World;

public class Main {
    public static void main(String[] args) {
        World world = World.getInstance();
        world.show();
    }
}