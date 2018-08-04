package InterfacesAndAbstraction.SayHelloExtend;



public abstract class BasePerson implements Person{
    private String name;
    protected BasePerson(String name) {
        this.setName();
    }
    private void setName() {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    } }
