package org.pvg.plasmagraph.utils.graphs;

public final class ChartType {
	/** Reference for a "Pie Graph" Chart. */
	public static final ChartType PIE_GRAPH = new ChartType ("Pie Graph");
	/** Reference for a "XY Graph" Chart. */
	public static final ChartType XY_GRAPH = new ChartType ("XY Graph");
	/** Reference for a "Bar Graph" Chart. */
	public static final ChartType BAR_GRAPH = new ChartType ("Bar Graph");
	/** Reference for a "Line Graph" Chart. */
	public static final ChartType LINE_GRAPH = new ChartType ("Line Graph");
	/** Name of chart type. */
	private String name;
	
	private ChartType (String name) {
		this.name = name;
	}
	
	@Override
	public String toString () {
		return (name);
	}
	
	@Override
	public boolean equals (Object obj) {
		// Same object?
		if (this == obj) { return (true); }
		
		// Not the same class?
		if (!(obj instanceof ChartType )) { return (false); }
		ChartType c = (ChartType) obj;
		
		// Same name?
		if (!this.name.equals(c.toString())) { return (false); }
		
		// Then they're the same type of Graph.
		return (true);
	}
}
