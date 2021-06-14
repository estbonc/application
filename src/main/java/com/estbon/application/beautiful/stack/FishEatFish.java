package com.estbon.application.beautiful.stack;

import java.util.Stack;

/**
 * @author liushuaishuai
 * @date 2021/6/13 23:35
 */
public class FishEatFish {

    public static void main(String[] args) {
//        int[] size = new int[]{4, 3, 2, 1, 5};
        int[] size = new int[]{4, 2, 5, 3, 1};
        int[] dir = new int[]{1, 1, 0, 0, 0};
        System.out.println(solution(size, dir));
    }


    public static int solution(int[] fishSize, int[] fishDirection) {
        int fishNum = fishSize.length;
        if (fishNum <= 1) {
            return fishNum;
        }
        Stack<Integer> s = new Stack<>();


        final int left = 0;
        final int right = 1;
        for (int i = 0; i < fishNum; i++) {
            int currentFishSize = fishSize[i];
            int currentFishDirection = fishDirection[i];

            //当前的鱼是否被栈中的鱼吃掉
            boolean hasEat = false;
            while (!s.isEmpty() && fishDirection[s.peek()] == right && currentFishDirection == left) {
                if (fishSize[s.peek()] > currentFishSize) {
                    hasEat = true;
                    break;
                }
                s.pop();
            }
            if (!hasEat) {
                s.push(i);
            }
        }
        return s.size();
    }
}
