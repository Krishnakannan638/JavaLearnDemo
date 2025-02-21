package BasicMath;

public class basicMath {

    public int countDigit(int val) {
        int count = 0;
        while (val != 0) {
            count++;
            val /= 10;
        }
        return count;
    }
}
