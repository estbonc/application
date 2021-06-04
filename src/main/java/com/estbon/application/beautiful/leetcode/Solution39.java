package com.estbon.application.beautiful.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liushuaishuai
 * @date 2021/5/26 14:18
 */
public class Solution39 {


    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        int[] arr = new int[]{2, 3, 4, 7};
        int target = 7;
        solution39.combinationSum(arr, target);
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(combine));
            return;
        }
        // 直接跳过
        dfs(candidates, target, ans, combine, idx + 1);
        // 选择当前数
        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }
}
