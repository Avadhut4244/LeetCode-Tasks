class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Node> stack = new Stack<>();
        Stack<Node> output = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            output.push(node);
            for (Node child : node.children) {
                stack.push(child);
            }
        }
        while (!output.isEmpty()) {
            result.add(output.pop().val);
        }
        return result;
    }
}
