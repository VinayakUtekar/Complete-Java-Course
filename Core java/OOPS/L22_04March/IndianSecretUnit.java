import java.util.Scanner;

class RAWAgent
{
	private int RawAgentBatchId;
	private String RawAgentCodeName;
	private String RawAgentMissionName;

	RAWAgent(int RawAgentBatchId, String RawAgentCodeName, String RawAgentMissionName)
	{
		this.RawAgentBatchId = RawAgentBatchId;
		this.RawAgentCodeName = RawAgentCodeName;
		this.RawAgentMissionName = RawAgentMissionName;
	}

	public int getRawAgentBatchId()
	{
		return RawAgentBatchId;
	}

	public String getRawAgentCodeName()
	{
		return RawAgentCodeName;
	}

	public String getRawAgentMissionName()
	{
		return RawAgentMissionName;
	}

	public void setRawAgentBatchId(int RawAgentBatchId)
	{ 
		this.RawAgentBatchId = RawAgentBatchId;
	}

	public void setRawAgentCodeName(String RawAgentCodeName)
	{ 
		this.RawAgentCodeName = RawAgentCodeName;
	}

	public void setRawAgentMissionName(String RawAgentMissionName)
	{ 
		this.RawAgentMissionName = RawAgentMissionName;
	}
}

class IndianSecretUnit
{
	RAWAgent a;
	
	public void data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------->");
		System.out.println("Enter Agent Id : ");
		int id = sc.nextInt(); sc.nextLine();
		System.out.println("Enter Agent Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Mission Name : ");
		String mission = sc.nextLine();
		a = new RAWAgent(id, name, mission);
	}

	public void UpdateData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------->");
		System.out.println("Enter Updated Agent Id : ");
		int id = sc.nextInt(); sc.nextLine();
		a.setRawAgentBatchId(id);
		System.out.println("Enter Updated Agent Name : ");
		String name = sc.nextLine();
		a.setRawAgentCodeName(name);
		System.out.println("Enter Updated Mission Name : ");
		String mission = sc.nextLine();
		a.setRawAgentMissionName(mission);
	}

	public void details()
	{
		System.out.println("########################################################");
		System.out.println("Agent Id : " + a.getRawAgentBatchId());
		System.out.println("Agent Name : " + a.getRawAgentCodeName());
		System.out.println("Agent Mission : " + a.getRawAgentMissionName());
	}

	public void UpdateDetails()
	{
		System.out.println("########################################################");
		System.out.println("Updated Agent Id : " + a.getRawAgentBatchId());
		System.out.println("Updated Agent Name : " + a.getRawAgentCodeName());
		System.out.println("Updated Agent Mission : " + a.getRawAgentMissionName());
	}

	public static void main(String[] args) 
	{
		//Agent 1
		IndianSecretUnit ref1 = new IndianSecretUnit();
		ref1.data();

		//Agent 2
		IndianSecretUnit ref2 = new IndianSecretUnit();
		ref2.data();

		//Agent 3
		IndianSecretUnit ref3 = new IndianSecretUnit();
		ref3.data();

		//Agent 4
		IndianSecretUnit ref4 = new IndianSecretUnit();
		ref4.data();

		//Agent 5
		IndianSecretUnit ref5 = new IndianSecretUnit();
		ref5.data();

		ref1.details();
		ref2.details();
		ref3.details();
		ref4.details();
		ref5.details();

		ref1.UpdateData();
		ref2.UpdateData();
		ref3.UpdateData();
		ref4.UpdateData();
		ref5.UpdateData();
			
		
		System.out.println("Agent 1 Details : ");
		ref1.UpdateDetails();
		System.out.println("Agent 2 Details : ");
		ref2.UpdateDetails();
		System.out.println("Agent 3 Details : ");
		ref3.UpdateDetails();
		System.out.println("Agent 4 Details : ");
		ref4.UpdateDetails();
		System.out.println("Agent 5 Details : ");
		ref5.UpdateDetails();
		
	}
}
