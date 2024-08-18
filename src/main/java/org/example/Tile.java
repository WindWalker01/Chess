package org.example;
import com.raylib.Jaylib;
import com.raylib.Raylib;
import static com.raylib.Jaylib.*;
import static com.raylib.Raylib.*;


public class Tile {

    public Raylib.Color color = RAYWHITE;
    public Raylib.Vector2 position = new Raylib.Vector2().x(0).y(0);
    public static Texture texture = LoadTexture("src/main/resources/square.png");





    public Tile(Raylib.Color color){
        this.color = color;
    }

}
