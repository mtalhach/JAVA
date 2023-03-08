package A10_2D_Array;

public class Demo {
    public static void main(String[] args) {
        Main obj = new Main(6, 4);
        System.out.println(obj.toString());
        System.out.println("=============");


        Main[]  arrayOfMain= new Main[5];
        arrayOfMain[0]=new Main(0,0);
        arrayOfMain[1]=new Main(0,0);
        arrayOfMain[2]=new Main(0,0);
        arrayOfMain[3]=new Main(0,0);
        arrayOfMain[4]=new Main(0,0);


//      Main[][] twoDArray=new Main[5][5];
        Main[][] twoDArray=new Main[5][];
        twoDArray[0]=new Main[2];
        twoDArray[1]=new Main[4];
        twoDArray[2]=new Main[1];
        twoDArray[3]=new Main[5];
        twoDArray[4]=new Main[3];
        System.out.println(twoDArray);
        System.out.println("==============");

        Demo obj1=new Demo();
        obj1.initTwoDArray(twoDArray);
        obj1.displayTwoDimensionalArray(twoDArray);
        obj.getX();


    }

    public void displayTwoDimensionalArray(Main[][] tempArray){
        for(int i=0;i< tempArray.length;i++) {
            displayOneDimenionalArray(tempArray[i]);
            System.out.println();
        }
    }

    public void displayOneDimenionalArray(Main[] tempArray){
        for (int j = 0; j < tempArray.length; j++)
            System.out.println(tempArray[j]);
    }

    public void initTwoDArray(Main[][] temp){
        for(int i=0;i< temp.length;i++)
            for(int j=0;j<temp[i].length;j++)
                temp[i][j]=new Main(2,2);
    }
}
