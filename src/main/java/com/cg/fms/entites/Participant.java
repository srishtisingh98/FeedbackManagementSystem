package com.cg.fms.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Participant")
public class Participant {
	
	@Id
	@GeneratedValue
	private int participantId;
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#%&*$])(?=\\S+$).{8,16}$", message = "password must be 8 to 16 characters long and consist of at least :"
			+ " one digit, one lowercase alphabet, one Uppercase alphabet and one special character in the bracket with No white space allowed.")
	@NotBlank
	private String password;
	@Column (name= "feedback_Id")
	@OneToOne
	@JoinColumn(name = "feedbackId")
	private Feedback feedback;
	@Column (name= "trainingID")
	@OneToOne 
	@JoinColumn(name = "trainingId")
	private Program program;
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Feedback getFeedback() {
		return feedback;
	}
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public Participant(int participantId,
			@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#%&*$])(?=\\S+$).{8,16}$", message = "password must be 8 to 16 characters long and consist of at least : one digit, one lowercase alphabet, one Uppercase alphabet and one special character in the bracket with No white space allowed.") @NotBlank String password,
			Feedback feedback, Program program) {
		super();
		this.participantId = participantId;
		this.password = password;
		this.feedback = feedback;
		this.program = program;
	}
	@Override
	public String toString() {
		return "Participant [participantId=" + participantId + ", password=" + password + ", feedback=" + feedback
				+ ", program=" + program + "]";
	}
	
	
	
	
	
	

}
