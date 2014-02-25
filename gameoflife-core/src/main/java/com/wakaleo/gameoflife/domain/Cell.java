package com.wakaleo.gameoflife.domain;

/*comment entered for git testing purposes
 * commit 1*/
/*commit 2 ^*/
/*commit 3 ^*/
/*commit 4 ^*/
/*commit 5 ^*/
/*commit 6 - trying with many projects*/
/*commit 7 ^*/
/*commit 8 ^*/
/*commit 9 ^*/
/*commit 10.1 ^*/
/*commit phase 2.0 - bug fix found */
public enum Cell {
    LIVE_CELL("*"), DEAD_CELL(".");

    private String symbol;

    private Cell(final String initialSymbol) {
        this.symbol = initialSymbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    static Cell fromSymbol(final String symbol) {
        Cell cellRepresentedBySymbol = null;
        for (Cell cell : Cell.values()) {
            if (cell.symbol.equals(symbol)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }
        return cellRepresentedBySymbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
