package src;

public enum Operation {
    ADD("Addition"), //0
    SUB("Subtraction"),
    MUL("Multiplication"),
    DIV("Division");

    private String op;

    Operation(String op){
        this.op = op;
    }

    public String getOp(){
        return this.op;
    }
}
