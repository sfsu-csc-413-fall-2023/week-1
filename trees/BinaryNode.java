package trees;

public class BinaryNode {
  private int value;
  private BinaryNode left;
  private BinaryNode right;

  public BinaryNode(int value) {
    this(value, null, null);
  }

  public BinaryNode(int value, BinaryNode left, BinaryNode right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public int getValue() {
    return this.value;
  }

  public BinaryNode getLeft() {
    return this.left;
  }

  public void setLeft(BinaryNode left) {
    this.left = left;
  }

  public BinaryNode getRight() {
    return this.right;
  }

  public void setRight(BinaryNode right) {
    this.right = right;
  }

  public void insert(int value) {
    if (value < this.getValue()) {
      if (this.getLeft() == null) {
        this.setLeft(new BinaryNode(value));
      } else {
        this.getLeft().insert(value);
      }
    } else {
      if (this.getRight() == null) {
        this.setRight(new BinaryNode(value));
      } else {
        this.getRight().insert(value);
      }
    }
  }

  @Override
  public String toString() {
    return String.format(
        "Value: %d <%d,%d>",
        this.value,
        this.left.getValue(),
        this.right.getValue());
  }
}
