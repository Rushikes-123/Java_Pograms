package com.Set.Queue;

import java.util.*;

public class StudentRollComparator implements Comparator<Student>
{

	public int compare(Student o1, Student o2) {
		if(o1.roll>o2.roll)
			return 1;
		else if(o1.roll<o2.roll)
			return -1;
		else
		return 0;
	}



}