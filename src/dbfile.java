
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbfile {
 
   private Connection con;
   private Statement st;
   private ResultSet rs;
   
   dbfile(){
   
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_register", "root","");
        st=con.createStatement();
  // System.out.println("dta bse conected");
       }catch(Exception e){
         System.out.println(e);
       }
   }
   
    public void registerStudent(String s_name,String s_pasword){
        
       String query="insert into registration(s_name,s_pasword)values('"+s_name+"','"+s_pasword+"')";
      System.out.println(query);
       try{
       st.executeUpdate(query);
       
       }catch(Exception e){
        System.out.println(e);
       }
    }
  
   
   public ResultSet MatchUser(String user, String pass){
   
        String query="select * from registration where s_name='"+user+"' and s_pasword='"+pass+"'";
        try{
        
         rs=st.executeQuery(query);
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
   }
   
    public ResultSet getstudentrecord (){
   
        String query="select * from registration"; 
        try{
        
         rs=st.executeQuery(query);
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
   }
   
      public ResultSet SearchRecords(String search){
   
        String query="select * from registration where s_name like '"+search+"%'"; 
        try{
        
         rs=st.executeQuery(query);
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
   }
      
     public void DeleteRecord(String search){
   
      String query="DELETE FROM registration WHERE s_name='"+search+"'";
      try{
      st.executeUpdate(query);
      
      }catch(Exception e){
      System.out.println(e);
      }
   }
    
   /*public void aplicantdata(String aplicantname,String aplicantcnic,String aplicantreligion,String aplicantphone,String aplicantcity,String aplicantgender,String aplicantaddress){
        
       String query="insert into apllicantinfo(aplicantname,aplicantcnic,aplicantreligion,aplicantphone,aplicantcity,aplicantgender,aplicantaddress)"
       + "values('"+aplicantname+"','"+aplicantcnic+"','"+aplicantreligion+"','"+aplicantphone+"','"+aplicantcity+"','"+aplicantgender+"','"+aplicantaddress+"')";
      System.out.println(query);
       try{
       st.executeUpdate(query);
       
       }catch(Exception e){
        System.out.println(e);
       }
       
    }
   
   public void guardaindata(String gname,String gcnic,String gphone,String gjob,String grelation){
        
     String query="insert into guardaindata(guardainname,guardaincnic,guardainphonenum,guardainjobstatus,relationwithaplicant)values( '"+gname+"','"+gcnic+"','"+gphone+"','"+gjob+"','"+grelation+"')";
      System.out.println(query);
       try{
      st.executeUpdate(query);
       
       }catch(Exception e){
        System.out.println(e);
       }
    }
   
   public void academicdata(String matricnum,String matricgrade,String matricboard,String matricpassyear,String internum,String intergrade,String interpassyear,String interboard,String field1,String field2,String field3){
        
       String query="insert into academicinfo(matricnumber,matricgrade,matricboard,matricpassyear,internumber,intergrade,interpassyear,interboard,field1,field2,field3)"
       + "values('"+matricnum+"','"+matricgrade+"','"+matricboard+"','"+matricpassyear+"','"+internum+"','"+intergrade+"','"+interpassyear+"','"+interboard+"','"+field1+"','"+field2+"','"+field3+"')";
      System.out.println(query);
       try{
       st.executeUpdate(query);
       
       }catch(Exception e){
        System.out.println(e);
       }
       
    }
   
   
  */
   public void formdata(String aplicantname,String aplicantcnic,String aplicantreligion,String aplicantphone,String aplicantcity,String aplicantgender,String aplicantaddress,String gname,String gcnic,String gphone,String gjob,String grelation,String matricnum,String matricgrade,String matricboard,String matricpassyear,String internum,String intergrade,String interpassyear,String interboard,String field1,String field2,String field3){
        
       String query="insert into form_registration(aplicantname,aplicantcnic,aplicantreligion,aplicantphone,aplicantcity,aplicantgender,aplicantaddress,guardainname,guardaincnic,guardainphonenum,guardainjobstatus,relationwithaplicant,matricnumber,matricgrade,matricboard,matricpassyear,internumber,intergrade,interpassyear,interboard,field1,field2,field3)"
       + "values('"+aplicantname+"','"+aplicantcnic+"','"+aplicantreligion+"','"+aplicantphone+"','"+aplicantcity+"','"+aplicantgender+"','"+aplicantaddress+"','"+gname+"','"+gcnic+"','"+gphone+"','"+gjob+"','"+grelation+"','"+matricnum+"','"+matricgrade+"','"+matricboard+"','"+matricpassyear+"','"+internum+"','"+intergrade+"','"+interpassyear+"','"+interboard+"','"+field1+"','"+field2+"','"+field3+"')";
      System.out.println(query);
       try{
       st.executeUpdate(query);
       
       }catch(Exception e){
        System.out.println(e);
       }
       
    }
     
   public void storeimage(String image){
  // insert into registration(s_name,s_pasword)values('"+s_name+"','"+s_pasword+"')";
       String query="insert into imagevalue(image)values('"+image+"')";
       System.out.println(query);
       try{
      st.executeUpdate(query);
       }
       catch(Exception e){
           System.out.println(e);}
   }
   
   
   public  ResultSet getformrecord(){
   
   String query="select * from form_registration";
   //    System.out.println(query);
   try{
      rs=st.executeQuery(query);
   }
   catch(Exception e){
           System.out.println(e);
           }
   return rs;
   }
   
     public ResultSet Searchformrecords(String search){
   
        String query="select * from form_registration where aplicantname like '"+search+"%'"; 
        try{
        
         rs=st.executeQuery(query);
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
   }
   
     public void DeleteformRecord(String search){
   
      String query="DELETE FROM form_registration WHERE aplicantname='"+search+"'";
      try{
      st.executeUpdate(query);
      
      }catch(Exception e){
      System.out.println(e);
      }
   }
   
     public ResultSet formview(String name){
   
        String query="select * from form_registration where aplicantname='"+name+"' ";
        try{
        
         rs=st.executeQuery(query);
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
   }
     
   public static void main(String[] args){
       dbfile db=new dbfile();
   }
}    

