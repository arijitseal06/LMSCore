package com.example.dao;

import java.util.List;

import com.example.model.Issue;

public interface IssueDao {

	public void save(Issue issue);
	public List<Issue> getallIssues();
	public Issue getIssue(int issueId);
	public void updateIssue(int issueId);
	public Issue deleteIssue(int issueId);
}
