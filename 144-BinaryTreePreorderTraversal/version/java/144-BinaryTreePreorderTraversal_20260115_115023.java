// Last updated: 1/15/2026, 11:50:23 AM
// iteration method
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
19         Stack<TreeNode> stack=new Stack<>();  //helping variable
20        while(root!=null){
21            list.add(root.val);
22            if(root.right!=null){
23                stack.push(root.right);
24            }
25            if(root.left==null&& !stack.isEmpty()){
26                root=stack.pop();}
27                else{
28                root=root.left;
29            }
30        }
31        return list;
32    }
33    // private void dfs(TreeNode node, List<Integer> list){
34    //     if(node == null) return;
35    //     list.add(node.val);
36    //     dfs(node.left,list);
37    //     dfs(node.right,list);
38    // }
39
40}