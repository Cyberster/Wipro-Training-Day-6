package com.w3epic.wiprotraining;

import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int nFactorial(int input1){
		// Read only region end
		int n = input1;
		if (n == 0)    
            return 1;    
		else    
            return(n * nFactorial(input1-1));        
		
	}
}
