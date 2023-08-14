class MySpecialNumberException extends Exception {
    public MySpecialNumberException(String message) {
        super(message);
    }
}

public class Main {
    static void myfunc(int x) throws MySpecialNumberException {
        if (x == 10 || x == 20 || x == 30) {
            String errorMessage = "MySpecialNumberException: Cannot use " + x + " in myfunc";
            throw new MySpecialNumberException(errorMessage);
        }
    }

    public static void main(String[] args) {
        int[] inputs = {10, 15, 20,25, 30,35,40 };

        for (int input : inputs) {
            try {
                myfunc(input);
                System.out.println("myfunc(" + input + ") executed successfully.");
            } catch (MySpecialNumberException e) {
                System.err.println("Exception caught: " + e.getMessage());
            } finally {
                System.out.println("Cleaning up after myfunc(" + input + ")");
            }
        }
    }
}
