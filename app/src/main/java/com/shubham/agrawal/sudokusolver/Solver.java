package com.shubham.agrawal.sudokusolver;

import java.util.ArrayList;

public class Solver {

    int[][] board;
    ArrayList<ArrayList<Object>> emptyBoxIndex;

    int selected_row;
    int selected_column;

    Solver(){
        selected_column = -1;
        selected_row = -1;
        board = new int[9][9];

        for (int r=0; r<9; r++){
            for (int c=0; c<9; c++){
                board[r][c] = 0;
            }
        }

        emptyBoxIndex = new ArrayList<>();
    }

    private void getEmptyBoxIndexes(){
        for (int r=0; r<9; r++){
            for (int c=0; c<9; c++){
                if (this.board[r][c] == 0){
                    this.emptyBoxIndex.add(new ArrayList<>());
                    this.emptyBoxIndex.get(this.emptyBoxIndex.size() - 1).add(r);
                    this.emptyBoxIndex.get(this.emptyBoxIndex.size() - 1).add(c);
                }
            }
        }
    }

    public void setNumberPos(int num){
        if (this.selected_row != -1 && this.selected_column != -1){
            if (this.board[this.selected_row-1][this.selected_column-1] == num){
                this.board[this.selected_row-1][this.selected_column-1] = 0;
            }
            else{
                this.board[this.selected_row-1][this.selected_column-1] = num;
            }
        }
    }

    public ArrayList<ArrayList<Object>> getEmptyBoxIndex(){
        return this.emptyBoxIndex;
    }

    public int[][] getBoard() {
        return this.board;
    }

    public int getSelectedRow() {
        return this.selected_row;
    }

    public int getSelectedColumn() {
        return this.selected_column;
    }

    public void setSelectedRow(int selected_row) {
        this.selected_row = selected_row;
    }

    public void setSelectedColumn(int selected_column) {
        this.selected_column = selected_column;
    }

}
