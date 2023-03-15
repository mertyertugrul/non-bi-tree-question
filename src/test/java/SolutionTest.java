import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void solution_1() {
        // Given
        List<int[]> ex1 = List.of(
                new int[]{4, 5},
                new int[]{5, 3},
                new int[]{1, 5},
                new int[]{2, 1},
                new int[]{3, 6},
                new int[]{7, 3}
        );

        TreeNode root1 = new TreeNode(1);
        TreeNode child1_1 = new TreeNode(5);
        TreeNode child1_2 = new TreeNode(2);
        TreeNode child1_3 = new TreeNode(3);
        TreeNode child1_4 = new TreeNode(4);
        TreeNode child1_6 = new TreeNode(6);
        TreeNode child1_7 = new TreeNode(7);
        child1_3.addChild(child1_6);
        child1_3.addChild(child1_7);
        child1_1.addChild(child1_4);
        child1_1.addChild(child1_3);
        root1.addChild(child1_1);
        root1.addChild(child1_2);
        System.out.println(root1);

        // When
        TreeNode ans1 = Solution.solution(ex1);
        System.out.println(ans1);
        // Then
        assertEquals(ans1, root1);
    }

    @Test
    void solution_2() {
        // Given
        List<int[]> ex2 = List.of(
                new int[]{4, 5},
                new int[]{5, 3},
                new int[]{1, 5},
                new int[]{2, 5}
        );

        TreeNode root2 = new TreeNode(1);
        TreeNode child2_1 = new TreeNode(5);
        TreeNode child2_2 = new TreeNode(2);
        TreeNode child2_3 = new TreeNode(3);
        TreeNode child2_4 = new TreeNode(4);
        child2_1.addChild(child2_4);
        child2_1.addChild(child2_3);
        child2_1.addChild(child2_2);
        root2.addChild(child2_1);
        System.out.println(root2);

        List<int[]> ex3 = List.of();
        TreeNode root3 = new TreeNode(1);
        System.out.println(root3);

        // When
        TreeNode ans2 = Solution.solution(ex2);
        System.out.println(ans2);

        TreeNode ans3 = Solution.solution(ex3);
        System.out.println(ans3);
        // Then
        assertEquals(ans2, root2);
    }
}