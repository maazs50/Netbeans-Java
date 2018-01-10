package Basic.Numbers;
public class UnCommonNumbers {
    
public static void main(String args[]){

StringBuilder sb=new StringBuilder();

int a[]={1,5,8,7,9,56,78,98,1,7 ,9};
int count=0, flag=0;

for(int i=0;i<a.length;i++){
    for(int j=0;j<a.length;j++){
        if(i!=j){
            if(a[i]!=a[j]){
                flag=1;
            }
            else{
                flag=0;
                break;
            }
            
        }
           
    }
    if(flag==1){
        count++;
        System.out.print(a[i]+" ");
    }
}
 System.out.println("");
 System.out.println(count);

}

}
