import java.util.*;

public class TaskC {
    public static void main(String[] args) {
        TreeSet<Integer> rowsNeeded = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            rowsNeeded.add(i);
        }
        int columns = scanner.nextInt();
        int numberOfIterations = scanner.nextInt();
        HashMap<String, Integer> firstRow = new HashMap<>();
        for (int i = 0; i < columns; i++) {
            firstRow.put(scanner.next(), i);
        }
        int[][] table = new int[rows][];
        for (int i = 0; i < rows; i++) {
            table[i] = new int[columns];
            for (int j = 0; j < columns; j++) {
                table[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < numberOfIterations; i++) {
            String columnName = scanner.next();
            String q = scanner.next();
            int value = scanner.nextInt();
            int column;
            column = firstRow.get(columnName);
            ArrayList<Integer> list = new ArrayList<>();
            if (Objects.equals(q, ">")) {
                for (int number : rowsNeeded) {
                    if (table[number][column] <= value) {
                        list.add(number);
                    }
                }
            } else {
                for (int number : rowsNeeded) {
                    if (table[number][column] >= value) {
                        list.add(number);
                    }
                }
            }
            for (int number : list) {
                rowsNeeded.remove(number);
            }
            list.clear();
        }
        int sum = 0;
        for (int number : rowsNeeded
        ) {
            for (int i = 0; i < columns; i++) {
                sum += table[number][i];
            }
        }
        System.out.println(sum);
    }
}
