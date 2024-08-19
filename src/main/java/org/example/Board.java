package org.example;
import com.raylib.Jaylib;
import com.raylib.Raylib;


import static com.raylib.Raylib.*;
import static com.raylib.Jaylib.*;


public class Board {

    private final int COLUMN = 8;
    private final int ROW = 8;
    private Texture squareTexture = LoadTexture("src/main/resources/square.png");

    private int[][] square = new int[8][8];

    private final Jaylib.Color BLACKTILE = new Jaylib.Color(119, 149, 86, 255);
    private final Jaylib.Color WHITETILE = new Jaylib.Color(235, 236, 208, 255);

    private Texture sample = LoadTexture("src/main/resources/Piece=Bishop, Side=Black.png");

    public Board(){
        square[0][0] = 1;
    }

    public void drawBoard(){

        //Draw the squares
        for (int col = 0; col < COLUMN; col++) {
            for (int row = 0; row < ROW; row++) {
                DrawTextureV(squareTexture, new Jaylib.Vector2(row * 100, col * 100), (row + col) % 2 == 0 ? WHITETILE : BLACKTILE);

                if(square[col][row] == 1){
                    DrawTexture(sample, 100 * row, col * 100, RAYWHITE);
                }
            }
        }

    }

}
