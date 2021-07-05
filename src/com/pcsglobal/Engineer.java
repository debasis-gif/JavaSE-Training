

package com.pcsglobal;

import com.pcsglobal.test.Student;

public class Engineer extends Student    // Press Ctrl+space on Student class on different package to get the import automatically
{
	public void show()
	{
		marks = 78;   // No errors -> so protected variable can be accessed in an inherited class of separate package 
		// age = 55;     // Errors -> default or private variable is still not accessible to an inherited class of a separate package
	}
}
