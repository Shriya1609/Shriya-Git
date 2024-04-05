public class Sumloop {

    public static void main(String[] args){
        int count=1;
        int sum=0;
        do{
            System.out.println(count);
            count ++;
            sum=sum+count;

        }while(count<=10);
        System.out.println("The sum is:"+sum);

    }

}
