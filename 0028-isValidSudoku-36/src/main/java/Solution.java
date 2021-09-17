import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set> rows = new ArrayList<>();
        List<Set> columns = new ArrayList<>();
        Set<Character> small;
        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<String>());
            columns.add(new HashSet<String>());
        }
        for (int i = 0; i < 9; i++) {
            small= new HashSet<>();
            for (int j = 0; j < 3; j++) {
                int row = (i/3)*3+j;
                for (int k = 0; k < 3; k++) {
                    int column = (3*i)%9+k;
                    if(board[row][column]=='.'){
                        continue;
                    }
                    if(small.contains(board[row][column])){
                        return false;
                    }
                    if(rows.get(row).contains(board[row][column])){
                        return false;
                    }
                    if(columns.get(column).contains(board[row][column])){
                        return false;
                    }
                    small.add(board[row][column]);
                    rows.get(row).add(board[row][column]);
                    columns.get(column).add(board[row][column]);
                }
            }
        }
        return true;
    }
}
