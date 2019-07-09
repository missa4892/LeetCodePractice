import java.util.Arrays;
import java.util.List;

public class HighestPopulationBirthYear {
    public static void main(String[] args){

        People a = new People(1926, 2000);
        People b = new People(1708, 2009);
        People c = new People(1939, 1997);
        People d = new People(1956, 2000);
        People e = new People(1979, 2001);
        People f = new People(2005, 2098);
        People g = new People(1606, 1956);


        System.out.println(highestBirthYear(Arrays.asList(a, b, c, d, e, f, g)));
    }

    private static int highestBirthYear(List<People> peopleList) {

        int minBirthYear = getMinYear(peopleList);
        int maxBirthYear = getMaxYear(peopleList);

        int[] arrCount = new int[maxBirthYear-minBirthYear+1];

        for (People person : peopleList) {

            int birthIndex = person.birthYear - minBirthYear;
            arrCount[birthIndex]++;

            if(person.deathYear <= maxBirthYear){
                int deathIndex = person.deathYear - minBirthYear;
                arrCount[deathIndex]--;
            }
        }

        int maxRunningSum = 0;
        int runningSum = 0;
        int peakAliveYear = -1;
        for (int i = 0; i < arrCount.length; i++) {
            runningSum += arrCount[i];
            if(runningSum > maxRunningSum){
                maxRunningSum = runningSum;
                peakAliveYear = i;
            }
        }

        return peakAliveYear + minBirthYear;
    }

    private static int getMaxYear(List<People> peopleList) {
        int maxYear = Integer.MIN_VALUE;
        for(People person : peopleList){
            if(person.birthYear > maxYear){
                maxYear = person.birthYear;
            }
        }
        return maxYear;
    }

    private static int getMinYear(List<People> peopleList) {
        int minYear = Integer.MAX_VALUE;
        for(People person : peopleList){
            if(person.birthYear < minYear){
                minYear = person.birthYear;
            }
        }
        return minYear;
    }

    private static class People {
        int birthYear;
        int deathYear;

        public People(int birthYear, int deathYear) {
            this.birthYear = birthYear;
            this.deathYear = deathYear;
        }
    }
}
