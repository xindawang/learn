package test;

import java.util.ArrayList;

public class del {
	
	static class Node 
	{
		int val;
		Node next;
		Node (int val, Node next)
		{
			this.val = val;
			this.next = next;			
		}
	}
	
	private static Node createList(int N)
	{
		Node head = null;
		Node temp = head;
		for (int i = 1; i <= N; i++) {
			if (head == null)
			{
				head = new Node(i, null);
				temp = head;
			}
			else 
			{
				Node t = new Node(i, null);
				temp.next = t;
				temp = t;
			}
		}
		temp.next = head;
		return head;
	}
	
	private static void josephCircle2()
	{
		int k = 1;
		int M = 3;
		int N = 8;
		Node head = createList(N);
		Node cur = head;
		Node prev = null;
		while (cur != null)
		{
			for (int i = 1; i < M; i++)
			{
				prev = cur;
				cur = cur.next;		
			}
			// Only one element remained.
			// This is a special case for corner condition.
			if (prev == cur)
			{
				System.out.println(cur.val);
				break;
			}
			prev.next = cur.next;
			System.out.println(cur.val);	
			cur = cur.next;
		}
	}
	
	private static void josephCircle()
	{
		ArrayList<Integer> circ = new ArrayList<>();
		int N = 8;
		for (int i = 1; i <= N; i++)
			circ.add(i);
		int k = 1;
		int M = 3;
		int i = k - 1;
		
		while (!circ.isEmpty())
		{			
			i = (i + M - 1)%circ.size();			
			System.out.println(circ.get(i));
			circ.remove(i);			
		}
	}
	
	
	public static void main(String [] args) {
		josephCircle2();
	}
		
}
