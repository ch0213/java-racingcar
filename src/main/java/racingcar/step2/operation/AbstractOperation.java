package racingcar.step2.operation;

public abstract class AbstractOperation {

    protected int left;
    protected int right;

    public AbstractOperation(String left, String right) {
        this.left = Integer.valueOf(left);
        this.right = Integer.valueOf(right);
    }
}