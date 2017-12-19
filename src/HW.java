public class HW {
    //Pg 1048 4-6,8,11,16
    /*
    Problem 4:
    pre: 3 5 1 2 4 6
    in: 1 5 3 4 2 6
    post: 1 5 4 6 2 3

    Problem 5:
    pre: 19 47 23 -2 55 63 94 28
    in: 23 47 55 -2 19 63 94 28
    post: 23 55 -2 47 28 94 63 19

    Problem 6:
    pre: 2 1 7 4 3 5 6 9 8
    in: 2 3 4 5 7 1 6 8 9
    post: 3 5 4 7 8 9 6 1 2

    Problem 8:
    public void printPost() {
    printPost(overallRoot);
    }

    private void printPost(IntTreeNode root) {
     if (root != null) {
        printPost(root.left);
        printPost(root.right);
        System.out.print(" " + root.data);
        }
    }
    Problem 11:
    public int size() {
    return size(overallRoot);
    }

    private int size(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else {
        return 1 + size(root.left) + size(root.right);
        }
    }

    Problem 16:
    A in order traversal will look at the elements in their sorted order, such as numerical order if it is sorted and needed for a binary search
     */


}
