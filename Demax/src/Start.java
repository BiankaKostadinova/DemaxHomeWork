import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        final FindDuplicates findDuplicates = new FindDuplicates();

        int[] arrFirst = {0, 2, 7, 8, 10, 11, 12, 13};
        int[] arrSecond = {0, 6, 9, 10, 15, 16, 17, 18};

        List<Integer> listFirst = Arrays.asList(0, 2, 7, 8, 10, 11, 12, 13);
        List<Integer> listSecond = Arrays.asList(0, 6, 9, 10, 15, 16, 17, 18);

        System.out.println("Linear Complexity");
        findDuplicates.findDuplicatesLinearComplexity(arrFirst, arrSecond);
        System.out.println("Linear Complexity with Streams");
        findDuplicates.findDuplicatesLinearComplexityWithStreams(listFirst, listSecond);
        System.out.println("Quadratic Complexity");
        findDuplicates.findDuplicatesQuadraticComplexity(arrFirst, arrSecond);

    }
}
