import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Projects {
    public static void pEighteen(int[] votes) {
        int candidateOneVoteCount = 0;
        int candidateTwoVoteCount = 0;
        int candidateThreeVoteCount = 0;
        int candidateFourVoteCount = 0;
        int candidateFiveVoteCount = 0;
        int spoiltBallotCount = 0;

        for (var vote: votes) {
            switch (vote) {
                case 1:
                    candidateOneVoteCount++;
                case 2:
                    candidateTwoVoteCount++;
                case 3:
                    candidateThreeVoteCount++;
                case 4:
                    candidateFourVoteCount++;
                case 5:
                    candidateFiveVoteCount++;
                default:
                    spoiltBallotCount++;
            }
        }

        System.out.println("Candidate one got: " + candidateOneVoteCount + " votes.");
        System.out.println("Candidate two got: " + candidateTwoVoteCount + " votes.");
        System.out.println("Candidate three got: " + candidateThreeVoteCount + " votes.");
        System.out.println("Candidate four got: " + candidateFourVoteCount + " votes.");
        System.out.println("Candidate five got: " + candidateFiveVoteCount + " votes.");
        System.out.println(spoiltBallotCount + " votes were spoilt.");
    }

    public static void pTwenty() {
        for (int i = 5; i <= 100; i += 5) {
            var matchingDays = 0;
            for (int j = 1; j <= 1000; j++) {
                HashSet<Integer> set = new HashSet<Integer>();
                for (int x = 1; x <= i; x++) {
                    Random random = new Random();
                    int bd = random.nextInt(365);
                    if (set.contains(bd)) {
                        matchingDays++;
                        break;
                    } else {
                        set.add(bd);
                    }
                }
            }
            double prob = (double)matchingDays/1000;
            System.out.println("Probablity for matching pair for " + i + " people is " + prob);
        }
    }
}
