package MAP;

import java.util.HashMap;

public class HashMap1
	{
		public static void main(String args[])
		{

			int n = 1000000;
			long startTime;
			long endTime;
			long duration;

			HashMap<Integer, String> hHashMap = new HashMap<Integer, String>();
			// PUT
			startTime = System.currentTimeMillis();
			for (Integer i = 0; i < n; i++)
			{
				hHashMap.put(i, "MaximS");
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("HashMap puts:  " + duration);
			// GET
			startTime = System.currentTimeMillis();
			for (int i = 0; i < n; i++)
			{
				hHashMap.get(i);
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("HashMap gets:  " + duration);
			// REMOVE
			startTime = System.currentTimeMillis();
			for (int i = 0; i < n; i++)
			{
				hHashMap.remove(i);
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("HashMap remove:  " + duration);
		}
	}
