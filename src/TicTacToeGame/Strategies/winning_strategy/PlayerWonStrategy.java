package TicTacToeGame.Strategies.winning_strategy;

import TicTacToeGame.Models.Cell;

public interface PlayerWonStrategy {

    boolean checkIfWon(Cell cell);
}
