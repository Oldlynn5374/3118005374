package symbol;

public abstract class Symbol {

    //符号优先级
    public int priotiry;
    //符号名称
    public String name;

    public abstract int getPriotiry();

    public abstract void setPriotiry(int priotiry);

    public abstract String getName();

    public abstract void setName(String name);
}
