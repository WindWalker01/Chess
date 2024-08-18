package org.example.Pieces;
import static com.raylib.Raylib.*;


public abstract class Piece {

    public Texture pieceTexture;
    public Vector2 position = new Vector2().x(0).y(0);

    public abstract void movePiece();
}
