package com.company;

import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int majorityNumber = 0;

        HashMap<Integer, Integer> numbersMap = new HashMap<>();

        for (int num : nums) {
            if (numbersMap.get(num) == null) {
                numbersMap.put(num, 1);
            } else {
                numbersMap.put(num, numbersMap.get(num) + 1);
            }
        }

        for (int num : numbersMap.keySet()) {
            if (numbersMap.get(num) > (nums.length / 2)) {
                majorityNumber = num;
            }
        }

        return majorityNumber;

    }

}
