package testimonials.domainlayer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Attractions {

		
		private Long attractionID;
		private String attractionName;
		private String attractionDescription;
		private String uploadedBy;
		private LocalDate uploadDate;
		private LocalTime uploadTime;
		
		
//Constructor
		
		public Attractions(Long attractionID, String attractionName, String attractionDescription, String uploadedBy,
				LocalDate uploadDate, LocalTime uploadTime) {
			super();
			this.attractionID = attractionID;
			this.attractionName = attractionName;
			this.attractionDescription = attractionDescription;
			this.uploadedBy = uploadedBy;
			this.uploadDate = uploadDate;
			this.uploadTime = uploadTime;
		}

//Getters and Setters

		public Long getAttractionID() {
			return attractionID;
		}


		public void setAttractionID(Long attractionID) {
			this.attractionID = attractionID;
		}


		public String getAttractionName() {
			return attractionName;
		}


		public void setAttractionName(String attractionName) {
			this.attractionName = attractionName;
		}


		public String getAttractionDescription() {
			return attractionDescription;
		}


		public void setAttractionDescription(String attractionDescription) {
			this.attractionDescription = attractionDescription;
		}


		public String getUploadedBy() {
			return uploadedBy;
		}


		public void setUploadedBy(String uploadedBy) {
			this.uploadedBy = uploadedBy;
		}


		public LocalDate getUploadDate() {
			return uploadDate;
		}


		public void setUploadDate(LocalDate uploadDate) {
			this.uploadDate = uploadDate;
		}


		public LocalTime getUploadTime() {
			return uploadTime;
		}


		public void setUploadTime(LocalTime uploadTime) {
			this.uploadTime = uploadTime;
		}
		
//Validation
		
		
		public boolean validation() {
			
		
		if (this.attractionID <= 0) {
			return false;
			
		} if (this.attractionName == null || this.attractionName.isEmpty() || this.attractionName.isBlank()) {
			return false;
		}
		  if (this.attractionDescription == null || this.attractionDescription.isEmpty() || this.attractionDescription.isBlank()) {
			return false;
		}
		  if (this.uploadedBy == null || this.uploadedBy.isEmpty() || this.uploadedBy.isBlank()) {
				return false;
		}
		  if (this.uploadDate == null) {
				return false;
		}
		  if (this.uploadTime == null ) {
				return false;
		}
		return false;
		  
		}

//Hashcode
		@Override
		public int hashCode() {
			return Objects.hash(attractionDescription, attractionID, attractionName, uploadDate, uploadTime,
					uploadedBy);
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
			Attractions other = (Attractions) obj;
			return Objects.equals(attractionDescription, other.attractionDescription)
					&& Objects.equals(attractionID, other.attractionID)
					&& Objects.equals(attractionName, other.attractionName)
					&& Objects.equals(uploadDate, other.uploadDate) && Objects.equals(uploadTime, other.uploadTime)
					&& Objects.equals(uploadedBy, other.uploadedBy);
		}

		
//To String
		@Override
		public String toString() {
			return "Attractions [attractionID=" + attractionID + ", attractionName=" + attractionName
					+ ", attractionDescription=" + attractionDescription + ", uploadedBy=" + uploadedBy
					+ ", uploadDate=" + uploadDate + ", uploadTime=" + uploadTime + ", getAttractionID()="
					+ getAttractionID() + ", getAttractionName()=" + getAttractionName()
					+ ", getAttractionDescription()=" + getAttractionDescription() + ", getUploadedBy()="
					+ getUploadedBy() + ", getUploadDate()=" + getUploadDate() + ", getUploadTime()=" + getUploadTime()
					+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
					+ "]";
		}
		
		
		
		

	
	

	
	

}
