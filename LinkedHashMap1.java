package MAP;

import java.util.LinkedHashMap;

public class LinkedHashMap1
	{
		public static void main(String args[])
		{

			int n = 1000000;
			long startTime;
			long endTime;
			long duration;

			LinkedHashMap<Integer, String> hLinkedHashMap = new LinkedHashMap<Integer, String>();
			// PUT
			startTime = System.currentTimeMillis();
			for (Integer i = 0; i < n; i++)
			{
				hLinkedHashMap.put(i, "MaximS");
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("LinkedHashMap puts:  " + duration);
			// GET
			startTime = System.currentTimeMillis();
			for (int i = 0; i < n; i++)
			{
				hLinkedHashMap.get(i);
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("LinkedHashMap gets:  " + duration);
			// REMOVE
			startTime = System.currentTimeMillis();
			for (int i = 0; i < n; i++)
			{
				hLinkedHashMap.remove(i);
			}
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			System.out.println("LinkedHashMap remove:  " + duration);
		}
	}
