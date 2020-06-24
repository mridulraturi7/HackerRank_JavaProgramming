package javaVisitorPattern;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {

    private int result;

    public int getResult() {
      	//implement this
        return result;
    }

    public void visitNode(TreeNode node) {
      	//implement this
          //doNothing
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this

        result = result + leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {

    private long result = 1;
    private final int M = 1000000007;

    public int getResult() {
      	//implement this
        return (int)result;
    }

    public void visitNode(TreeNode node) {
      	//implement this
        if(node.getColor() == Color.RED)
        {
            result = (result * node.getValue())%M;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
        if(leaf.getColor() == Color.RED)
        {
            result = (result * leaf.getValue())%M;
        }
    }
}

class FancyVisitor extends TreeVis {

    private int nonLeafNodes_EvenDepth_Sum = 0;
    private int greenLeafNodes_Sum = 0;
    private int result = 0;

    public int getResult() {
      	//implement this
        result = Math.abs(nonLeafNodes_EvenDepth_Sum - greenLeafNodes_Sum);
        return result;
    }

    public void visitNode(TreeNode node) {
    	//implement this
        if(node.getDepth()%2 == 0)
        {
            nonLeafNodes_EvenDepth_Sum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
    	//implement this
        if(leaf.getColor() == Color.GREEN)
        {
            greenLeafNodes_Sum += leaf.getValue();
        }
    }
}

public class VisitorPattern {

    private static int values[];
    private static Color colors[];

    private static HashMap<Integer, HashSet<Integer>> myHash;

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner scan = new Scanner(System.in);

        int nodes = scan.nextInt();
        values = new int[nodes];
        colors = new Color[nodes];

        myHash = new HashMap<>(nodes);

        for(int i = 0; i < nodes; i++)
        {
            values[i] = scan.nextInt();
        }

        for(int i = 0; i < nodes; i++)
        {
            int color = scan.nextInt();
            if(color == 0)
            {
                colors[i] = Color.RED;
            }

            else if(color == 1)
            {
                colors[i] = Color.GREEN;
            }
        }

        for(int i = 0; i < nodes - 1; i++)
        {
            int u = scan.nextInt();
            int v = scan.nextInt();

            HashSet<Integer> u_neighbours = myHash.get(u);

            if(u_neighbours == null)
            {
                u_neighbours = new HashSet<>();
                myHash.put(u, u_neighbours);
            }

            u_neighbours.add(v);

            HashSet<Integer> v_neighbours = myHash.get(v);

            if(v_neighbours == null)
            {
                v_neighbours = new HashSet<>();
                myHash.put(v, v_neighbours);
            }

            v_neighbours.add(u);
        }

            if(nodes == 1)
            {
                return new TreeLeaf(values[0], colors[0], 0);
            }

            TreeNode root = new TreeNode(values[0], colors[0], 0);
            addChildren(root, 1);

            return root;
    }

    private static void addChildren(TreeNode parent, Integer parentNum) 
    {
        for (Integer treeNum : myHash.get(parentNum)) 
        {
            myHash.get(treeNum).remove(parentNum);

            HashSet<Integer> grandChildren = myHash.get(treeNum);

            boolean childHasChild = (grandChildren != null && !grandChildren.isEmpty());
            Tree tree;
            if (childHasChild) 
            {
                tree = new TreeNode(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            } 
            else 
            {
                tree = new TreeLeaf(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            }
            parent.addChild(tree);

            if (tree instanceof TreeNode) {
                addChildren((TreeNode) tree, treeNum);
            }
        }
    }

    public static void main(String[] args) {
        Tree root = solve();
      SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
       System.out.println(res2);
      System.out.println(res3);
  }
    
}