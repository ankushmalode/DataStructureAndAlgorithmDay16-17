package com.bridgelabz.AlgorithmProblms;

public class Permutation {
    public static void main(String[] args) {
        String str="ABCD";
        int num=str.length();
        Permutation permutation=new Permutation();
        permutation.recursion(str, 0,num-1);
    }

    public String swap(String str, int l, int num){
        char temp;
        char[] charArray=str.toCharArray();
        temp=charArray[l];
        charArray[l]=charArray[num];
        charArray[num]=temp;
        return String.valueOf(charArray);
    }

    private void recursion(String str,int l, int num){
        if (l==num)
            System.out.println(str);
        else {
            for (int i=l;i<=num;i++){
                str=swap(str,l,num);
                recursion(str,l+1,num);
                str=swap(str,l,num);
            }
        }
    }
}
