package me.automationdomination.plugins.webinspect.service.ssc;

import java.util.Map;

public interface SscService {

	public Map<Integer, String> retrieveProjects();

    public String uploadScanFile(String scanFilePathName);

}