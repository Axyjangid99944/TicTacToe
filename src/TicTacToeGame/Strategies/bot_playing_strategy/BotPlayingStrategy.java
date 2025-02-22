package TicTacToeGame.Strategies.bot_playing_strategy;

import TicTacToeGame.Models.Board;
import TicTacToeGame.Pair;

public interface BotPlayingStrategy {
    public Pair<Integer, Integer> makeMove(Board board);
}
