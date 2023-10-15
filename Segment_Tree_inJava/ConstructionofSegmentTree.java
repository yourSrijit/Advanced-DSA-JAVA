package Segment_Tree_inJava;

public class ConstructionofSegmentTree {
    static int tree[];
    public static void InitilizeTree(int l){
        tree=new int[4*l];
    }
    public static int builtSegmentTree(int[] arr,int idx,int st,int ed ){

        if(st==ed){
            tree[idx]=arr[st];
            return tree[idx];
        }
        int mid=(st+ed)/2;
        int left=builtSegmentTree(arr,2*idx+1,st,mid);
        int right=builtSegmentTree(arr,2*idx+2,mid+1,ed);
        return tree[idx]=(left+right);
    }
    public static int getSumUtil(int i,int si,int sj,int qi,int qj){
        //1 .Non overlap
        if(qj<=si || qi>=sj){
            return 0;
        }
        //2 .Completed Overlap
        else if(si>=qi && sj<= qj){
            return tree[i];
        }
        //3. Partially Overlap
        else {
            int mid=(si+sj)/2;
            int left=getSumUtil(2*i+1,si,mid,qi,qj);
            int right=getSumUtil(2*i+2,mid+1,sj,qi,qj);
            return (left+right);
        }
    }
    public static int getSum(int arr[],int qi,int qj){
        int l=arr.length;
        return getSumUtil(0,0,l-1,qi,qj);
    }



    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8};
    InitilizeTree(arr.length);
    builtSegmentTree(arr,0,0,arr.length-1);
    int res=getSum(arr,2,5);
        System.out.println(res);
    }
}
