package agents;


/*
 *Create 1 file each for Novice, Medium and Expert Tasks.
 *Add Task Difficulty to the Task Details : Example -> TaskDifficulty=1
 * */


import agents.Capabilities;

public class AgentTypes {
	
	private double [] AgentSpec;

	public double [] GetExpertAgent(int NumOfCapabilities){
		
		int NumOfExpertCapabilities = (int) ( Math.ceil(NumOfCapabilities/3.0) );  	
		 AgentSpec  = new double[NumOfCapabilities];
		int i=0;
		
		while(i<NumOfExpertCapabilities){
			Capabilities Temp = new Capabilities();
			Temp.MakeAgentWithQualityBetween( 0.7, 1.0);
			AgentSpec[i] = round1d(Temp.getQuality());
			i++;
		}
		
		while(i<NumOfCapabilities){
			Capabilities Temp = new Capabilities();
			AgentSpec[i] = round1d(Math.random()*(1.0));
			i++;
		}
		
		return AgentSpec;
	}
	

	public double [] GetAverageAgent(int NumOfCapabilities){
	
		int NumOfAverageCapabilities = (int) ( Math.ceil(NumOfCapabilities/3.0))   ;  // Make the task Average SubTask Dominant  ;   
		
		int NumOfExpertCapabilities = (int) (Math.random() * Math.floor(NumOfCapabilities/3));; 
		
		AgentSpec = new double[NumOfCapabilities];
		int i=0;
	

		while(i<NumOfExpertCapabilities){
			Capabilities Temp = new Capabilities();
			Temp.MakeAgentWithQualityBetween( 0.7, 1.0);
			AgentSpec[i] = round1d(Temp.getQuality());
			i++;
		}
		
		
		while(i<NumOfAverageCapabilities + NumOfExpertCapabilities){
			Capabilities Temp = new Capabilities();
			Temp.MakeAgentWithQualityBetween( 0.3, 0.699999);
			AgentSpec[i] = round1d(Temp.getQuality());
			i++;
		}
		
	
		while(i<NumOfCapabilities){
			Capabilities Temp = new Capabilities();
			Temp.MakeAgentWithQualityBetween( 0.0, 0.699999);
			AgentSpec[i] = round1d(Temp.getQuality());
			i++;		}
		
		
		return AgentSpec;
	}
	
	
	public double[] GetNoviceAgent(int NumOfCapabilities){
		
		int NumOfExpertCapabilities = (int) (Math.random() * Math.floor(NumOfCapabilities/3));
		int NumOfAverageCapabilities = (int) (Math.random() * Math.floor(NumOfCapabilities/3));
		
		int NumOfNoviceCapabilities = NumOfCapabilities - (NumOfExpertCapabilities + NumOfAverageCapabilities ) ;   
		
		 AgentSpec = new double[NumOfCapabilities];
		int i=0;
		
		while(i<NumOfNoviceCapabilities){
			Capabilities Temp = new Capabilities();
			Temp.MakeAgentWithQualityBetween( 0.0, 0.299999);
			AgentSpec[i] = round1d(Temp.getQuality());
			i++;
		}
		
		while(i<NumOfNoviceCapabilities+NumOfExpertCapabilities){
			Capabilities Temp = new Capabilities();
			Temp.MakeAgentWithQualityBetween( 0.7, 1.0);
			AgentSpec[i] = round1d(Temp.getQuality());
			i++;
		}
		
		while(i<NumOfCapabilities){
			Capabilities Temp = new Capabilities();
			Temp.MakeAgentWithQualityBetween( 0.3, 0.699999);
			AgentSpec[i] = round1d(0.1+Math.random()*(1.0-0.1));
			i++;
		}
		
		return AgentSpec;
	}
	
	
	public static double round1d(double a){
		return a;
	}//end of method
	
	
	public void CheckType(double [] AgentSpec){
	
		int ExpertCount=0, NoviceCount=0, AverageCount=0;
		
		for (int i=0; i< AgentSpec.length; i++){
		if (AgentSpec[i] >= 0.7){ ExpertCount++;}
		else if(AgentSpec[i] >= 0.3){ AverageCount++;}
		else{ NoviceCount++;}
		}
		
		
		if((double)ExpertCount >=  AgentSpec.length/3)
			System.out.println("Expert");
		
		else if ((double)AverageCount >=  AgentSpec.length/3)
			System.out.println("Average");
		
		else
			System.out.println("Novice");
		
	}
	
	

		
	

	public static void main(String [] args){
		
		AgentTypes A = new AgentTypes();
		A.CheckType(A.AgentSpec);
		A.CheckType(A.AgentSpec);
		A.CheckType(A.AgentSpec);
		
	}
	
}//end class










	










