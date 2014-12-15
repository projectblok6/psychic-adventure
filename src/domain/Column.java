package domain;

public class Column implements Component {
	private String columnName;
	private String tableName;
	
	public Column(String c, String t){
		this.columnName = c;
		this.tableName = t;
	}

	@Override
	public String getValue() {
		return null;
	}

	@Override
	public String getTable() {
		return tableName;
	}

	@Override
	public String getColumn() {
		return columnName;
	}
}
