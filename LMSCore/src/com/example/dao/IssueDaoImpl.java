package com.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.model.Issue;

public class IssueDaoImpl implements IssueDao{

	public List<Issue> issues = new ArrayList<>();
	public Map<Integer, Issue> issueMap = new HashMap<>();
	@Override
	public void save(Issue issue) {
		// TODO Auto-generated method stub
		issues.add(issue);
		issueMap.put(issue.getIssueId(), issue);
	}

	@Override
	public List<Issue> getallIssues() {
		// TODO Auto-generated method stub
		return issues;
	}

	@Override
	public Issue getIssue(int issueId) {
		// TODO Auto-generated method stub
		return issueMap.get(issueId);
	}

	@Override
	public void updateIssue(int issueId) {
		// TODO Auto-generated method stub
	}

	@Override
	public Issue deleteIssue(int issueId) {
		// TODO Auto-generated method stub
		return null;
	}

}
