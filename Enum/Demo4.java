public class Demo4 {
    public static void main(String[] args) {
        Direction d = Direction.NORTH;

        d.move();

    }

}

enum Direction {
    NORTH {
        @Override
        public void move() {
            System.out.println("Move up (Y + 1)");
        }
    },

    SOUTH {
        @Override
        public void move() {
            System.out.println("Move up (Y - 1)");
        }
    },

    EAST {
        @Override
        public void move() {
            System.out.println("Move up (X + 1)");
        }
    },

    WEST {
        @Override
        public void move() {
            System.out.println("Move up (X - 1)");
        }
    };

    public abstract void move();
}
