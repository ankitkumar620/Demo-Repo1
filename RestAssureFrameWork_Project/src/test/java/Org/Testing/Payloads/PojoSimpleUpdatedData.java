package Org.Testing.Payloads;

public class PojoSimpleUpdatedData {

	public static PojoBodyData GetUpdatedBodyData()
	{
		PojoBodyData data= new PojoBodyData();
		data.setFirstName("Ankit");
		data.setLastName("Singh");
		data.setAge(30);
		data.setProfession("Student");
		data.setId(2022);
		return data;
	}
}
