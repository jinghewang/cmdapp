package cn.net.vive.mj;

/**
 * <p/>
 *
 * @author bolen
 * @date 2015/6/13
 * @since 0.1
 */
public enum MyColor2 {
	RED("Hot",2),BLUE("SAD",5);

	private String mood;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	private int index;

	private MyColor2(String mood,int index){
		this.mood = mood;
		this.index = index;
	}
}
