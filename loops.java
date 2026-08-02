public class loops {
    public static void main(String[] args) {
        int i = 1; // 1 to 10

        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        // complicated method

        // Loops 1. while --> infinite
        /*
         * while(expression){
         * // do something
         * }
         */
        while (i < 10) { // boolen --> True/False
            System.out.println(i);
            i++;
        }
        // Loops 2. do-while
        /*
         * do {
         * // do something
         * } while(expression)
         * 
         */

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // Menu ite selection --> do-while
        /*
         * 1. Play game
         * 2. Return to saved game
         * 3. Exit
         * 
         */

        // 1 to 10

        for (i = 1; i <= 10; i++) {// boolean --> True/False
            System.out.println(i);
        }

        for (i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        /*
         * FLow of control of for
         * 1. First assignment statement is executed (Variable definition).
         * 2. Then second conditional statement is evaluated. (True / false)
         * 3. If true, control flow will evaluate the body of the loop.
         * 4. Once loop body is finished, control flow will go back to the for
         * statement, and ithird increment
         * statement will be evaluated.
         * 5. Again, conditional statement is evaluated.
         * 6. Repeat 2 - 5.
         */
    }
}
