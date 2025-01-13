package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MakeSubset {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,4,9));
        List<List<Integer>> res = subsets(list);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }




    }
    static List<List<Integer>> subsets(List<Integer> list) {
        if(list.isEmpty()){
            List<List<Integer>>ans = new ArrayList<>();
            ans.add(Collections.emptyList());
            return ans;
        }
        Integer first = list.get(0);
        List<Integer> rest = list.subList(1, list.size());
        List<List<Integer>> subans = subsets(rest);
        List<List<Integer>> subans2 = insertAll(first,subans);
        return concat(subans,subans2);
    }

    private static List<List<Integer>> concat(List<List<Integer>> subans, List<List<Integer>> subans2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(subans);
        ans.addAll(subans2);
        return ans;
    }

    private static List<List<Integer>> insertAll(Integer first, List<List<Integer>> subans) {
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> sub : subans){
            List<Integer> copy = new ArrayList<>();
            copy.add(first);
            copy.addAll(sub);
            ans.add(copy);
        }

        return ans;
    }
}
