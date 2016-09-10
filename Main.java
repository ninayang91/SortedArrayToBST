import java.util.LinkedList;

import org.w3c.dom.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={1,2,3,4,5,6};
		TreeNode t=createBST(a);
		printTree(t);
		
/*		TreeNode f =new TreeNode(6,null,null);
		TreeNode e =new TreeNode(5,null,null);
		TreeNode c =new TreeNode(3,null,null);
		TreeNode d= new TreeNode(4,e,f);
		TreeNode b= new TreeNode(2,d,null);
		TreeNode a= new TreeNode(1,b,c);*/
		//System.out.println(isBalanced2(a));	

	}
	
	public static void printTree(TreeNode root){
		if(root==null) return;
		if(root.left!=null)printTree(root.left);
		System.out.println(root.data);
		if(root.right!=null)printTree(root.right);
	}
	
	public static TreeNode createBST(int[] a){
		return createBST(a,0,a.length-1);
	}
	
	public static TreeNode createBST(int[] a, int low, int high){
		if(low>high) return null;
		int mid=(low+high)/2;
		TreeNode left=createBST(a,low,mid-1);
		TreeNode right=createBST(a,mid+1,high);
		return new TreeNode(a[mid],left,right);
		
	}
	
	

}
