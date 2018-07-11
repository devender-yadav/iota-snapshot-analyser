package com.dev.iota.chart;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import com.dev.iota.Snapshot;
import com.dev.iota.SnapshotProcessor;
import com.dev.iota.util.SnapshotFileReader;

import static com.dev.iota.util.Constants.*;

public class ChartDataGenerator {

	public static CategoryDataset createDataset() {

		SnapshotProcessor processor = new SnapshotProcessor();
		SnapshotFileReader reader = new SnapshotFileReader();
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		addValueToDataset(dataset,
				processor.populateAddressAnalyser(reader.getIotaPerAddressList(SNAPSHOT_AUG_17), AUG_17), AUG_17);

		addValueToDataset(dataset,
				processor.populateAddressAnalyser(reader.getIotaPerAddressList(SNAPSHOT_SEP_17), SEP_17), SEP_17);

		addValueToDataset(dataset,
				processor.populateAddressAnalyser(reader.getIotaPerAddressList(SNAPSHOT_OCT_17), OCT_17), OCT_17);

		addValueToDataset(dataset,
				processor.populateAddressAnalyser(reader.getIotaPerAddressList(SNAPSHOT_JAN_18), JAN_18), JAN_18);

		addValueToDataset(dataset,
				processor.populateAddressAnalyser(reader.getIotaPerAddressList(SNAPSHOT_APR_18), APR_18), APR_18);
		
		addValueToDataset(dataset,
				processor.populateAddressAnalyser(reader.getIotaPerAddressList(SNAPSHOT_JUL_18), JUL_18), JUL_18);
		
		return dataset;
	}

	public static void addValueToDataset(DefaultCategoryDataset dataset, Snapshot addressAnalysis,
			String snapshotName) {
		dataset.addValue(addressAnalysis.getOneTiToOnePi(), snapshotName, ONE_TI_ONE_PI);
		dataset.addValue(addressAnalysis.getHundredGiToOneTi(), snapshotName, HUNDRED_GI_ONE_TI);
		dataset.addValue(addressAnalysis.getTenGiToHundredGi(), snapshotName, TEN_GI_HUNDRED_GI);
		dataset.addValue(addressAnalysis.getOneGiToTenGi(), snapshotName, ONE_GI_TEN_GI);
		dataset.addValue(addressAnalysis.getHundredMiToOneGi(), snapshotName, HUNDRED_MI_ONE_GI);
		dataset.addValue(addressAnalysis.getOneiToHundredMi(), snapshotName, ONE_I_HUNDRED_MI);

	}

}

