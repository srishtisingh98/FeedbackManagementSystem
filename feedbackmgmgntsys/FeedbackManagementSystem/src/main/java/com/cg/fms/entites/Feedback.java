package com.cg.fms.entites;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "feedback")
public class Feedback {

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee participant;
	@OneToOne
	@JoinColumn(name = "training_id")
	private Program program;
	@NotBlank
	private int feedbackCriteria1;
	@NotBlank
	private int feedbackCriteria2;
	@NotBlank
	private int feedbackCriteria3;
	@NotBlank
	private int feedbackCriteria4;
	@NotBlank
	private int feedbackCriteria5;
	@NotBlank
	private String comments;
	@NotBlank
	private String suggestions;

	public Employee getParticipant() {
		return participant;
	}

	public void setParticipant(Employee participant) {
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

	public Feedback(Employee participant, Program program, @NotBlank int feedbackCriteria1,
			@NotBlank int feedbackCriteria2, @NotBlank int feedbackCriteria3, @NotBlank int feedbackCriteria4,
			@NotBlank int feedbackCriteria5, @NotBlank String comments, @NotBlank String suggestions) {
		super();
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
		return "Feedback [participant=" + participant + ", program=" + program + ", feedbackCriteria1="
				+ feedbackCriteria1 + ", feedbackCriteria2=" + feedbackCriteria2 + ", feedbackCriteria3="
				+ feedbackCriteria3 + ", feedbackCriteria4=" + feedbackCriteria4 + ", feedbackCriteria5="
				+ feedbackCriteria5 + ", comments=" + comments + ", suggestions=" + suggestions + "]";
	}

}
