		import java.io.UnsupportedEncodingException;
		import java.nio.charset.Charset;
		import java.util.Locale;
		import java.util.*;
		
		public class Person implements Comparable
		{
		
			private String name;
			private int age;
			private String contactInfo;
			public Person(String name, int age, String contactInfo) {
				this.name= name;
				this.age= age;
				this.contactInfo=contactInfo;
				
			}
			@Override
			public String toString() 
			{
				return "" + (name != null ?  name + ", " : "")
						+"age: "+  age + ", "
						+ (contactInfo != null ? "contact: "+ contactInfo : "");
			}
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + age;
				result = prime * result
						+ ((contactInfo == null) ? 0 : contactInfo.hashCode());
				result = prime * result + ((name == null) ? 0 : name.hashCode());
				return result;
			}
			/**
			 * @param Obj Object is passed as an argument to compare 
			 */
			@Override
			public boolean equals(Object obj) 
			{
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Person other = (Person) obj;
				if (age != other.age)
					return false;
				if (contactInfo == null) {
					if (other.contactInfo != null)
						return false;
				} else if (!contactInfo.equals(other.contactInfo))
					return false;
				if (name == null) {
					if (other.name != null)
						return false;
				} else if (!name.equals(other.name))
					return false;
				return true;
			}
			public int compareTo(Person o) 
			{
				if(this.name.compareTo(o.name)==1)
				{
					return 1;
				}
				
				if(this.name.compareTo(o.name)==-1)
				{
					return -1;
				}
				else
					{
							if(this.age > o.age)
						{
								return 1;
						}
							else if(this.age < o.age)
						{
							return -1;
						}
		
							else
							{
								if(this.contactInfo.compareTo(o.name)==1)
								{
									return 1;
								}
		
								if(this.contactInfo.compareTo(o.name)==-1)
								{
									return -1;
								}
								else 
								{
									return 0;
								}
							}
				}
			}
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
		
		
			
		}
		/**
		 * ITs okay Im autistic too!
		 **/
