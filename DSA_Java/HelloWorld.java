public class HelloWorld {

    public static void main(String[] args){
        int[] my_array = {64, 34, 25, 12, 22, 11, 90, 5};
int temp;
        for(int i=0;i<my_array.length;i++){
            int j=i+1;

            if (my_array[j]<my_array[i]) {
                temp=my_array[i];
                my_array[i]=my_array[j];
                my_array[j]=temp;
            }
        }
for(int i=0;i<my_array.length;i++){
    System.out.print(my_array[i]);
}
    }
}