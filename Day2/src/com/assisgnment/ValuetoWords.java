package com.assisgnment;

public class ValuetoWords {
	private int num;
	
	public ValuetoWords() {
		
	}

	public ValuetoWords(int num) {
		this.num = num;
	}

	public String converter(int num) {
		String []onePlaceArr ={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","eighteen","Nineteen"};
		String []tenPlaceArr =  {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String hund = "Hundred";
		String thou = "Thousand";
		
			int onesPlace = num%10;//Last  digit //unit place
			int tensplace= num/10;
			int tensPlace = tensplace%10;// tens place
			int hundredsPlace = num/100;
			int hundredsplace = hundredsPlace%10;// hundred place
			int thousandPlace = num/1000;//thousand place
			if(num<20) {
				return onePlaceArr[num]; 
			}
			else if(num<100) {
				return (tenPlaceArr[tensPlace]+" "+onePlaceArr[onesPlace]);
			}
			else if(num<1000) {
				return(onePlaceArr[hundredsplace]+" "+hund+" "+tenPlaceArr[tensPlace]+" "+onePlaceArr[onesPlace]);
			}
			else {
				return (onePlaceArr[thousandPlace]+" "+thou+" "+onePlaceArr[hundredsplace]+" "+hund+" "+tenPlaceArr[tensPlace]+" "+onePlaceArr[onesPlace]);
			}
	}
	
}
