package edu.jsu.mcis;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TicTacToeController implements ActionListener {

    private final TicTacToeModel model;
    private final TicTacToeView view;   
    String[] num;     
    int row;
    int col;


    
    /* CONSTRUCTOR */

    public TicTacToeController(int width) {
        
        /* Initialize model, view, and width */

        model = new TicTacToeModel(width);
        view = new TicTacToeView(this, width);
        
    }

    public void start() {
    
        /* MAIN LOOP (repeats until game is over) */

        /* Display the board using the View's "showBoard()", then use
           "getNextMove()" to get the next move from the player.  Enter
           the move (using the Model's "makeMark()", or display an error
           using the View's "showInputError()" if the move is invalid. */
        
        if(model.isGameover() == true){
            view.disableSquares();
            view.showResult(model.getResult().toString());
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
        String text = ((JButton) event.getSource()).getText();
        text = text.replaceAll("([a-z","");
        num =text.split("");
        row = Integer.parseInt(num[0]);
        col = Integer.parseInt(num[1]);

        model.makeMark(row ,  col);
        view.updateSquares();
        }
    }


