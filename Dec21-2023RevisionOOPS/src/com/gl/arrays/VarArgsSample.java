package com.gl.arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class VarArgsSample {

	public void manipulateVarArgs(int score1,int score2,String... states)
	{
		int totScore = score1 + score2;
		System.out.println("The Sum is "+totScore);
		System.out.println("The States are...");
		for(int i=0;i<states.length;i++)
		{
			System.out.println(states[i]);
		}
		System.out.println("-------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsSample vas = new VarArgsSample();
		vas.manipulateVarArgs(100, 200, "KAR","AP","TELAN","MAH");
		vas.manipulateVarArgs(100, 200, "KER","TN");
		vas.manipulateVarArgs(100, 200, "RAJ","PUNJ","J&K","DELH","HAR");
		vas.manipulateVarArgs(100, 200, "KAR");
		

	}

}
