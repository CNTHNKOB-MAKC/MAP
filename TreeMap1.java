package MAP;

import java.util.TreeMap;

public class TreeMap1
	{
		public static void main(String args[])
		{

			int n = 1000000;
			long startTime;
			long endTime;
			long duration;

			TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
			// PUT
			startTime = System.currentTimeMillis();
			for (Integer i = 0; i < n; i++)
			{
				hm.put(i, "MaximS");
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("TreeMap puts:  " + duration);
			// GET
			startTime = System.currentTimeMillis();
			for (int i = 0; i < n; i++)
			{
				hm.get(i);
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("TreeMap gets:  " + duration);
			// REMOVE
			startTime = System.currentTimeMillis();
			for (int i = 0; i < n; i++)
			{
				hm.remove(i);
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("TreeMap remove:  " + duration);
		}
	}
