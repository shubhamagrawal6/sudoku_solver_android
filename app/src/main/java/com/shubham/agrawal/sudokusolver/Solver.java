package com.shubham.agrawal.sudokusolver;

public class Solver {

    private static int selected_row;
    private static int selected_column;

    Solver(){
        selected_column = -1;
        selected_row = -1;
    }

    public int getSelectedRow() {
        return selected_row;
    }

    public int getSelectedColumn() {
        return selected_column;
    }

    public void setSelectedRow(int selected_row) {
        Solver.selected_row = selected_row;
    }

    public void setSelectedColumn(int selected_column) {
        Solver.selected_column = selected_column;
    }

}
