package com.awesam;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class BinaryTree {
   /* public void postOrder2(){
        if (root==null)return;
        Stack<TreeNode>stack=new Stack<>();
        TreeNode current = root;
        while (current!=null||!stack.isEmpty()){
            if (current!=null){
                stack.push(current);
                current=current.left;
            }
            else{
                TreeNode temp = stack.peek().right;
                if (temp==null){
                    temp = stack.pop();
                    System.out.println(temp.data);
                    while (!stack.isEmpty()&&temp=stack.peek().right){
                        temp = stack.pop();
                        System.out.println(temp.data);
                    }
                }
                else current=temp;
            }
        }
    }*/
}
