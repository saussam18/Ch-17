import java.util.NoSuchElementException;

public class IntTree {
    private IntTreeNode overallRoot;
    private int height;


    public IntTree(int h) {
        this.height = h;
        this.overallRoot = null;
    }

    public IntTree(IntTreeNode x) {
        this.overallRoot = x;
    }

    public IntTree(IntTreeNode x, int h) {
        this.overallRoot = x;
        this.height = h;
    }

    public IntTree() {
        this.overallRoot = null;
    }


    public void print() {
        print(overallRoot);
        System.out.println();
    }

    private void print(IntTreeNode root) {
        if (root != null) {
            print(root.left);
            System.out.println(root.data);
            print(root.right);
        }
    }
        public void add(int value){
        add(overallRoot, value);
        }
        private IntTreeNode add(IntTreeNode root, int value){
            if (root == null){
                root = new IntTreeNode(value);
            }else if (root.data > value){
               root.left = add(root.left, value);
            }else if (root.data <  value){
                root.right = add (root.right, value);
            }
            return root;
        }


    public boolean contains(int value) {
        return searchBinary(overallRoot, value);
    }

    private boolean searchBinary(IntTreeNode root, int value){
        if (root == null){
            return false;
        }else if(root.data == value){
           return true;
        }else if (value < root.data){
            return searchBinary(root.left, value);
        } else {
            return searchBinary(root.right, value);
        }
    }
        public int getMin(){
        if(overallRoot == null){
            throw new NoSuchElementException();
            }else{
            return getMin(overallRoot);
            }
        }
        private int getMin(IntTreeNode root){
            if(root.left == null){
                return root.data;
            }else{
                return getMin(root.left);
            }
        }
        public void remove(int value){
           overallRoot = remove(overallRoot, value);
        }
        private IntTreeNode remove(IntTreeNode root, int value){
            if(root == null){
                System.out.println("no value found");
            }else if( root.data < value){
                return remove(root.right, value);
            }else if(root.data > value ){
                return remove(root.left, value);
            }else{
                if(root.right == null){
                    return root.left;
                }else if (root.left == null){
                    return root.right;
                }else{
                    root.data = getMin(root.right);
                    root.right = remove(root.right, root.data);
                }
            }
            return root;
        }
    public void printSideways() {
        printSideways(overallRoot, "");
        System.out.println();
    }

    private void printSideways(IntTreeNode root, String tab) {
        if(root != null){
            printSideways(root.right, tab + "    ");
            System.out.println(tab + root.data);
            printSideways(root.left, tab + "    ");
        }
    }

    public IntTreeNode getOverallRoot() {
        return overallRoot;
    }

    public void setOverallRoot(IntTreeNode overallRoot) {
        this.overallRoot = overallRoot;
    }
}
