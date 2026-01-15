// Last updated: 1/15/2026, 11:35:20 AM
// Recursion
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> list=new ArrayList<Integer>();
19        dfs(root,list);
20        return list;
21    }
22    private void dfs(TreeNode node, List<Integer> list){
23        if(node == null) return;
24        list.add(node.val);
25        dfs(node.left,list);
26        dfs(node.right,list);
27    }
28}