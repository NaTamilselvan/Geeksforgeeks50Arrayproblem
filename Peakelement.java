public class Peakelement{

public static void  peakElement(int[]  a){


for(int i=1;i<a.length-1;i++){

if(a[i-1]<a[i]>a[i+1]){

System.out.println("THe peak element "+a[i]);

}


}



}
  
public static void main(String[] args){

int a[]={10,20,45,20,22,23,21};

peakElement(a);


}





}
