package domain;

import java.util.Objects;

public class Attractions {

		
		private Long attractionID;
		private String attractionName;
		private String attractionDescription;
		private String uploadedBy;
		private String uploadDay;
		private String uploadMonth;
		private String uploadYear;
		private String uploadTime;
	
		
		
		
//Constructor
		
		public Attractions(Long attractionID, String attractionName, String attractionDescription, String uploadedBy,
				String uploadDay, String uploadMonth, String uploadYear, String uploadTime) {
			super();
			this.attractionID = attractionID;
			this.attractionName = attractionName;
			this.attractionDescription = attractionDescription;
			this.uploadedBy = uploadedBy;
			this.uploadDay = uploadDay;
			this.uploadMonth = uploadMonth;
			this.uploadYear = uploadYear;
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


		public String getUploadDay() {
			return uploadDay;
		}


		public void setUploadDay(String uploadDay) {
			this.uploadDay = uploadDay;
		}


		public String getUploadMonth() {
			return uploadMonth;
		}


		public void setUploadMonth(String uploadMonth) {
			this.uploadMonth = uploadMonth;
		}
		
		public String getUploadYear() {
			return uploadYear;
		}


		public void setUploadYear(String uploadYear) {
			this.uploadYear = uploadYear;
		}
		
		public String getUploadTime() {
			return uploadTime;
		}
		
		
		public void setUploadTime(String uploadTime) {
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
		  if (this.uploadDay == null) {
				return false;
		}
		  if (this.uploadMonth == null) {
				return false;
		}
		  if (this.uploadYear == null) {
				return false;
		}
		  if (this.uploadTime == null ) {
				return false;
		}
		return false;
		  
		}

// Hashcode
		public int hashCode() {
			return Objects.hash(attractionDescription, attractionID, attractionName, uploadDay, uploadMonth, uploadTime,
					uploadYear, uploadedBy);
		}

// Equals
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
					&& Objects.equals(uploadDay, other.uploadDay) && Objects.equals(uploadMonth, other.uploadMonth)
					&& Objects.equals(uploadTime, other.uploadTime) && Objects.equals(uploadYear, other.uploadYear)
					&& Objects.equals(uploadedBy, other.uploadedBy);
		}
		
// To String
		@Override
		public String toString() {
			return "Attractions [attractionID=" + attractionID + ", attractionName=" + attractionName
					+ ", attractionDescription=" + attractionDescription + ", uploadedBy=" + uploadedBy + ", uploadDay="
					+ uploadDay + ", uploadMonth=" + uploadMonth + ", uploadYear=" + uploadYear + ", uploadTime="
					+ uploadTime + "]";
		}

		
		

		

	
	

	
	

}
