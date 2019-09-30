public class SumBST {
   	public int sum;
    // Definition for a binary tree node.
   	public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        sum = 0;
        rangeSumBSTHelper(root, L, R);
        System.out.print(sum);
        return sum;
    }
    
    private void rangeSumBSTHelper(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }
        
        if (root.val >= low && root.val <= high) {
            sum += root.val;
            rangeSumBSTHelper(root.right, low, high);
            rangeSumBSTHelper(root.left, low, high);
        }
        else {
            if (root.val < low) {
                rangeSumBSTHelper(root.right, low, high);
            }

            if (root.val > high) {
                rangeSumBSTHelper(root.left, low, high);
            }
        }
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumBST cal = new SumBST();
		int [] root = {10,5,15,3,7,18};
	//	cal.rangeSumBST(root, 7, 15);
	}

	}
