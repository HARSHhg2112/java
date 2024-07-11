public class recursion {
    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
        
    }
    public static void printinc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }


    public static int sumofn(int n){
        if(n==1){
            return 1;
        }
        int snm1=sumofn(n-1);
        int sn=n+snm1;
        return sn;
    }


    public static int fib(int n){
        if(n==0 ||n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }

    public static int firstoccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccur(arr,key,i+1);
    }

     public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=pow(x,n-1);
        int xn=x*xnm1;
        return xn;
     }


     public static void  removeduplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);//hm kis charcter pe h
        if(map[currChar-'a']==false){//duplicate
            removeduplicates(str,idx+1,newStr,map);

        }
        else{
            map[currChar-'a']=true;
            removeduplicates(str,idx+1,newStr.append(currChar),map);

        }
     }

    //  public static void removeduplicates(String str,int idx,StringBuilder newstr,boolean map[]){
    //     if(idx==str.length()){
    //         System.out.println(newstr);
    //         return;
    //     }
    //     //kaam
    //     char currchar=str.charAt(idx);
    //     if(map[currChar-'a']==false){
    //         removeduplices(str,idx+1,newstr,map);
            

    //     }
    //     else{
    //         map[currChar-'a']=true;
    //         removeduplices(str,idx+1,newStr.append(currChar),map);

    //     }
    //  }



    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //kaam
        //choice
        int single=friendspairing(n-1);
        int pair=friendspairing(n-2);
        int pairingways=(n-1)*pair;
        //total ways
        int totalways=single+pairingways;
        return totalways;
    }

    public static void alloccurances(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.println(i +" ");

        }
        alloccurances(arr,key,i+1);
    }
    public static void main(String[]args){
        int arr[]={2,4,4,4,3,4,5,7,8,5,4,3,5,3,4,};
        int key=4;
       alloccurances(arr,key,0);
       System.out.println();
    }
}

