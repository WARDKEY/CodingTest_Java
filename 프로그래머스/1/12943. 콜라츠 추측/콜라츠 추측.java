class Solution {
    public int solution(int num) {
        int number = num;

        if (num == 1) {
            return 0;
        }

        for (int i = 0; i < 400; i++) {
            if (number == 1) {
                return i;
            }

            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
        }

        return -1;
    }
}