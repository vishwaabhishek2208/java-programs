public class MDarrays {
    public static void main(String[] args) {
        // Multi dimensional arrays

        // int[][] marks = new int[3][3];
        // marks[0][0] = 20;
        // marks[0][1] = 30;
        // marks[0][2] = 40;

        // marks[1][0] = 25;
        // marks[1][1] = 35;
        // marks[1][2] = 45;

        // marks[2][0] = 22;
        // marks[2][1] = 32;
        // marks[2][2] = 42;

        // for (int rows = 0; rows < marks.length; rows++) {
        // for (int col = 0; col < marks[rows].length; col++) {
        // System.out.print(marks[rows][col] + " ");
        // }
        // System.out.println();
        // }

        // Multi dimensional array --> each with different length

        int[][] marks = new int[3][];

        marks[0] = new int[1];
        marks[1] = new int[2];
        marks[2] = new int[3];

        marks[0][0] = 23;

        marks[1][0] = 25;
        marks[1][1] = 30;

        marks[2][0] = 30;
        marks[2][1] = 40;
        marks[2][2] = 50;

        for (int rows = 0; rows < marks.length; rows++) {
            for (int col = 0; col < marks[rows].length; col++) {
                System.out.print(marks[rows][col] + " ");
            }
            System.out.println();
        }

    }

}
