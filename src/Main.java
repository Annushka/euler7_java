public class Main {

    public static void main(String[] args) {
                boolean[]a= new boolean[10];
                for(int i=2; i<=a.length; i++){ a[i]= true;
                }
                for(int i=2; i<=a.length/2; i++){
                    if(a[i]){
                        for(int j=i+1; j<=a.length; j++){
                            if(j%i==0){a[j]=false;
                            }
                        }
                    }
                }
                int sum =0;
                for(int i =2; i<=a.length; i++){
                    if (a[i]){System.out.println(+i );
                        sum =sum+i;
                    }
                }
                System.out.println(+sum);




    }
}
