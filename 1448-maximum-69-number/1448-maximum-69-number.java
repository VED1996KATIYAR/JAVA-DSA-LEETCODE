class Solution {
    public int maximum69Number (int num) {
        int ctr=0;
        int temp=num;
        while(temp!=0){
            
            ctr+=1;
            temp/=10;

        }
        int n[]=new int[ctr];
        int k=0;
        int tempo=num;
        while(tempo!=0){
            int mod=tempo%10;
            n[k]=mod;
            k+=1;
            tempo/=10;
        }
        for(int i=n.length-1;i>=0;i--){
            if(n[i]==6){
                n[i]=9;
                break;
            }
        }
        int noo=0;
        for(int j=n.length-1;j>=0;j--){
            noo=n[j]+noo*10;
        }
        return noo;
    }
}