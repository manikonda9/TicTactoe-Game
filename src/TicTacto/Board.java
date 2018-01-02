package TicTacto;

public class Board {

	protected char [][] board=new char[3][3]; // represents the board

	 public Board(){
	  
	        for(int i=0;i<=2;i++)
	        {
	          for(int j=0;j<=2;j++)
	         {
	           board[i][j]=' ';
	         }
	       }
	 }

	// display the board after each move
	    public void displayMove()
	    {
	        System.out.println(" _ _ _ __");
	        for(int i=0;i<=2;i++)
	        {
	            System.out.print("|");
	            System.out.print("_");
	            for(int j=0;j<=2;j++)
	            {
	                if(j<2)
	                    System.out.print(board[i][j]+"|_");
	                else
	                    System.out.print(board[i][j]+"|");
	            }
	            System.out.println("");
	        }
	    }

		public boolean isWinning() {
			// TODO Auto-generated method stub
			if(board[0][0]=='X'&&board[0][1]=='X'&&board[0][2]=='X')
				return true;
			else if(board[1][0]=='X'&&board[1][1]=='X'&&board[1][2]=='X')
				return true;
			else if(board[2][0]=='X'&&board[2][1]=='X'&&board[2][2]=='X')
				return true;
			else if(board[0][0]=='X'&&board[1][0]=='X'&&board[2][0]=='X')
			    return true;
			else if(board[0][1]=='X'&&board[1][1]=='X'&&board[2][1]=='X')
				return true;
			else if(board[0][2]=='X'&&board[1][2]=='X'&&board[2][2]=='X')
				return true;
			else if(board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X')
				return true;
			else if(board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X')
				return true;
			
			else if(board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O')
				return true;
			else if(board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O')
				return true;
			else if(board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O')
				return true;
			else if(board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O')
			    return true;
			else if(board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O')
				return true;
			else if(board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O')
				return true;
			else if(board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O')
				return true;
			else if(board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O')
				return true;
			else
			    return false;
		}

		public boolean isDraw() {
			// TODO Auto-generated method stub
			int count=0;
			for(int i=0;i<=2;i++)
	        {
	          for(int j=0;j<=2;j++)
	         {
	           if(board[i][j]=='X'||board[i][j]=='O')
	        	   count++;
	         }
	       }
			if(count==9&&!isWinning())
				return true;
			else
			    return false;
		}

		public void setPlayerMove(Player p, int pos) {
			// TODO Auto-generated method stub
			int r=(pos-1)/3;
			int c=(pos-1)%3;
			board[r][c]=p.getFillValue();
			/*if(pos==1)
				board[0][0]=p.getFillValue();
			if(pos==2)
				board[0][1]=p.getFillValue();
			if(pos==3)
				board[0][2]=p.getFillValue();
			if(pos==4)
				board[1][0]=p.getFillValue();
			if(pos==5)
				board[1][1]=p.getFillValue();
			if(pos==6)
				board[1][2]=p.getFillValue();
			if(pos==7)
				board[2][0]=p.getFillValue();
			if(pos==8)
				board[2][1]=p.getFillValue();
			if(pos==9)
				board[2][2]=p.getFillValue();*/
		}

		public int getWhoIsInPosition(int pos) {
			// TODO Auto-generated method stub
			int r=(pos-1)/3;
			int c=(pos-1)%3;
			//int numb=0;
			if(board[r][c]=='X')
				return 1;
			else if(board[r][c]=='O')
				return 2;
			else
				return 0;
			/*if(pos==1)
			{
				if(board[0][0]=='X')
					numb=1;
				else if(board[0][0]=='O')
					numb=2;
				else
					numb=0;
			}
			if(pos==2)
			{
				if(board[0][1]=='X')
					numb=1;
				else if(board[0][1]=='O')
					numb=2;
				else
					numb=0;
			}
			if(pos==3)
			{
				if(board[0][2]=='X')
					numb=1;
				else if(board[0][2]=='O')
					numb=2;
				else
					numb=0;
			}
			if(pos==4)
			{
				if(board[1][0]=='X')
					numb=1;
				else if(board[1][0]=='O')
					numb=2;
				else
					numb=0;
			}
			if(pos==5)
			{
				if(board[1][1]=='X')
					numb=1;
				else if(board[1][1]=='O')
					numb=2;
				else
					numb=0;
			}
			if(pos==6)
			{
				if(board[1][2]=='X')
					numb=1;
				else if(board[1][2]=='O')
					numb=2;
				else
					numb=0;
			}
			if(pos==7)
			{
				if(board[2][0]=='X')
					numb=1;
				else if(board[2][0]=='O')
					numb=2;
				else
					numb=0;
			}
			if(pos==8)
			{
				if(board[2][1]=='X')
					numb=1;
				else if(board[2][1]=='O')
					numb=2;
				else
					numb=0;
			}
			if(pos==9)
			{
				if(board[2][2]=='X')
					numb=1;
				else if(board[2][2]=='O')
					numb=2;
				else
					numb=0;
			}
			return numb;*/
		}
}
