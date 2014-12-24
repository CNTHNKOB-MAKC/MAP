package MAP;

import java.util.Hashtable;

public class Hashtable1
	{
		public static void main(String args[])
		{

			int n = 1000000;
			long startTime;
			long endTime;
			long duration;

			Hashtable<Integer, String> hHashtable = new Hashtable<Integer, String>();
			// PUT
			startTime = System.currentTimeMillis();
			for (Integer i = 0; i < n; i++)
			{
				hHashtable.put(i, "MaximS");
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("Hashtable puts:  " + duration);
			// GET
			startTime = System.currentTimeMillis();
			for (int i = 0; i < n; i++)
			{
				hHashtable.get(i);
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("Hashtable gets:  " + duration);
			// REMOVE
			startTime = System.currentTimeMillis();
			for (int i = 0; i < n; i++)
			{
				hHashtable.remove(i);
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("Hashtable remove:  " + duration);
		}
	}
