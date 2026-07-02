package ArraysPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Tic_Tac_Toe {
   static char[][] board=new char[3][3];

    static void main() {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
        char player='X';
        while(true){
            printboard();

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the row of the player "+player);
            int row=scanner.nextInt();
            System.out.println("Enter the col of the player "+player);
            int col=scanner.nextInt();
            board[row][col]=player;
            if(playerWin(player)==true){
                System.out.println(player+ " Player is win");
                break;
            }
            printboard();
            if (player == 'X') {
                player='O';
            }else{
                player='X';
            }
        }


    }
    static void printboard(){
        for(char c1[]:board){
            System.out.println("---------");
            for(char c2:c1){
                System.out.print(c2+"|");
            }
            System.out.println();
        }
    }

    static boolean playerWin(char player) {
        //row
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
        }
        //col
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        //cross
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player)return true;
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player)return true;
        return false;
    }
}
