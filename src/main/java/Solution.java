import java.util.*;

public class Solution {

    public static TreeNode solution(List<int[]> edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] edge: edges) {
            map.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
        Set<Integer> visited = new HashSet<>();
        TreeNode root = new TreeNode(1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        visited.add(1);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            int val = curr.val;
            for (int neighbor : map.getOrDefault(val, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    TreeNode child = new TreeNode(neighbor);
                    curr.children.add(child);
                    queue.offer(child);
                }
            }
        }

        return root;
    }

}

