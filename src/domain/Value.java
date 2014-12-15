package domain;

public class Value implements Component {
	private String val;
	
	public Value(String s){
		this.val = s;
	}
	@Override
	public String getValue() {
		return val;
	}

	@Override
	public String getTable() {
		return null;
	}

	@Override
	public String getColumn() {
		return null;
	}
}
