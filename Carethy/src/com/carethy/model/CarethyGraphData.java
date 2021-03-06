package com.carethy.model;

import java.math.BigDecimal;

import com.jjoe64.graphview.GraphView.GraphViewData;

public class CarethyGraphData {
	private String unit;
	private GraphViewData[] timeSeries;
	private double avg;
	private double high = Integer.MIN_VALUE;
	private double low = Integer.MAX_VALUE;

	public CarethyGraphData(String unit, GraphViewData[] timeSeries) {
		this.unit = unit;
		this.timeSeries = timeSeries;
	}

	public GraphViewData[] getTimeSeries() {
		return timeSeries;
	}

	public void setTimeSeries(GraphViewData[] timeSeries) {
		this.timeSeries = timeSeries;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getAvg() {
		double sum = 0;
		for (GraphViewData data : timeSeries) {
			sum += data.getY();
		}
		int len = timeSeries.length;
		avg = sum / len;

		BigDecimal b = new BigDecimal(avg);
		avg = b.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
		return avg;
	}

	public double getHigh() {
		for (GraphViewData data : timeSeries) {
			if (high < data.getY()) {
				high = data.getY();
			}
		}
		return high;
	}

	public double getLow() {
		for (GraphViewData data : timeSeries) {
			if (low > data.getY()) {
				low = data.getY();
			}
		}
		return low;
	}
}
