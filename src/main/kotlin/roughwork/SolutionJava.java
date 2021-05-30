package roughwork;

public class SolutionJava {
    public int hammingWeight(int n) {
        int num = n;
        int setBitCount = 0;
        while (num > 0) {
            if ((num & 1) == 0) setBitCount++;
            num >>= 1;

        }
        return setBitCount;
    }

}
