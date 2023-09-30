public class Main {
    public static final int SIZE = 5;

    public static void print(int[][] field) { //вывод в консоль двумерного массива в виде таблицы
        for (int[] row : field) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pandemic(int[][] field, int[][] agents) {
        for (int[] agent : agents) {
            int x = agent[0];
            int y = agent[1];
            if (field[x][y] == 0) {
                field[x][y] += 1;
            } else field[x][y] *= 2;
        }
        return field;
    }

    public static void main(String[] args) {
        int[][] field = new int[SIZE][SIZE];
        int[][] agents = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};
        int[][] result = pandemic(field, agents);//степень заражения 1, последующий *2
        print(result);
    }
}
