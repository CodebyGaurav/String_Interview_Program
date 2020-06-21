package string_package;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sqdsr {

public static String epochconverter(String s)
{
	String res="";
	String str = s;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy@HH-mm-ss");
	Date date;
	try {
		date = df.parse(str);
		long epoch = date.getTime();
		 res=Long.toHexString(epoch);
	} catch (java.text.ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  return res;
	
}
			public static void main(String[] args) {
			
			JSONParser parser = new JSONParser();
			
			try {
			Object obj = parser.parse(new FileReader("/Users/gauravsharma_2icloud.com/Downloads/finaljason.json"));
			
			JSONObject jsonObject = (JSONObject) obj;
			
			String Req_ID=(String)jsonObject.get("Requester_ID");
			System.out.println(Req_ID);//for testing only
			
			String Txn_Ref_no=(String)jsonObject.get("Txn_Ref_No");
			System.out.println(Txn_Ref_no);
			
			String lang=(String)jsonObject.get("language");
			System.out.println(lang);
			
			JSONObject jsonObject1=(JSONObject)jsonObject.get("TicketBlock");
			
			JSONArray dyobj = new JSONArray();
			dyobj=(JSONArray)jsonObject1.get("dynamic_block");
			String sqdsr=""+"(";
			
			
			for(int i=0;i<dyobj.size();i++)
			{
				JSONObject jsonObject2=(JSONObject)dyobj.get(i);
				String op_ID=Integer.toHexString(Integer.parseInt((String)jsonObject2.get("OpID")));
				
				
				
				String No_of_ticket=Integer.toHexString(Integer.parseInt((String)jsonObject2.get("NoOfTickets")));
				sqdsr=sqdsr+"<"+op_ID+"|"+No_of_ticket+"[";
				
				JSONArray Tinfo = new JSONArray();
				Tinfo=(JSONArray)jsonObject2.get("TicketInfo");
				System.out.println(Tinfo.size());
				
				for(int j=0;j<Tinfo.size();j++)
				{
					sqdsr=sqdsr+"%";
					
					JSONObject jsonObject3=(JSONObject)Tinfo.get(j);
					sqdsr=sqdsr+Integer.toHexString(Integer.parseInt((String)jsonObject3.get("grp_size")))+"|"+Integer.toHexString(Integer.parseInt((String)jsonObject3.get("Src_Stn")))+"|"+Integer.toHexString(Integer.parseInt((String)jsonObject3.get("Dest_Stn")))
					+"|"+epochconverter((String)jsonObject3.get("active_date") )+"|"+Integer.toHexString(Integer.parseInt((String)jsonObject3.get("tkt_validity")))+"|"+Integer.toHexString(Integer.parseInt((String)jsonObject3.get("Total_Fare")))+"|"+Integer.toHexString(Integer.parseInt((String)jsonObject3.get( "product_id")))
					+"|"+Integer.toHexString(Integer.parseInt((String)jsonObject3.get("service_id")))+"|"+Integer.toHexString(Integer.parseInt((String)jsonObject3.get("duration")))+"%";
					
			
			
			
			
				}
				sqdsr=sqdsr+"]"+">"+")";
				
			}
			
			System.out.println(sqdsr);
			
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			} catch (ParseException e) {
			e.printStackTrace();
			}
}
}
