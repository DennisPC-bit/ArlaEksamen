package BE;

/**
 * Author: Carlo De Leon
 * Version: 1.0.0
 */
public class XLSXColumnData implements IColumnData {
    private String columnName;
    private String columnValue;

    public XLSXColumnData(String columnName, String columnValue) {
        setColumnName(columnName);
        setColumnValue(columnValue);
    }

    /**
     * Get the column name.
     *
     * @return Returns the column name.
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Set the column name.
     *
     * @param columnName The column name to use.
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Get the column value.
     *
     * @return Returns the column value.
     */
    public String getColumnValue() {
        return columnValue;
    }

    /**
     * Set the column value.
     *
     * @param columnValue The column value to use.
     */
    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }

    @Override
    public String toString() {
        return String.format("Kolonne: %s, Kolonne værdi: %s", getColumnName(), getColumnValue());
    }
}
