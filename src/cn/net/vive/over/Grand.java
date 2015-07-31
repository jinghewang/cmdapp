package cn.net.vive.over;

import java.io.PipedReader;

/**
 * <p>
 *
 * @author bolen
 * @date 2015/6/14
 * @since 0.1
 */
public class Grand extends Parent {

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	private String nation;

	public Grand(String nation) {
		this.nation = nation;
	}


}
