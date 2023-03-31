package part1.inheritance.One;

public class Auto extends Custom{

    public Auto() {
    }

    public Auto(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void add(int value) {
        if(index >= initialCapacity){
            int[] temp = new int[initialCapacity*2];
            for(int i=0;i<arr.length;i++){
                temp[i] = arr[i];
            }
            arr=temp;
        }
        super.add(value);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
