package com.dev.iota;

import com.dev.iota.util.Constants;

public class Snapshot {

	private String snapshotName;

	private long totalAddresses;

	// including 100 Mi
	private long oneiToHundredMi;
	// including 1 Gi
	private long hundredMiToOneGi;
	// including 10 Gi
	private long oneGiToTenGi;
	// including 100 Gi
	private long tenGiToHundredGi;
	// including 1 Ti
	private long hundredGiToOneTi;
	private long oneTiToOnePi;

	public String getSnapshotName() {
		return snapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
	}

	public long getTotalAddresses() {
		return totalAddresses;
	}

	public void setTotalAddresses(long totalAddresses) {
		this.totalAddresses = totalAddresses;
	}

	public long getOneiToHundredMi() {
		return oneiToHundredMi;
	}

	public void setOneiToHundredMi(long oneiToHundredMi) {
		this.oneiToHundredMi = oneiToHundredMi;
	}

	public long getHundredMiToOneGi() {
		return hundredMiToOneGi;
	}

	public void setHundredMiToOneGi(long hundredMiToOneGi) {
		this.hundredMiToOneGi = hundredMiToOneGi;
	}

	public long getOneGiToTenGi() {
		return oneGiToTenGi;
	}

	public void setOneGiToTenGi(long oneGiToTenGi) {
		this.oneGiToTenGi = oneGiToTenGi;
	}

	public long getTenGiToHundredGi() {
		return tenGiToHundredGi;
	}

	public void setTenGiToHundredGi(long tenGiToHundredGi) {
		this.tenGiToHundredGi = tenGiToHundredGi;
	}

	public long getHundredGiToOneTi() {
		return hundredGiToOneTi;
	}

	public void setHundredGiToOneTi(long hundredGiToOneTi) {
		this.hundredGiToOneTi = hundredGiToOneTi;
	}

	public long getOneTiToOnePi() {
		return oneTiToOnePi;
	}

	public void setOneTiToOnePi(long oneTiToOnePi) {
		this.oneTiToOnePi = oneTiToOnePi;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		builder.append("Snapshot : " + snapshotName);
		builder.append(Constants.NEWLINE);
		builder.append("Total Addresses " + totalAddresses);
		builder.append(Constants.NEWLINE);
		builder.append("More than 1Ti " + oneTiToOnePi);
		builder.append(Constants.NEWLINE);
		builder.append("100 Gi - 1Ti " + hundredGiToOneTi);
		builder.append(Constants.NEWLINE);
		builder.append("10 Gi - 100 Gi " + tenGiToHundredGi);
		builder.append(Constants.NEWLINE);
		builder.append("1 Gi - 10 Gi " + oneGiToTenGi);
		builder.append(Constants.NEWLINE);
		builder.append("100 Mi - 1 Gi " + hundredMiToOneGi);
		builder.append(Constants.NEWLINE);
		builder.append("1 i - 100 Mi " + oneiToHundredMi);
		builder.append(Constants.NEWLINE);
		return builder.toString();
	}

}
