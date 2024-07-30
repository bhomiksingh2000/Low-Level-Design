import Model.*;

import java.util.*;

import com.sun.tools.javac.util.Pair;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame(){
        initializeGame();
    }

    public void initializeGame(){

        players = new LinkedList<>();
        PlayingPiece noughtsPiece= new PlayingPieceO();
        Player player1 = new Player("Lin Dan", noughtsPiece);

        PlayingPiece crossPiece= new PlayingPieceX();
        Player player2 = new Player("Lee Chong Wei", crossPiece);

        gameBoard = new Board(3);

        players.add(player1);
        players.add(player2);
    }

    // create Player

    public String startGame(){
        boolean isWinner = false;

        while(isWinner == false){

            // check which user has its turn
            Player playerChance = players.pollFirst();
            gameBoard.printBoard();

            // check if there is any freeSpace on the board.
            int freeSpaces =  gameBoard.getFreeCells();
            if(freeSpaces == 0){
                isWinner = false;
                break;
            }

            // input the row , column at which the player wants its turn :
            System.out.print("Player:" + playerChance.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // check whether the row , column given by the player is free or not ??
            boolean isFree = gameBoard.checkIsFree(inputRow, inputColumn);

            if(!isFree){
                System.out.println("the position chosen by you is not free , please enter again");
                players.addFirst(playerChance);
            }

            else{
                gameBoard.addPiece(inputRow, inputColumn, playerChance.playingPiece);
                players.addLast(playerChance);

                // check Winner
                isWinner = checkWinner(inputRow, inputColumn, playerChance.playingPiece.pieceType);

                if(isWinner){
                    return playerChance.name;
                }
            }

        }
        System.out.println("Match tied");
        return "tie";
    }

    public boolean checkWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }


}



/*
NOTE :
The error you're encountering is due to the placement of the initialization code outside of any method.
 In Java, code that initializes objects and variables must be placed inside a constructor or a method.
 When you place the code outside of these, Java treats it as instance initialization code,
 which is not correctly interpreted in your context.
 */
