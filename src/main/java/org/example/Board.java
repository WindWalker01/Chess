package org.example;
import com.raylib.Jaylib;
import com.raylib.Raylib;
import org.example.Pieces.Piece;


import static com.raylib.Raylib.*;
import static com.raylib.Jaylib.*;


public class Board {

    private final int COLUMN = 8;
    private final int ROW = 8;
    private Texture squareTexture = LoadTexture("src/main/resources/square.png");

    private int[][] square = new int[8][8];

    private final Jaylib.Color BLACKTILE = new Jaylib.Color(119, 149, 86, 255);
    private final Jaylib.Color WHITETILE = new Jaylib.Color(235, 236, 208, 255);

    private Texture bishopBlack = LoadTexture("src/main/resources/Piece=Bishop, Side=Black.png");
    private Texture pawnBlack = LoadTexture("src/main/resources/Piece=Pawn, Side=Black.png");
    private Texture knightBlack = LoadTexture("src/main/resources/Piece=Knight, Side=Black.png");
    private Texture rookBlack = LoadTexture("src/main/resources/Piece=Rook, Side=Black.png");
    private Texture queenBlack = LoadTexture("src/main/resources/Piece=Queen, Side=Black.png");
    private Texture kingBlack = LoadTexture("src/main/resources/Piece=King, Side=Black.png");

    private Texture bishopWhite = LoadTexture("src/main/resources/Piece=Bishop, Side=White.png");
    private Texture pawnWhite = LoadTexture("src/main/resources/Piece=Pawn, Side=White.png");
    private Texture knightWhite = LoadTexture("src/main/resources/Piece=Knight, Side=White.png");
    private Texture rookWhite= LoadTexture("src/main/resources/Piece=Rook, Side=White.png");
    private Texture queenWhite = LoadTexture("src/main/resources/Piece=Queen, Side=White.png");
    private Texture kingWhite = LoadTexture("src/main/resources/Piece=King, Side=White.png");

    public Board(){
        square[0][0] = Piece.Black|Piece.Rook;
        square[0][1] = Piece.Black|Piece.Knight;
        square[0][2] = Piece.Black|Piece.Bishop;
        square[0][3] = Piece.Black|Piece.Queen;
        square[0][4] = Piece.Black|Piece.King;
        square[0][5] = Piece.Black|Piece.Bishop;
        square[0][6] = Piece.Black|Piece.Knight;
        square[0][7] = Piece.Black|Piece.Rook;

        square[1][0] = Piece.Black|Piece.Pawn;
        square[1][1] = Piece.Black|Piece.Pawn;
        square[1][2] = Piece.Black|Piece.Pawn;
        square[1][3] = Piece.Black|Piece.Pawn;
        square[1][4] = Piece.Black|Piece.Pawn;
        square[1][5] = Piece.Black|Piece.Pawn;
        square[1][6] = Piece.Black|Piece.Pawn;
        square[1][7] = Piece.Black|Piece.Pawn;

        square[7][0] = Piece.White|Piece.Rook;
        square[7][1] = Piece.White|Piece.Knight;
        square[7][2] = Piece.White|Piece.Bishop;
        square[7][3] = Piece.White|Piece.Queen;
        square[7][4] = Piece.White|Piece.King;
        square[7][5] = Piece.White|Piece.Bishop;
        square[7][6] = Piece.White|Piece.Knight;
        square[7][7] = Piece.White|Piece.Rook;

        square[6][0] = Piece.White|Piece.Pawn;
        square[6][1] = Piece.White|Piece.Pawn;
        square[6][2] = Piece.White|Piece.Pawn;
        square[6][3] = Piece.White|Piece.Pawn;
        square[6][4] = Piece.White|Piece.Pawn;
        square[6][5] = Piece.White|Piece.Pawn;
        square[6][6] = Piece.White|Piece.Pawn;
        square[6][7] = Piece.White|Piece.Pawn;
    }

    public void drawBoard(){

        //Draw the squares
        for (int col = 0; col < COLUMN; col++) {
            for (int row = 0; row < ROW; row++) {
                DrawTextureV(squareTexture, new Jaylib.Vector2(row * 100, col * 100), (row + col) % 2 == 0 ? WHITETILE : BLACKTILE);

                
                switch (square[col][row]){
                    case Piece.Pawn | Piece.White ->  DrawTexture(pawnWhite, 100 * row, col * 100, RAYWHITE);
                    case Piece.Knight | Piece.White ->  DrawTexture(knightWhite, 100 * row, col * 100, RAYWHITE);
                    case Piece.Bishop | Piece.White ->  DrawTexture(bishopWhite, 100 * row, col * 100, RAYWHITE);
                    case Piece.Rook | Piece.White ->  DrawTexture(rookWhite, 100 * row, col * 100, RAYWHITE);
                    case Piece.Queen | Piece.White ->  DrawTexture(queenWhite, 100 * row, col * 100, RAYWHITE);
                    case Piece.King | Piece.White ->  DrawTexture(kingWhite, 100 * row, col * 100, RAYWHITE);

                    case Piece.Pawn | Piece.Black ->  DrawTexture(pawnBlack, 100 * row, col * 100, RAYWHITE);
                    case Piece.Knight | Piece.Black ->  DrawTexture(knightBlack, 100 * row, col * 100, RAYWHITE);
                    case Piece.Bishop | Piece.Black ->  DrawTexture(bishopBlack, 100 * row, col * 100, RAYWHITE);
                    case Piece.Rook | Piece.Black ->  DrawTexture(rookBlack, 100 * row, col * 100, RAYWHITE);
                    case Piece.Queen | Piece.Black ->  DrawTexture(queenBlack, 100 * row, col * 100, RAYWHITE);
                    case Piece.King | Piece.Black ->  DrawTexture(kingBlack, 100 * row, col * 100, RAYWHITE);
                }
            }
        }

    }

}
