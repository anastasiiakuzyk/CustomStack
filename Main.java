import java.util.Random;

// Реалізувати стек на основі масиву, виконати завдання (Створити стек цілих чисел. Обчислити добуток елементів стеку, які менші 5)
// Потім реалізувати стек на основі зв’язаного списку і теж виконати завдання.

public class Main {
    public static void main(String[] args) {
        System.out.println("Array stack: ");
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        multiplyElementSmallerThanFive(arrayStack, 20);
        System.out.println("\nList stack: ");
        ListStack<Integer> listStack = new ListStack<>();
        multiplyElementSmallerThanFive(listStack, 20);
    }

    public static void multiplyElementSmallerThanFive(Stackable<Integer> stack, int amountOfNumbers) {

        // Filling array stack with random numbers
        for (int i = 0; i < amountOfNumbers; i++) {
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
