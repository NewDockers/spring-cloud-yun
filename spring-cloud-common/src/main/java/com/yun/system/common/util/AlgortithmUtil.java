package com.yun.system.common.util;

/**
 * ClassName AlgortithmUtil
 * Description TODO 算法类
 * 主要有递归
 * Author zhonghaigang
 * Date 2023/3/26 22:27
 * Version 1.0
 **/
public class AlgortithmUtil {
    /**
     * 汉诺塔问题，采用递归思想
     * Hanoi(n,X,Y,Z) => 把n个盘片，从X上挪到Z上
     * Hanoi(n-1,X,Z,Y)，先把n-1个从X挪到Y上
     * move(n,X,Z)，把第n个直接移动到Z上
     * Hanoi(n-1,Y,X,Z)再把n-1个盘片从Y挪到Z上
     */
    public static void hanoi(int n,char X,char Y,char Z) {
        if(n==1) {
            System.out.printf("将第%d个盘片从%c移动到%c\n",n,X,Z);
        }else {
            hanoi(n-1,X,Z,Y);
            System.out.printf("将第%d个盘片从%c移动到%c\n",n,X,Z);
            hanoi(n-1,Y,X,Z);
        }

    }

    public static void main(String[] args) {
        hanoi(3,'X','Y','Z');
    }
}
