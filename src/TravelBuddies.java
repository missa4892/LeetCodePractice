import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Solution {
    public static void main(String[] args) {
        String me = "me,Amsterdam,Barcelona,London,Prague";
        String buddies = "u1,Amsterdam,Barcelona,London,Prague\n" +
                "u2,Shanghai,Hong Kong,Moscow,Sydney,Merlbourne\n" +
                "u3,London,Bostor,Amsterdam,Madrid\n" +
                "u4,Barcelona,Prague,London,Sydney,Moscow";

        List<String> result = travelBuddies(me, buddies);

        for (String string : result) {
            System.out.println(string);
        }
    }

    static List<String> travelBuddies(String me, String buddies) {
        String[] meList = me.split(",");
        Set<String> myCities = new HashSet<>();  // NUMBER ME CITIES

        for(int i = 1; i < meList.length; i++) {
            myCities.add(meList[i]);
        }

        Map<String, Integer> userMap = new TreeMap<>();  //NUMBER OF USERS

        List<String[]> buddyList = splitBuddy(buddies);  //NUM OF USERS


        for(int i = 0; i < buddyList.size(); i++) {
            String[] userCities = buddyList.get(i);
            int count = 0;
            for(int j = 0; j < userCities.length; j++) {
                if (j == 0) {
                    userMap.put(userCities[0], 0);
                }
                if(myCities.contains(userCities[j])) {
                    count++;
                }
            }
            userMap.put(userCities[0], count);
        }

        int judgingMeter = (myCities.size() + 1) / 2;

        List<String> result = new ArrayList<>();
        for (Map.Entry<String,Integer> entry : userMap.entrySet()) {
            if (entry.getValue() >= judgingMeter) {
                result.add(entry.getKey());
            }
        }

        return result;
    }


    /*
    "u1,Amsterdam,Barcelona,London,Prague\n
    u2,Shanghai,Hong Kong,Moscow,Sydney,Merlbourne\n
    u3,London,Bostor,Amsterdam,Madrid\n
   u4,Barcelona,Prague,London,Sydney,Moscow"
    */
    static List<String[]> splitBuddy(String buddiesString) {
        String[] buddyList = buddiesString.split("\n");

        List<String[]> result = new ArrayList<>();
        for(String buddy : buddyList) {
            String[] split = buddy.split(",");
            result.add(split);
        }

        return result;
    }
}


/* 
Your previous Plain Text content is preserved below:

"me,Amsterdam,Barcelona,London,Prague"

 "u1,Amsterdam,Barcelona,London,Prague\n
 u2,Shanghai,Hong Kong,Moscow,Sydney,Merlbourne\n
 u3,London,Bostor,Amsterdam,Madrid\n  
u4,Barcelona,Prague,London,Sydney,Moscow"

travel buddy is a user who has 50% or more cities in common with you 

output:
u1
u4
u3

// map<String, Integer> buddy: => u1: 4, u2: 0, u3: 2, u4: 3

 */