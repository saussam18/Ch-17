



public class Main {


    public static void main(String[]args){

        IntTree tree = new IntTree();
            tree.setOverallRoot(new IntTreeNode(3));
            tree.getOverallRoot().left = new IntTreeNode(1);
            tree.getOverallRoot().right = new IntTreeNode(5);
            tree.getOverallRoot().left.left = new IntTreeNode(0);
            tree.getOverallRoot().left.right = new IntTreeNode(2);
            tree.getOverallRoot().right.left = new IntTreeNode(4);
            tree.getOverallRoot().right.right = new IntTreeNode(10);
            tree.add(-1);
            tree.printSideways();
            System.out.println(tree.contains(-1));
            System.out.println(tree.getMin());




    }


}

