package domain;

import java.io.Serializable;
import java.util.Objects;

 
public class Reviews implements Serializable {
	
// Variables	
	
			private static final long serialVersionUID = 7661657477853633935L;
			private Long reviewID;
			private String reviewDescription;
			private String reviewer;
			private String reviewDate;
			private String reviewTime;
			private int reviewStars;
		
		
public Reviews(Long reviewID, String reviewDescription, String reviewer, 
				String reviewDate, String reviewTime, int reviewStars) {
			
			this.reviewID = reviewID;
			this.reviewDescription = reviewDescription;
			this.reviewer = reviewer;
			this.reviewDate = reviewDate;
			this.reviewTime = reviewTime;
			this.reviewStars = reviewStars;
			
		}

// Getters and Setters
						

		public Long getReviewID() {
			return reviewID;
		}
		
		public void setReviewID(Long reviewID) {
			this.reviewID = reviewID;
		}
		
		public String getReviewDescription() {
			return reviewDescription;
		}
		
		public void setReviewDescription(String reviewDescription) {
			this.reviewDescription = reviewDescription;
		}
		
		public String getReviewer() {
			return reviewer;
		}
		
		public void setReviewer(String reviewer) {
			this.reviewer = reviewer;
		}
		
		public String getReviewDate() {
			return reviewDate;
		}
		
		public void setReviewDate(String reviewDate) {
			this.reviewDate = reviewDate;
		}
		
		public String getReviewTime() {
			return reviewTime;
		}
		
		public void setReviewTime(String reviewTime) {
			this.reviewTime = reviewTime;
		}
		
		public int getReviewStars() {
			return reviewStars;
		
		}
		
		public void setReviewStars(int reviewStars) {
			this.reviewStars = reviewStars;
		}


// Validation

		public boolean validation() {
			
		
		if (this.reviewID <= 0) {
			return false;
			
		} if (this.reviewDescription == null || this.reviewDescription.isEmpty() || this.reviewDescription.isBlank()) {
			return false;
			
		} if (this.reviewer == null) {
			return false;
		}
		  if (this.reviewDate == null) {
			return false;
		}
		  if (this.reviewTime == null) {
				return false;
		}
		  if (this.reviewStars <= 0 ) {
				return false;
		}
		return false;
		  
		}
		
		
		
// Equals Method
		
@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Reviews other = (Reviews) obj;
			return Objects.equals(reviewDate, other.reviewDate)
					&& Objects.equals(reviewDescription, other.reviewDescription)
					&& Objects.equals(reviewID, other.reviewID) && reviewStars == other.reviewStars
					&& Objects.equals(reviewTime, other.reviewTime) && Objects.equals(reviewer, other.reviewer);
		}
		

// hashCode

		@Override
		public int hashCode() {
			return Objects.hash(reviewDate, reviewDescription, reviewID, reviewStars, reviewTime, reviewer);
		}

// toString

@Override
public String toString() {
	return "Reviews [reviewID=" + reviewID + ", reviewDescription=" + reviewDescription + ", reviewer=" + reviewer
			+ ", reviewDate=" + reviewDate + ", reviewTime=" + reviewTime + ", reviewStars=" + reviewStars + "]";
	
	}

}


