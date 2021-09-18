//Simple memory class
public class Memory {
    //setting memory to 2048 and exp to 4096
    public Object[][] memoryArray = new Object[2048][2];

    public Memory(){
        for (int i=0;i<2048;i++){
            memoryArray[i][0]  =i;
            memoryArray[i][1] = "0000,0000,0000,0000";
        }
    }
    public void putMem(int i,String value){
        memoryArray[i][1]=value;
    }
}
