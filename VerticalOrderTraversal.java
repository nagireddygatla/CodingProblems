package com.cox.interview.service;

import java.util.*;

public class VerticalOrderTraversal {

    public List<List<Integer>> verticalOrder(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> verticalOrder = new LinkedList<>();
        Map<Integer,List<Integer>> map = new TreeMap<>();
        if(root==null)return list;
        queue.offer(root);
        verticalOrder.offer(0);

        while(!queue.isEmpty()){

            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = queue.remove();
                int order = verticalOrder.remove();

                map.computeIfAbsent(order,k -> new ArrayList<>()).add(temp.val);

                if(temp.left!=null){

                    queue.offer(temp.left);
                    verticalOrder.offer(order -1);
                }

                if(temp.right!=null){

                    queue.offer(temp.right);
                    verticalOrder.offer(order +1);
                }
            }


        }
        list.addAll(map.values());
        return list;

    }




    public static void main(String args []){
        LevelOrderTraversal obj = new LevelOrderTraversal();
        TreeNode t1 = obj.initiateTree();
        List<List<Integer>> result = new VerticalOrderTraversal().verticalOrder(t1);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
