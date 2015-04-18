package agents;

public class AgentDistribution {
	double ExpertPercentage, AveragePercentage, NovicePercentage;
	
	public AgentDistribution(double Expert, double Average, double Novice){
		this.ExpertPercentage = Expert;
		this.AveragePercentage = Average;
		this.NovicePercentage = Novice;
		
	}
	
	public int GetNoviceAgentCount(int TotalAgents){
		return (int) (NovicePercentage * TotalAgents); 
	}
	
	
	public int GetAverageAgentCount(int TotalAgents){
		return (int) (AveragePercentage * TotalAgents); 
	}
	
	
	public int GetExpertAgentCount(int TotalAgents){
		return (int) (ExpertPercentage * TotalAgents); 
	}


}
