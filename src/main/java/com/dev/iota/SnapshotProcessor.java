package com.dev.iota;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.dev.iota.util.Constants;

public class SnapshotProcessor {

	public Snapshot populateAddressAnalyser(List<Long> iotaTokens, String snapshotName) {

		Supplier<Stream<Long>> streamSupplier = () -> iotaTokens.parallelStream();

		Snapshot snapshot = new Snapshot();

		snapshot.setSnapshotName(snapshotName);

		snapshot.setOneiToHundredMi(streamSupplier.get().filter(s -> s <= Constants.HUNDRED_MI).count());

		snapshot.setHundredMiToOneGi(
				streamSupplier.get().filter(s -> s > Constants.HUNDRED_MI && s <= Constants.ONE_GI).count());

		snapshot.setOneGiToTenGi(
				streamSupplier.get().filter(s -> s > Constants.ONE_GI && s <= Constants.TEN_GI).count());

		snapshot.setTenGiToHundredGi(
				streamSupplier.get().filter(s -> s > Constants.TEN_GI && s <= Constants.HUNDRED_GI).count());

		snapshot.setHundredGiToOneTi(
				streamSupplier.get().filter(s -> s > Constants.HUNDRED_GI && s <= Constants.ONE_TI).count());

		snapshot.setOneTiToOnePi(
				streamSupplier.get().filter(s -> s > Constants.ONE_TI && s <= Constants.ONE_PI).count());

		snapshot.setTotalAddresses(streamSupplier.get().count());
		System.out.println(snapshot.toString());
		return snapshot;
	}

}
