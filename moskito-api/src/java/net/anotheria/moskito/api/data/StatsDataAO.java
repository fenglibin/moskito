package net.anotheria.moskito.api.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Producer stats data container.
 * 
 * @author Alexandr Bolbat
 */
public class StatsDataAO implements Serializable {

	/**
	 * Basic serialVersionUID variable.
	 */
	private static final long serialVersionUID = -1722362535545912297L;

	/**
	 * Stats data name.
	 */
	private final String name;

	/**
	 * Stats data properties.
	 */
	private final Map<String, Number> properties = new HashMap<String, Number>();

	/**
	 * Default constructor.
	 * 
	 * @param aName
	 *            - stats data name
	 */
	public StatsDataAO(final String aName) {
		this.name = aName != null ? aName : "";
	}

	public String getName() {
		return name;
	}

	/**
	 * Add property.
	 * 
	 * @param aName
	 *            - property name
	 * @param aValue
	 *            - property value
	 */
	public void addProperty(final String aName, final Number aValue) {
		properties.put(aName, aValue);
	}

	/**
	 * Get properties names.
	 * 
	 * @return {@link List} of {@link String}
	 */
	public List<String> getPropertiesNames() {
		return new ArrayList<String>(properties.keySet());
	}

	/**
	 * Get property value.
	 * 
	 * @param aName
	 *            - property name
	 * @return {@link Number}
	 */
	public Number getPropertyValue(final String aName) {
		return properties.get(aName);
	}

}