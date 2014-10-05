import java.math.BigDecimal;

/**
 * 
 * This is an abstract class for representing an element of computation in an
 * arithmetic expression. It could represent an operator or an operand.
 * 
 * If a Node represents an operator then it could represent a unary or binary
 * operator, and this would determine how many child nodes it has. If a node
 * represents an operand then it will have no child nodes.
 * 
 * @author Sathish Gopalakrishnan
 * 
 */
public abstract class Node {

	private int numChildren;
	Node[] childNodes;

	public Node(Node leftChild, Node rightChild) {
		this.numChildren = 2;
		childNodes = new Node[2];
		childNodes[0] = leftChild;
		childNodes[1] = rightChild;
	}

	public Node() {
		numChildren = 0;
	}

	public Node getChild( int index ) throws IllegalArgumentException {
		if ( index < 0 || index >= numChildren ) throw new IllegalArgumentException();
		return childNodes[ index ];
	}

	public abstract BigDecimal evaluate();

	public boolean isLeaf() {
		return (numChildren == 0);
	}

	public abstract char getOpName( );
	
}