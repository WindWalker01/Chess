package org.example;
import com.raylib.Jaylib;
import com.raylib.Raylib;


import static com.raylib.Raylib.*;
import static com.raylib.Jaylib.*;


public class Board {

    private final int COLUMN = 8;
    private final int ROW = 8;

    private final Tile[][] tiles = new Tile[COLUMN][ROW];

    private final Jaylib.Color BLACKTILE = new Jaylib.Color(119, 149, 86, 255);
    private final Jaylib.Color WHITETILE = new Jaylib.Color(235, 236, 208, 255);

    public Board(){

        int c = 0;

        for (int col = 0; col < COLUMN; col++) {
            for (int row = 0; row < ROW; row++) {

                Tile tile;

                if(c == 0){
                   tile = new Tile(WHITETILE);
                   c = 1;
                }else{
                    tile = new Tile(BLACKTILE);
                    c = 0;
                }

                tile.position = new Jaylib.Vector2(row * 100,  col * 100);

                tiles[col][row] = tile;
            }

            if(c == 0){
                c = 1;
            }else{
                c = 0;
            }
        }

    }

    public void drawBoard(){
        for (int col = 0; col < COLUMN; col++) {
            for (int row = 0; row < ROW; row++) {
                DrawTextureV(Tile.texture, tiles[row][col].position, tiles[col][row].color);
            }
        }
    }

}
