package testimonials.domainlayer;

import java.util.Objects;
import java.time.LocalTime;
import java.time.LocalDate;

public class Customer {
	 
			
			private Long customerID;
			private String customerFirstName;
			private String customerLastName;
			private String customerNickname;
			private LocalDate dateCreated;
			private LocalTime timeCreated;
			
			
			
	public Customer(Long customerID, String customerFirstName, String customerLastName, 
					String customerNickname, LocalDate dateCreated, LocalTime timeCreated) {
				
				this.customerID = customerID;
				this.customerFirstName = customerFirstName;
				this.customerLastName = customerLastName;
				this.customerNickname = customerNickname;
				this.dateCreated = dateCreated;
				this.timeCreated = timeCreated;
				
			}

	//Getters and Setters
			
			public Long getCustomerID() {
				return customerID;
			}
		
			public void setCustomerID(Long customerID) {
				this.customerID = customerID;
			}
		
			public String getCustomerFirstName() {
				return customerFirstName;
			}
		
			public void setCustomerFirstName(String customerFirstName) {
				this.customerFirstName = customerFirstName;
			}
		
			public String getCustomerLastName() {
				return customerLastName;
			}
		
			public void setCustomerLastName(String customerLastName) {
				this.customerLastName = customerLastName;
			}
		
			public String getCustomerNickname() {
				return customerNickname;
			}
		
			public void setCustomerNickname(String customerNickname) {
				this.customerNickname = customerNickname;
			}
		
			public LocalDate getDateCreated() {
				return dateCreated;
			}
		
			public void setDateCreated(LocalDate dateCreated) {
				this.dateCreated = dateCreated;
			}
		
			public LocalTime getTimeCreated() {
				return timeCreated;
			}
		
			public void setTimeCreated(LocalTime timeCreated) {
				this.timeCreated = timeCreated;
			}
			
			
	//Validation
			
			
			public boolean validation() {
				
			
			if (this.customerID <= 0) {
				return false;
				
			} if (this.customerFirstName == null || this.customerFirstName.isEmpty() || this.customerFirstName.isBlank()) {
				return false;
			}
			  if (this.customerLastName == null || this.customerLastName.isEmpty() || this.customerLastName.isBlank()) {
				return false;
			}
			  if (this.customerNickname == null || this.customerNickname.isEmpty() || this.customerNickname.isBlank()) {
					return false;
			}
			  if (this.dateCreated == null) {
					return false;
			}
			  if (this.timeCreated == null ) {
					return false;
			}
			return false;
			  
			}

//Hashcode
			@Override
			public int hashCode() {
				return Objects.hash(customerFirstName, customerID, customerLastName, customerNickname, dateCreated,
						timeCreated);
			}
//Equals
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Customer other = (Customer) obj;
				return Objects.equals(customerFirstName, other.customerFirstName)
						&& Objects.equals(customerID, other.customerID)
						&& Objects.equals(customerLastName, other.customerLastName)
						&& Objects.equals(customerNickname, other.customerNickname)
						&& Objects.equals(dateCreated, other.dateCreated)
						&& Objects.equals(timeCreated, other.timeCreated);
			}
//To String
			@Override
			public String toString() {
				return "Customer [customerID=" + customerID + ", customerFirstName=" + customerFirstName
						+ ", customerLastName=" + customerLastName + ", customerNickname=" + customerNickname
						+ ", dateCreated=" + dateCreated + ", timeCreated=" + timeCreated + ", getCustomerID()="
						+ getCustomerID() + ", getCustomerFirstName()=" + getCustomerFirstName()
						+ ", getCustomerLastName()=" + getCustomerLastName() + ", getCustomerNickname()="
						+ getCustomerNickname() + ", getDateCreated()=" + getDateCreated() + ", getTimeCreated()="
						+ getTimeCreated() + ", validation()=" + validation() + ", hashCode()=" + hashCode()
						+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
			}

			
			
			
	
}
