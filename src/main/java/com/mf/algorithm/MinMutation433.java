package com.mf.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class MinMutation433 {
    public static void main(String[] args) {
        MinMutation433 minMutation433 = new MinMutation433();
        int result = minMutation433.minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"});
        System.out.println(result);
    }

    public int minMutation(String start, String end, String[] bank) {
        HashMap<String, Integer> depth = new HashMap<>();
        depth.put(start, 0);
        HashSet<String> hashBank = new HashSet<>(Arrays.asList(bank));

        if (!hashBank.contains(end)) return -1;

        LinkedList<String> queue = new LinkedList<>();
        queue.offer(start);
        char [] gene = new char[]{'A','C','G','T'};
        while (!queue.isEmpty()){
            String s = queue.poll();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 4; j++) {
                  if (s.charAt(i) != gene[j]) {
                      String ns = s.substring(0, i) + gene[j] + s.substring(i+1);
                      if(!hashBank.contains(ns)) continue;
                      if(depth.containsKey(ns)) continue;//判重
                      depth.put(ns, depth.get(s) + 1);
                      queue.add(ns);
                      if(ns.equals(end)){
                          return depth.get(ns);
                      }

                  }
                }
            }
        }

        return -1;
    }
}
