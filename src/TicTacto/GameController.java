package TicTacto;

import java.util.Scanner;

public class GameController {

    private Board board;
    private Player winnerOfGame;
    
    // represents the current state of the game
    public enum StateOfGame
    {
        Playing,GameOver;
    }
     private StateOfGame currentState;
    
    public GameController()
    {
        board=new Board(); 
    }
    
    public void setWinnerOfGame(Player player)
    {
        this.winnerOfGame=player;
    }
    
    public Player getWinnerOfGame()
    {
        return this.winnerOfGame;
    }
    
    
    public void startTheGame()
    {
        currentState=StateOfGame.Playing;
        
        // creates two Player instances
        Player player1=new Player();
        Player player2=new Player();
        
        Player currentPlayer;
        currentPlayer=player1; //player 1 is first player to make a move
        
        // set attributes of players
        player1.setFillValue('X');
        player2.setFillValue('O');
        
        
        /*
         * game starts from here 
         * and goes on untill any one of the player wins the game
         * or it is draw
         */
        board.displayMove(); 
        do
        {
            setMoveOfPlayer(currentPlayer); 
            board.displayMove();           
            updateTheGame(board,currentPlayer);
            currentPlayer=switchThePlayer(currentPlayer,player1,player2);
        }while(currentState==StateOfGame.Playing); 
        
        if(board.isWinning())
          System.out.println("Game Over,Winner is: "+this.getWinnerOfGame().getFillValue());
        else if(board.isDraw())
            System.out.println("Game Over, it's a draw");
           
    }
     
    public void setMoveOfPlayer(Player player)
    {
          Scanner scanner=new Scanner(System.in);
          int pos;
          do
          {
             System.out.println("The turn of: "+player.getFillValue()); //displays whose turn is this
             pos=scanner.nextInt(); // accept position as input from player
          }while(!isValidMove(pos));
          board.setPlayerMove(player, pos);  // set the move to board 
    }
    
    // this method checks and update the current status of game.
    public void updateTheGame(Board board,Player player)
    {
        if(board.isWinning())     // if board is showing winning situation
        {
            currentState=StateOfGame.GameOver;
            this.setWinnerOfGame(player);
        }
        else if(board.isDraw())    // if board is showing draw situation
        {
            currentState=StateOfGame.GameOver;
        }
            
    }
    
    
    public Player switchThePlayer(Player currentPlayer,Player player1,Player player2)
    {
        if(currentPlayer==player1) // if player 1 has made a move now it is turn of player 2
            currentPlayer=player2;
        
        else if(currentPlayer==player2)
            currentPlayer=player1;
        
        return currentPlayer;
    }
    
    
    private boolean isValidMove(int pos)
    {
        boolean isvalid=true;
        // checks that the position on which player is making a move should be empty.
        if(board.getWhoIsInPosition(pos)!=0) 
            isvalid=false;
        return isvalid;
    }
}
