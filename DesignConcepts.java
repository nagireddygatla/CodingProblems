package concepts;

public class DesignConcepts {
	
	private String name;
    private int age;
    private String passport;
    
    public DesignConcepts(String name, int age, String passport){
    	this.name = name;
    	this.age = age;
    	this.passport = passport;
    	
    }
    
    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof DesignConcepts)) {
            return false;
        }

        DesignConcepts user = (DesignConcepts) o;

        return user.name.equals(name) &&
                user.age == age &&
                user.passport.equals(passport);
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        result = 31 * result + passport.hashCode();
        return result;
    }

    public static void main(String [] args){
    	
    	DesignConcepts user1 = new DesignConcepts("mkyong", 35, "111222333");
    	DesignConcepts user2 = new DesignConcepts("mkyong", 35, "111222333");
    	System.out.println(user1.equals(user2)); // false
    }
    

}