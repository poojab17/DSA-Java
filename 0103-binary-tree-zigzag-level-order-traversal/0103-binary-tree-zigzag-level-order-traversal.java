class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Deque<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        q.addFirst(root);

        boolean r = false;

        while (!q.isEmpty()) {

            List<Integer> level = new ArrayList<>();

            int size = q.size();

            for (int i = 0; i < size; i++) {

                if (r == false) {

                    TreeNode curr = q.pollFirst();

                    level.add(curr.val);

                    if (curr.left != null) {
                        q.addLast(curr.left);
                    }

                    if (curr.right != null) {
                        q.addLast(curr.right);
                    }

                } else {

                    TreeNode curr = q.pollLast();

                    level.add(curr.val);

                    if (curr.right != null) {
                        q.addFirst(curr.right);
                    }

                    if (curr.left != null) {
                        q.addFirst(curr.left);
                    }
                }
            }

            ans.add(level);

            r = !r;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna