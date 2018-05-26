public class Table {

   private int row;
   private int col;
   private boolean [][] sell;
   private String [][] nameSell;


    Table(int row, int col){
        this.setRow(row);
        this.setCol(col);
        sell = new boolean[row][col];
        nameSell = new String[row][col];
        fillGameSell();
        printGameSell();
        printSell();
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        if(row>Variables.ABC.length()){
            this.row = 26;
        }else if(row<1){
            this.row = 1;
        } else{
            this.row = row;
        }

    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        if(col<1){
            this.col = 1;
        }else{
            this.col = col;
        }

    }

    private void fillGameSell(){
        for(int i = 0; i<row ;i++){
            for(int j = 0; j<col;j++){
                nameSell[i][j] = (Variables.ABC.charAt(i)+Integer.toString(j)).toUpperCase();
            }
        }
    }

    private void printGameSell(){
        for(int i = row-1; i>=0 ;i--){
            for(int j = 0; j<col;j++){
                System.out.print(nameSell[i][j] + " ");
            }
            System.out.println();
        }

    }

    private void printSell(){
        for(int i = row-1; i>=0 ;i--){
            for(int j = 0; j<col;j++){
                System.out.print(sell[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void putShip(Ship newShip){
        int maxY;
        int maxX;
        if(newShip.isVertical()){
            maxY = row;
            maxX = col;
        }else{
            maxY = col;
            maxX = row;
        }

        if (isValidShip(newShip)){
               //find random row point
               int y = (int) (Math.random()*(maxY-newShip.getDeck()+1));
               //find random col point
                int x = (int)( Math.random()* maxX);

                for(int i = 0; i < newShip.getDeck();i++){
                    sell[y+i][x] = true;
                }
        }else {
            System.out.println("Invalid Ship");
        }

        printSell();

    }

    private boolean isValidShip(Ship newShip){
        if(newShip.isVertical()) {
            if (newShip.getDeck() > row){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            if (newShip.getDeck() > col){
                return false;
            }
            else{
                return true;
            }
        }
    }







}
