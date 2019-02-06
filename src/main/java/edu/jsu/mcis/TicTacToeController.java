package edu.jsu.mcis;

public class TicTacToeController implements ActionListener {

    private final TicTacToeModel model;
    private final TicTacToeView view;
    
    /* CONSTRUCTOR */

    public TicTacToeController(int width) {
        
        /* Initialize model, view, and width */

        model = new TicTacToeModel(width);
        view = new TicTacToeView();
        
    }

    public void start() {
    
        /* MAIN LOOP (repeats until game is over) */

        /* Display the board using the View's "showBoard()", then use
           "getNextMove()" to get the next move from the player.  Enter
           the move (using the Model's "makeMark()", or display an error
           using the View's "showInputError()" if the move is invalid. */
        
        if(model.isGameover() == true){
            view.disableSquares();
            view.showResult(model.getResult());
        }
    
        
        /* After the game is over, show the final board and the winner */


        
    }
    public String getMarkAsString(int row, int col) {        
        return (model.getMark(row, col).toString());        
    }
    
    public TicTacToeView getView() {        
        return view;        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton buttonClicked = (JButton)e.getSource();
        model.makeMark(buttonClicked.row,buttonClicked.col)
        view.updateSquares();
        }
    }

}
