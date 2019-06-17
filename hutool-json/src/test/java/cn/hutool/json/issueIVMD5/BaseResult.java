package cn.hutool.json.issueIVMD5;

import java.util.List;

import lombok.Data;

@Data
public class BaseResult<E> {
	
	public BaseResult() {
	}
	
	private int result;
	private List<E> data;
	private E data2;
	private String nextDataUri;
	private String message;
	private int dataCount;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public List<E> getData() {
		return data;
	}
	public void setData(List<E> data) {
		this.data = data;
	}
	public E getData2() {
		return data2;
	}
	public void setData2(E data2) {
		this.data2 = data2;
	}
	public String getNextDataUri() {
		return nextDataUri;
	}
	public void setNextDataUri(String nextDataUri) {
		this.nextDataUri = nextDataUri;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getDataCount() {
		return dataCount;
	}
	public void setDataCount(int dataCount) {
		this.dataCount = dataCount;
	}
	
}