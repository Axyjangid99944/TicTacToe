package TicTacToeGame.Factories;

import TicTacToeGame.Models.BotLevel;
import TicTacToeGame.Strategies.bot_playing_strategy.BotPlayingStrategy;
import TicTacToeGame.Strategies.bot_playing_strategy.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotLevel level){
        if(level == BotLevel.EASY){
            return new EasyBotPlayingStrategy();
        }
        else if (level == BotLevel.MEDIUM){
            return new EasyBotPlayingStrategy();
        }
        return null;
    }
}
