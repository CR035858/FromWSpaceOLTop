package com.gl.dsa;
import java.util.*;

class LLNode{

	int data;
	LLNode next;
	
	LLNode(int data)
	{
		this.data=data;
		this.next=null;
		
	}
}

public class LinkedListOperations {
	
	
	LLNode head;
	
	
	LLNode insertInBeg(int key,LLNode head)
	{
		LLNode ttmp=new LLNode(key);
		
		if(head==null)
			head=ttmp;
		
		else
			{
				ttmp.next=head;
				head=ttmp;
			}
		return head;
	}
	
	
	LLNode insertInEnd(int key,LLNode head)
	{
		LLNode ttmp=new LLNode(key);
		LLNode ttmp1=head;
		
		if(ttmp1==null)
			head=ttmp;
		else
		{
			while(ttmp1.next!=null)
					ttmp1=ttmp1.next;
			ttmp1.next=ttmp;
			
		}
		
		return head;
			
	}


	LLNode insertAtPos(int key,int pos,LLNode head)
	{
		LLNode ttmp=new LLNode(key);
		
		if(pos==1)
		{
			ttmp.next=head;
			head=ttmp;
		}
		else
		{
			LLNode ttmp1=head;
			for(int i=1;ttmp1!=null && i<pos;i++)
				ttmp1=ttmp1.next;
			ttmp.next=ttmp1.next;
			ttmp1.next=ttmp;
		}
		
		return head;
	}
	
	
	LLNode delete(int pos,LLNode head)
	{
		LLNode ttmp=head;
		if(pos==1)
			head=ttmp.next;
		else
		{
			for(int i=1;ttmp!=null && i<pos-1;i++)
				ttmp=ttmp.next;
			ttmp.next=ttmp.next.next;
		}
		return head;
	}
	
	int length(LLNode head)
	{
		LLNode ttmp=head;
		int c=0;
		if(ttmp==null)
			return 0;
		else
		{
		 while(ttmp!=null)
			{	ttmp=ttmp.next;
				c++;
			}
		}
		return c;
	}
	
	
	LLNode reverse(LLNode head)
	{
		LLNode prevLNode=null,curLNode=head,nextLNode=null;
		while(curLNode!=null)
		{
			nextLNode=curLNode.next;
			curLNode.next=prevLNode;
			
			prevLNode=curLNode;
			curLNode=nextLNode;
		}
		
		head=prevLNode;
		return head;
	}
	
	
	void display(LLNode head)
	{
		LLNode ttmp=head;
		while(ttmp!=null)
			{System.out.print(ttmp.data+" ");
			 ttmp=ttmp.next;
			}
	}
		
		public static void main(String[] args)
		{
			LinkedListOperations l=new LinkedListOperations();
			l.head=null;
			Scanner in=new Scanner(System.in);
			 do
		{
	 System.out.println("\n********* MENU *********");
		 System.out.println("\n 1.Insert In the End of The LinkedList");
		 System.out.println("\n 2.Insert In the Beginning of The LinkedList");
		 System.out.println("\n 3.Insert At A  Particular Pos  key ,position");
		 System.out.println("\n 4.Delete At a Pos");
		 System.out.println("\n 5.Length of the LinkedList");
		 System.out.println("\n 6.Reversed Linked List");
		 System.out.println("\n 7.Display Elements of the LinkedList");
		 System.out.println("\n 8.EXIT");
		 System.out.println("\n Enter Your Choice : ");
		 int n=in.nextInt();
		 switch(n)
			{case 1: System.out.println("\nenter the value ");
				  l.head=l.insertInEnd(in.nextInt(),l.head);
				 break;
			 case 2: System.out.println("\nenter the value");
				 l.head=l.insertInBeg(in.nextInt(),l.head);
				 break;
			 case 3: System.out.println("\nenter the value ");
				 l.head=l.insertAtPos(in.nextInt(),in.nextInt(),l.head);
				 break;
			 case 4: 
				 l.head=l.delete(in.nextInt(),l.head);
				 break;
			 case 5: 
				System.out.println(l.length(l.head));
				 break;
			 case 6: 
				 l.head=l.reverse(l.head);
				 break;
			 case 7: 
				l.display(l.head);
			 		 break;
			 case 8: System.exit(0);
			 		 break;
			 default: System.out.println("\n Wrong Choice!");
			 		  break;
			}
		 System.out.println("\n do u want to cont...1 to continue / 0 to exit ");
		}while(in.nextInt()==1);
		}


}
