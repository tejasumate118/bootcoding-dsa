/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> list;
    public List<Integer> postorder(Node root) {
        list=new ArrayList<>();
        if(root==null)return list;
        if(root.children != null)
        helper(root,root.children);
        list.add(root.val);
        return list;
    }
    private void helper(Node node, List<Node> hlist){
        if(node==null || hlist == null) return;
        while(!hlist.isEmpty()){
            Node pop = hlist.removeFirst();
            helper(pop,pop.children);
            list.add(pop.val);
        }
    }
}