package org.javaArray;

public class Family {
	 int for_son,for_daughter,savigs;
	 String[] week_days = {"sunday","monday","tuesday","wedesday","thursday","friday","saturday"};//new String[7];
	 
	public Family(int son,int daughter) {
		this.for_son=son;
		this.for_daughter=daughter;
	
		
	}
	public static void main(String[] args) {
		Family fm =new Family(30,30);
		//fm.fare_before_the_law_of_free_for_girls();
		fm.fare_after_the_law_of_free_for_girls();
		
	}

	private void fare_after_the_law_of_free_for_girls() {
		// TODO Auto-generated method stub
		int son,daughter=0,no_of_days=30,i=0;
		son = 0;
		
		
		while (i<no_of_days) {
			if (i<no_of_days) {
				
			
				son = son+for_son;
				daughter  = daughter+for_daughter;
			}
				if (i>=no_of_days-5) {
					savigs = savigs+this.for_son+this.for_daughter;
				}
				i++;
			}
		
				
				System.out.println(son);
				System.out.println(daughter);
				System.out.println("savings in month "+savigs);
				
		
		
		}
		//System.out.println(savigs);
			
				
			
			
		
		
	

	private void fare_before_the_law_of_free_for_girls() {
		// TODO Auto-generated method stub
		
	}

}
