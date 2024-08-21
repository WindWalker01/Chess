package org.example;
import static com.raylib.Raylib.*;
import static com.raylib.Jaylib.*;


public class Main {
    public static void main(String[] args) {

        InitWindow(800, 800, "Chess");
        Board chessBoard = new Board();


        while(!WindowShouldClose()){

            chessBoard.Update(GetFrameTime());

            ClearBackground(RAYWHITE);
            BeginDrawing();

            chessBoard.drawBoard();

            EndDrawing();
        }


        CloseWindow();


    }
}