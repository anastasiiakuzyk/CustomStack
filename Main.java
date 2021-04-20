import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array stack: ");
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        task1(arrayStack);
        System.out.printf("%n%nList stack: %n");
        ListStack<Integer> listStack = new ListStack<>();
        task1(listStack);
    }

    public static void task1(Stackable<Integer> stack) {

        // Filling array stack with random numbers
        for (int i = 0; i < 20; i++) {
            stack.push(getRandomNumber(1, 10));
        }

        System.out.println("Stack:");
        System.out.println(stack);
        int mul = 1;
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num < 5) {
                mul *= num;
            }
        }
        System.out.printf("Multiply of numbers than less then 5 in stack is: %d%n", mul);
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
