package Model;

public class Player {
    // each player will have a name , and playing piece attached to it
    public PlayingPiece playingPiece;
    public String name ;

    public Player(String name, PlayingPiece playingPiece){
        this.name = name;
        this.playingPiece = playingPiece;
    }
}


/*

Without a Base Class : PlayingPiece
If you directly use PlayingPieceX and PlayingPieceO without a common superclass,
 you lose the benefits of polymorphism. You would have to write more specific code for each type of piece,
 leading to more code duplication and complexity.

 means different constructors for PlayingPieceO and PlayingPieceX
 */