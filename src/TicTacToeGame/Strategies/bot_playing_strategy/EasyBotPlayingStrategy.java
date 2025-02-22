package TicTacToeGame.Strategies.bot_playing_strategy;

import TicTacToeGame.Models.Board;
import TicTacToeGame.Models.Cell;
import TicTacToeGame.Pair;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Pair<Integer, Integer> makeMove(Board board) {
        for(List<Cell> row: board.getGrid()){
            for(Cell cell: row){
                if(cell.isEmpty()){
                    return new Pair<>(cell.getX(), cell.getY());
                }
            }
        }
        return null;
    }
}
