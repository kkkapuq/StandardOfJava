package Chapter9.Excercise;

import java.util.*;

class Solution {
    public long getSum(int[] arr){
        long answer = 0;
        for(int i : arr){
            answer += (long) arr[i];
        }
        return answer;
    }

    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Deque<Long> q1 = new ArrayDeque<Long>();
        Deque<Long> q2 = new ArrayDeque<Long>();

        for(int i = 0; i < queue1.length; i++){
            q1.offer((long)queue1[i]);
            q2.offer((long)queue2[i]);
        }

        long sum1 = getSum(queue1);
        long sum2 = getSum(queue2);

        while(true){
            if(sum1 > sum2){
                long temp = q1.poll();
                sum1 -= temp;
                sum2 += temp;
                answer++;
                q2.offer(temp);
            } else if(sum1 < sum2){
                long temp = q2.poll();
                sum1 += temp;
                sum2 -= temp;
                answer++;
                q1.offer(temp);
            } else {
                break;
            }
            if(answer == queue1.length * 2){
                return -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution temp = new Solution();
        temp.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1});
    }
}
