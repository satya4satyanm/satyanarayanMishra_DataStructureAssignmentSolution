package com.gl.satya4satyanm;

class Node
{
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}


class Main
{
    public Node node;
    Node prevNode = null;
    Node headNode = null;
   
    public void SkewBST(Node root)
    {
        if(root == null)
        {
            return;
        }
       
        SkewBST(root.left);

        Node rightNode = root.right;
       
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
       
        SkewBST(rightNode);
        
    }
   
    public void traverseBST(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        
        // this prints only the right node starting from root
        traverseBST(root.right);
    }
}


public class RightSkew {

	public static void main(String[] args) {

		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		
        tree.SkewBST(tree.node);
        tree.traverseBST(tree.headNode);
        
	}

}
