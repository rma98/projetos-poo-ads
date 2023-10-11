package pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecimalToBinaryConverter {
	public static String decimalToBinary(int decimalNum) {
		Deque<Integer> stack = new ArrayDeque<>();

        while (decimalNum > 0) {
            int restante = decimalNum % 2;
            stack.push(restante);
            decimalNum /= 2;
        }

        StringBuilder binaryRepresentation = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryRepresentation.append(stack.pop());
        }

        return binaryRepresentation.toString();
    }

    public static void main(String[] args) {
        int num1 = 42;
        int num2 = 123;

        String binario1 = decimalToBinary(num1);
        String binario2 = decimalToBinary(num2);

        System.out.println("Representação em binário de " + num1 + ": " + binario1);
        System.out.println("Representação em binário de " + num2 + ": " + binario2);
    }
}
