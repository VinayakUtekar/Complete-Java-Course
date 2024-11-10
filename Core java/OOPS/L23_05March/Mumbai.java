//ParentClass
class  DhirubhaiAmbani
{
	String company="Reliance Inds."; //state
	public void thinkingstyle()//Behaviour
	{
		System.out.println("Builds Multiple Companies");
	}
}

//Child CLass
class MukeshAmbani extends DhirubhaiAmbani
{
}

//Driver Class
class Mumbai
{
	public static void main(String[] args) 
	{
		MukeshAmbani ref = new MukeshAmbani();
		System.out.println("Company : " + ref.company);
		ref.thinkingstyle();
	}
}
