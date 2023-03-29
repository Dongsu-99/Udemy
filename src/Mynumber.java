public class Mynumber {

    private int number;

    public Mynumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0)
                return false;

        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = i + sum;
        }
        return sum;
    }


    public int sumOfDivisors() {
        // 입력값이 6 이면 ,6의 약수중 1과 6을 제외한 숫자의 합 구하기
        int sum = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public void printNumberTriangle() {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }
}

