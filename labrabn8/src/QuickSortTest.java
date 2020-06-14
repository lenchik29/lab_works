import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    QuickSort qSort = new QuickSort();
    @Test
    public void simpleTest() {
        int[] sourceArr = {57, 4, 3, 8, 3};
        int[] expectedArr = {3, 3, 4, 8, 57};
        qSort.sort(sourceArr);
        assertArrayEquals(expectedArr, sourceArr);
    }

    @Test
    public void emptyTest() {
        int[] sourceArr = new int[0];
        int[] expectedArr = new int[0];

        qSort.sort(sourceArr);
        assertArrayEquals(expectedArr, sourceArr);
    }

    @Test
    public void reverseTest() {
        int n = 300;
        int[] Arr = new int[n];
        int[] expected = new int[n];

        for (int i = 0; i < n; i++) {
            Arr[i] = (n - 1) - i;
            expected[i] = i;
        }

        qSort.sort(Arr);
        assertArrayEquals(expected, Arr);
    }

    @Test
    public void sortedTest() {
        int n = 300;
        int[] sourceArr = new int[n];
        int[] expectedArr = new int[n];

        for (int i = 0; i < n; i++) {
            sourceArr[i] = i;
            expectedArr[i] = i;
        }

        qSort.sort(sourceArr);
        assertArrayEquals(expectedArr, sourceArr);
    }

    @Test
    public void stressTestOne() {
        check(generate(1000));
    }

    @Test
    public void stressTestTwo() {
        check(generate(100000));
    }

    @Test
    public void stressTestThree() {
        check(generate(1000000));
    }

    private void check(int[] sourceArr) {
        qSort.sort(sourceArr);

        for (int i = 0; i < sourceArr.length - 1; i++) {
            assertTrue(sourceArr[i] <= sourceArr[i + 1]);
        }
    }

    private int[] generate(int length) {
        int[] arr = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }
}
