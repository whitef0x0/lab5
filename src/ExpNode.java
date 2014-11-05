import java.math.BigDecimal;

public class ExpNode extends Node {
  private Node right;
  private Node left;
  
  public ExpNode(Node right, Node left){
    this.right = right
    this.left = left;
  }
  
  public BigDecimal evaluate(){
    return super.getChild(0).evaluate().
      pow(super.getChild(2).evaluate());
  }
  
  
  /*
  * Return a character which represents the mathematical operand of this operand node
  * @returns  '^' character
  */
  @Override
  public string getOpName(){
    return '^';
  }


}
