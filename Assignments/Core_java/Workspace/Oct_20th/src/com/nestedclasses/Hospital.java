package com.nestedclasses;

public class Hospital {
	
	interface BloodPressureListener
	{
	    public void onBloodPressureChanged(int bloodPressure);
	}

	
	static class BloodPressure
	{
	    private BloodPressureListener listener;
	    private int bp;

	    public void setOnBloodPressureChangeListener(BloodPressureListener listener)
	    {
	        this.listener = listener;
	    }

		public BloodPressure(int bp) {
			super();
			this.bp = bp;
		}

		public void setBp(int bp) {
			this.bp = bp; 
			if(this.listener != null)
				listener.onBloodPressureChanged(bp);
		}
	    
	}

	public static void main(String[] args) throws InterruptedException {
		BloodPressure bloodPressure =  new BloodPressure((int)(Math.random()*100) + 50);
		bloodPressure.setOnBloodPressureChangeListener(new BloodPressureListener() {
			@Override
			public void onBloodPressureChanged(int bloodPressure) {
				if(bloodPressure > 140)
					System.out.println("Warning!! Blood pressure is "+bloodPressure);
				else 
					System.out.println("Your blood pressure is "+bloodPressure+" which is normal.");
			}
		});
		while(true){
			bloodPressure.setBp((int)(Math.random()*100) + 45);
			Thread.sleep(100);
		}
	}

}
