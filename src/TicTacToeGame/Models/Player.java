package TicTacToeGame.Models;

import TicTacToeGame.Pair;

public abstract class Player {
    protected String name;
    protected char symbol;

    public Player(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    abstract Pair<Integer, Integer> makeMove(Board board);

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
