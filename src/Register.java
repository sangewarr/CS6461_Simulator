public class Register {
    public int bit;
    public int value;
    public Register(int bit){
        this.bit= bit;
        this.value=0;
    }
    public Register(int bit, int value){
        this.bit=bit;
        this.value=value;
    }
    public void setValue(int value){
        this.value=value;
    };
    public int getValue(){
        return value;
    };
}
