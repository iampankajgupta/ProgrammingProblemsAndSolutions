package Test;

import LinkedList.ListNode;

import java.util.*;

public class NMeetingInaRoom {
    static class Pair{
        int start;
        int end;
        Pair(int start,int end){
            this.start = start;
            this.end = end;
        }

    }
    public static void main(String[] args) {
        int[]start = {10, 12, 20};
        int[] end = {20, 25, 30};
        int maxMeeting = helper(start,end,start.length);
        System.out.println(maxMeeting);
    }

    public static int helper(int[]start,int[]end,int n){
        List<Pair>list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(new Pair(start[i],end[i]));
        }
        Collections.sort(list,(Pair a,Pair b)->a.end-b.end);

        int maxMeeting = 1;
        boolean firstTime = true;
        int first = list.get(0).start;
        int second = list.get(0).end;
        for(Pair p :list){
            if(!firstTime){
                if(p.start>second){
                    maxMeeting++;
                    second = p.end;
                }
            }else firstTime = false;
        }
        return maxMeeting;

    }


}
