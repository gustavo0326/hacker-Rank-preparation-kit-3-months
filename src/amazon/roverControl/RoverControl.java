package amazon.roverControl;

public class RoverControl {
    public static int row;
    public static int col = 0;
    public static int nElement = 0;
    public static int board[][] = new int[4][4];

    private static int routeRoverControl(String commands) {

        board[0][0] = 0;
        for (char command: commands.toCharArray()) {
            switch (command){
                case 'U':
                    //CODE
                    position(1,board);
                    break;
                case 'D':
                    //CODE
                    position(-1, board);
                    break;
                case 'R':
                    //CODE
                    position(1, board);
                    break;
                case 'L':
                    //CODE
                    position(-1, board);
                    break;
            }
        }
        return 0;
    }

    private static void position(int command, int[][] board) {
        int i=0,j=0;
        if (board[0][0] == 0) {

        }
        while (i<2) {
            while (j<2){
            System.out.print(board[j][i]);
            j++;}
            i++;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        routeRoverControl("URUULLLDDDDRU");

    }


}
