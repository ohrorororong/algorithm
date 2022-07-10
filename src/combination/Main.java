package combination;

public class Main {
    private static int getCombination(int n, int r) {
        int nResult = 1;
        for (int i = n; i > n - r; i--) { // nPr
            nResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }
        return nResult / rResult;
    }

    public static void main(String[] args) {
        // 1. 조합
        System.out.println("== 조합 ==");
        int n = 4, r = 2;
        System.out.println("결과 : " + getCombination(4, 2));

        // 2. 중복 조합합
        System.out.println("== 중복 조합 ==");
        n = 2;
        r = 3;
        System.out.println("결과 : " + getCombination((n + r - 1), r));
    }
}

