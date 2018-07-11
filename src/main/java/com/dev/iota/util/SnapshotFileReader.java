package com.dev.iota.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SnapshotFileReader {

	public List<Long> getIotaPerAddressList(String fileName) {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);

		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(inputStream));

		String firstRow = bufferReader.lines().findFirst().get();
		Stream<String> stream = bufferReader.lines().parallel();

		if (firstRow.contains(Constants.COLON)) {
			return stream.map(s -> Long.valueOf(s.split(Constants.COLON)[1])).collect(Collectors.toList());
		}

		else if (firstRow.contains(Constants.SEMI_COLON)) {
			return stream.map(s -> Long.valueOf(s.split(Constants.SEMI_COLON)[1])).collect(Collectors.toList());
		}

		return new ArrayList<>();

	}

}
