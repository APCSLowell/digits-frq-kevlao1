import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		digitList = new ArrayList<Integer>();
		int origNum  = num;
		String uhOh = Integer.toString(num);
		int checker = uhOh.length();
		while(origNum > 0){
			digitList.add(origNum%10);
			origNum = origNum/10;
		}
	while(checker > digitList.size()){
		if(checker > digitList.size()){
				digitList.add(0, 0);
			}
		}
	}

	public boolean isStrictlyIncreasing()
	{ 
	for(int i = 1; i < digitList.size(); i++){
		if(digitList.get(i-1) >= digitList.get(i)) return false;
	}
	return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
