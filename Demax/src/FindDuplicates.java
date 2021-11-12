import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

    protected void findDuplicatesLinearComplexity(int[] inputFirst, int[] inputSecond) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < inputFirst.length && j < inputSecond.length) {
            if (inputFirst[i] < inputSecond[j])
                i++;
            else if (inputSecond[j] < inputFirst[i])
                j++;
            else {
                sb.append(inputSecond[j++]).append(" ");
                i++;
            }
        }

        System.out.println(sb);
    }

    protected void findDuplicatesLinearComplexityWithStreams(List<Integer> inputFirst, List<Integer> inputSecond) {
        Set<Integer> result = inputFirst.stream()
                .distinct()
                .filter(inputSecond::contains)
                .collect(Collectors.toSet());

        System.out.println(result);
    }

    protected void findDuplicatesQuadraticComplexity(int[] inputFirst, int[] inputSecond) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputFirst.length; i++) {
            for (int j = 0; j < inputSecond.length; j++) {
                if (inputFirst[i] == inputSecond[j]) {
                    sb.append(inputFirst[i]).append(" ");
                }
            }
        }

        System.out.println(sb);
    }
}
