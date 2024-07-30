package Model;

public abstract class PlayingPiece {
    public PieceType pieceType;

    public PlayingPiece(PieceType pieceType){
        this.pieceType = pieceType;
    }
}

/*

Creating a PlayingPiece class that serves as a base class (or superclass) for
PlayingPieceX and PlayingPieceO is a design choice rooted in the principles of object-oriented programming (OOP).
Here are the reasons why this approach is beneficial:

1. Code Reusability and Maintainability:
Shared Attributes and Methods: If PlayingPieceX and PlayingPieceO have any common attributes
(e.g., a piece type or a symbol) or methods (e.g., a method to display the piece),
defining these in the base PlayingPiece class allows both subclasses to inherit these features.
This prevents code duplication and makes maintenance easier.
Consistency: Any change to common functionality needs to be made only in the base class,
ensuring consistent behavior across all playing pieces.


2. Polymorphism:
Polymorphic Behavior: Polymorphism allows objects of different subclasses to be treated
as objects of their superclass. For example, you can write methods that work with
PlayingPiece objects and use them with both PlayingPieceX and PlayingPieceO.
This makes the code more flexible and easier to extend.
Dynamic Binding: This enables you to dynamically bind methods at runtime,
allowing for more dynamic and flexible code.


3. Extensibility:
Adding New Pieces: If you want to add new types of playing pieces in the future
(e.g., PlayingPieceTriangle), you can simply create a new subclass of PlayingPiece.
 The rest of your code that works with PlayingPiece objects will continue to function
 correctly without modification.



Open/Closed Principle: This principle states that software entities should be open
 for extension but closed for modification. Using a base class allows you to extend
  your code with new functionalities without modifying existing code.



4. Abstraction:
Simplifies Complex Systems: The base class can provide an abstract layer,
simplifying the interaction with different types of playing pieces.
For example, you can define an abstract method in PlayingPiece that must be
implemented by all subclasses, ensuring a consistent interface.
 */