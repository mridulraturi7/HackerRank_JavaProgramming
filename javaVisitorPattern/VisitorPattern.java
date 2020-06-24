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