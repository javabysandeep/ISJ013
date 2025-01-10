class TypeCasting {

	public static void main(String[] args){
			
		//implicit type casting		
			byte byteValue = 127;
			int intValue = byteValue;		
			System.out.println(" converted int value "+intValue);
			
		//explicit type casting		
			int intValue2 = 130;	
			byte byteValue2 = (byte)intValue2;
			System.out.println(" converted byte value "+byteValue2);
			
	
	}

}