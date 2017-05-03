package ociopleno;
// Generated 04-may-2017 0:16:13 by Hibernate Tools 4.3.1



/**
 * ParticipaId generated by hbm2java
 */
public class ParticipaId  implements java.io.Serializable {


     private int idc;
     private int ida;

    public ParticipaId() {
    }

    public ParticipaId(int idc, int ida) {
       this.idc = idc;
       this.ida = ida;
    }
   
    public int getIdc() {
        return this.idc;
    }
    
    public void setIdc(int idc) {
        this.idc = idc;
    }
    public int getIda() {
        return this.ida;
    }
    
    public void setIda(int ida) {
        this.ida = ida;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ParticipaId) ) return false;
		 ParticipaId castOther = ( ParticipaId ) other; 
         
		 return (this.getIdc()==castOther.getIdc())
 && (this.getIda()==castOther.getIda());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdc();
         result = 37 * result + this.getIda();
         return result;
   }   


}


