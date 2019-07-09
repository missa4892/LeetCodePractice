import java.util.HashMap;
import java.util.Map;

public class TicketingBooth {

    public static void main(String[] args) {

        int[] ticketingQueue = {25, 25, 50, 50, 75, 100, 100};
        System.out.println(isValidTicketingQueue(ticketingQueue));
    }

    private static boolean isValidTicketingQueue(int[] ticketingQueue) {

        Map<Integer, Integer> boothBank = new HashMap<>();

        for (int incomingTicket : ticketingQueue) {

            if(shouldBeAddedToBank(incomingTicket)){
                addToBank(boothBank, incomingTicket);
            }
            if (incomingTicket > 25) {
                if(!returnChangeFor(boothBank, incomingTicket)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean shouldBeAddedToBank(int incomingTicket) {
        int[] possibleNotes = {25, 50, 100};
        for(int note : possibleNotes) {
            if (note == incomingTicket) {
                return true;
            }
        }
        return false;
    }

    private static boolean returnChangeFor(Map<Integer, Integer> boothBank, int incomingTicket) {

        int changeToBeGiven = incomingTicket - 25;
        int numOfTwentyFives = changeToBeGiven / 25;

        int twentyFiveGiven = 0;
        for (int i = 0; i < numOfTwentyFives; i++) {
            if(canReturnDirectly(boothBank, changeToBeGiven)){
                if(twentyFiveGiven > 0){
                    removeFromBank(boothBank, (25*twentyFiveGiven));
                }
                if(removeFromBank(boothBank, changeToBeGiven)){
                    addToBank(boothBank, 25);
                    return true;
                }
                return false;
            } else {
                if(boothBank.containsKey(25) && boothBank.get(25) > 0){
                    twentyFiveGiven++;
                    changeToBeGiven -= 25;
                }
            }
        }
        return false;
    }

    private static boolean canReturnDirectly(Map<Integer, Integer> boothBank, int changeToBeGiven) {
        int[] possibleNotes = {25, 50, 100};
        for(int note : possibleNotes){
            if(note == changeToBeGiven){
                if(boothBank.containsKey(changeToBeGiven) && boothBank.get(changeToBeGiven) > 0){
                    return true;
                }
            }
        }
        return false;
    }



    private static boolean removeFromBank(Map<Integer, Integer> boothBank, int incomingTicket) {
        if(boothBank.containsKey(incomingTicket)){
            int currentCount = boothBank.get(incomingTicket);
            currentCount--;
            boothBank.put(incomingTicket, currentCount);
            return true;
        }
        return false;
    }

    private static void addToBank(Map<Integer, Integer> boothBank, int incomingTicket) {
        if(boothBank.containsKey(incomingTicket)){
            int currentCount = boothBank.get(incomingTicket);
            currentCount++;
            boothBank.put(incomingTicket, currentCount);
        } else {
            boothBank.put(incomingTicket, 1);
        }
    }
}
