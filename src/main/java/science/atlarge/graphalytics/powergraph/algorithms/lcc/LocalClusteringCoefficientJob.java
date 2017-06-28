package science.atlarge.graphalytics.powergraph.algorithms.lcc;

import java.util.List;

import org.apache.commons.configuration.Configuration;

import science.atlarge.graphalytics.powergraph.PowergraphJob;

public class LocalClusteringCoefficientJob extends PowergraphJob {

	public LocalClusteringCoefficientJob(Configuration config, String verticesPath, String edgesPath, boolean graphDirected, String jobId) {
		super(config, verticesPath, edgesPath, graphDirected, jobId);
	}

	@Override
	protected void addJobArguments(List<String> args) {
		args.add("lcc");
	}
}
