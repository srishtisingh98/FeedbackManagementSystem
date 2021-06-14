package com.cg.fms.entites;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Feedback {

	@Id
	@GeneratedValue
	private int feedbackId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "participantId")
	private Participant participant;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "trainingId")
	private Program program;
	@NotBlank(message = "Rate the communication skills of the trainer")
	private int feedbackCriteria1;
	@NotBlank(message = "Rate the preparedness of the trainer")
	private int feedbackCriteria2;
	@NotBlank(message = "Rate the communication skills of the trainer")
	private int feedbackCriteria3;
	@NotBlank(message = "Rate the practicality of of the program")
	private int feedbackCriteria4;
	@NotBlank(message = "Rate the knowledge of the trainer")
	private int feedbackCriteria5;
	private String comments;
	@NotBlank
	private String suggestions;

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public int getFeedbackCriteria1() {
		return feedbackCriteria1;
	}

	public void setFeedbackCriteria1(int feedbackCriteria1) {
		this.feedbackCriteria1 = feedbackCriteria1;
	}

	public int getFeedbackCriteria2() {
		return feedbackCriteria2;
	}

	public void setFeedbackCriteria2(int feedbackCriteria2) {
		this.feedbackCriteria2 = feedbackCriteria2;
	}

	public int getFeedbackCriteria3() {
		return feedbackCriteria3;
	}

	public void setFeedbackCriteria3(int feedbackCriteria3) {
		this.feedbackCriteria3 = feedbackCriteria3;
	}

	public int getFeedbackCriteria4() {
		return feedbackCriteria4;
	}

	public void setFeedbackCriteria4(int feedbackCriteria4) {
		this.feedbackCriteria4 = feedbackCriteria4;
	}

	public int getFeedbackCriteria5() {
		return feedbackCriteria5;
	}

	public void setFeedbackCriteria5(int feedbackCriteria5) {
		this.feedbackCriteria5 = feedbackCriteria5;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	public Feedback(int feedbackId, Participant participant, Program program,
			@NotBlank(message = "Rate the communication skills of the trainer") int feedbackCriteria1,
			@NotBlank(message = "Rate the preparedness of the trainer") int feedbackCriteria2,
			@NotBlank(message = "Rate the communication skills of the trainer") int feedbackCriteria3,
			@NotBlank(message = "Rate the practicality of of the program") int feedbackCriteria4,
			@NotBlank(message = "Rate the knowledge of the trainer") int feedbackCriteria5, @NotBlank String comments,
			@NotBlank String suggestions) {
		super();
		this.feedbackId = feedbackId;
		this.participant = participant;
		this.program = program;
		this.feedbackCriteria1 = feedbackCriteria1;
		this.feedbackCriteria2 = feedbackCriteria2;
		this.feedbackCriteria3 = feedbackCriteria3;
		this.feedbackCriteria4 = feedbackCriteria4;
		this.feedbackCriteria5 = feedbackCriteria5;
		this.comments = comments;
		this.suggestions = suggestions;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", participant=" + participant + ", program=" + program
				+ ", feedbackCriteria1=" + feedbackCriteria1 + ", feedbackCriteria2=" + feedbackCriteria2
				+ ", feedbackCriteria3=" + feedbackCriteria3 + ", feedbackCriteria4=" + feedbackCriteria4
				+ ", feedbackCriteria5=" + feedbackCriteria5 + ", comments=" + comments + ", suggestions=" + suggestions
				+ "]";
	}

}
