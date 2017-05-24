package org.light4j.springboot.xml.noScan;

import org.springframework.stereotype.Service;

@Service
public class NoScanService {
	public NoScanService() {
		System.out.println("I am NoScanService,i can not be scan");
	}
}
