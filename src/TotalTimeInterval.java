public class TotalTimeInterval {
    public static void main(String[] args){

//        List<TimeRange> ranges = new ArrayList<>();
//        ranges.add(new TimeRange(1, 4));
//        ranges.add(new TimeRange(2, 4));
//        ranges.add(new TimeRange(6, 8));
//        ranges.add(new TimeRange(7, 9));
//        ranges.add(new TimeRange(10, 15));
//
//
//        System.out.println(totalTime(ranges));

        int [] fromList = {1, 2, 6, 7, 10};
        int [] toList =   {4, 4, 8, 9, 15};

        System.out.println(totalTime(fromList, toList));
    }

    private static int totalTime(int[] fromList, int[] toList) {
        int counter = 0;
        int start = 0;
        int totalRange = 0;

        for (int i = 0, j = 0; i < fromList.length && j < toList.length;) {
            if(fromList[i] <= toList[j]){

                if(counter == 0){
                    start = fromList[i];
                }
                counter++;
                i++;
            } else {
                counter--;
                if(counter == 0){
                    totalRange += (toList[j] - start);
                }
                j++;
            }
        }
        totalRange += toList[toList.length -1] - start;
        return totalRange;
    }

    /*
         <->
       <----->
     0 1 2 3 4 5 6

    counter = 0
    start = 10
    totalRange = 6 + 5
                           >
    fromList: [1, 2, 6, 7, 10]
                           >
    endList:  [4, 4, 8, 9, 15]
    */
//    private static long totalTime(List<TimeRange> ranges) {
//
//        HashMap<Integer, Boolean> intervalMap = new HashMap<>();
//
//        for (int i = 0; i < ranges.size(); i++) {
//            TimeRange timeRange = ranges.get(i);
//            int fromVal = timeRange.fromVal;
//            int toVal = timeRange.toVal;
//            int currentIndex = fromVal;
//            while(currentIndex < toVal){
//                if(!intervalMap.containsKey(currentIndex)){
//                    intervalMap.put(currentIndex, true);
//                }
//                currentIndex++;
//            }
//        }
//
//        return intervalMap.entrySet().stream().map(Map.Entry::getValue).count();
//
//    }

    private static class TimeRange {
        public int fromVal;
        public int toVal;

        public TimeRange(int fromVal, int toVal) {
            this.fromVal = fromVal;
            this.toVal = toVal;
        }
    }
}
